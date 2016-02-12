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

@Named(value = "irmController")
@ViewScoped
public class IrmController extends AbstractController<Irm> {

    @Inject
    private PatientController codepatientController;
    @Inject
    private VisitController visiteController;
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

    public IrmController() {
        // Inform the Abstract parent controller of the concrete Irm Entity
        super(Irm.class);
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

    /**
     * Sets the "selected" attribute of the Patient controller in order to
     * display its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareCodepatient(ActionEvent event) {
        if (this.getSelected() != null && codepatientController.getSelected() == null) {
            codepatientController.setSelected(this.getSelected().getCodepatient());
        }
    }

    /**
     * Sets the "selected" attribute of the Visit controller in order to display
     * its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareVisite(ActionEvent event) {
        if (this.getSelected() != null && visiteController.getSelected() == null) {
            visiteController.setSelected(this.getSelected().getVisite());
        }
    }

    /**
     * Sets the "selected" attribute of the Visit controller in order to display
     * its data in its View dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareVisit(ActionEvent event) {
        if (this.getSelected() != null && visitController.getSelected() == null) {
            visitController.setSelected(this.getSelected().getVisit());
        }
    }

    @Override
    public Collection<Irm> getItems() {
        //System.out.println("Loading exam data");     
        this.selectedPatient = visitController.getSelectedPatient();
        this.selectedVisit = visitController.getSelected();
        items = this.ejbFacade.findExams(Irm.class, selectedPatient, selectedVisit);
        if (items.size() >= 1) {
            nItemsLimit = true;
        } else if (items.size() == 0) {
            nItemsLimit = false;
        }
        return items;
    }

    @Override
    public Irm prepareCreate(ActionEvent event) {
        Irm newItem;
        try {
            newItem = Irm.class.newInstance();
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
