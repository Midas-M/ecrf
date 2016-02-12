package gr.aueb.ecrf;

import gr.aueb.ecrf.util.MobilePageController;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "consultationController")
@ViewScoped
public class ConsultationController extends AbstractController<Consultation> {

    @Inject
    private PatientController codepatientController;
    @Inject
    private VisitController visitController;

    @Inject
    private MobilePageController mobilePageController;
    private Patient selectedPatient;
    private Visit selectedVisit;
    private Boolean nItemsLimit = false;

    public Boolean getnItemsLimit() {
        return nItemsLimit;
    }

    public void setnItemsLimit(Boolean nItemsLimit) {
        this.nItemsLimit = nItemsLimit;
    }

    public ConsultationController() {
        // Inform the Abstract parent controller of the concrete Consultation Entity
        super(Consultation.class);
    }

    @PostConstruct
    public void init() {
        // this.selectedPatient = (Patient) FacesContext.getCurrentInstance().getExternalContext().getFlash().get("patient"); 
        this.selectedPatient = visitController.getSelectedPatient();
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        //codepatientController.setSelected(null);
        //visitController.setSelected(null);
    }

    public String getCodePatient() {
        return this.selectedPatient.getCodepatient();
    }

    public void setVisit(Visit v) {
        this.selectedVisit = v;
    }

    public String getVisit() {
        return this.selectedVisit.getNom_visite();
    }

    @Override
    public Collection<Consultation> getItems() {

        this.selectedPatient = visitController.getSelectedPatient();
        this.selectedVisit = visitController.getSelected();
        items = this.ejbFacade.findExams(Consultation.class, selectedPatient, selectedVisit);
        if (items.size() >= 1) {
            nItemsLimit = true;
        } else if (items.size() == 0) {
            nItemsLimit = false;
        }
        return items;
    }

    @Override
    public Consultation prepareCreate(ActionEvent event) {
        Consultation newItem;
        try {
            newItem = Consultation.class.newInstance();
            this.selectedPatient = visitController.getSelectedPatient();
            this.selectedVisit = visitController.getSelected();
            newItem.setCodepatient(this.selectedPatient);
            newItem.setVisite(selectedVisit);
            newItem.setDateexamen(selectedVisit.getDate());

            this.setSelected(newItem);
            initializeEmbeddableKey();
            nItemsLimit = true;
            return newItem;
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
