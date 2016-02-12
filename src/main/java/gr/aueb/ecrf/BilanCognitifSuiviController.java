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

@Named(value = "bilanCognitifSuiviController")
@ViewScoped
public class BilanCognitifSuiviController extends AbstractController<BilanCognitifSuivi> {

    @Inject
    private VisitController visitController;
    @Inject
    private PatientController codepatientController;
    @Inject
    private VisitController visiteController;
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

    public BilanCognitifSuiviController() {
        // Inform the Abstract parent controller of the concrete BilanCognitifSuivi Entity
        super(BilanCognitifSuivi.class);
    }

    @PostConstruct
    public void init() {
        // this.selectedPatient = (Patient) FacesContext.getCurrentInstance().getExternalContext().getFlash().get("patient"); 
        this.selectedPatient = visiteController.getSelectedPatient();
    }

    public void setVisit(Visit v) {
        this.selectedVisit = v;
    }

    public String getVisit() {
        return this.selectedVisit.getNom_visite();
    }

    public String getCodePatient() {
        return this.selectedPatient.getCodepatient();
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {

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

    @Override
    public Collection<BilanCognitifSuivi> getItems() {

        this.selectedPatient = visiteController.getSelectedPatient();
        this.selectedVisit = visiteController.getSelected();
        items = this.ejbFacade.findExams(BilanCognitifSuivi.class, selectedPatient, selectedVisit);
        if (items.size() >= 1) {
            nItemsLimit = true;
        } else if (items.size() == 0) {
            nItemsLimit = false;
        }
        return items;
    }

    @Override
    public BilanCognitifSuivi prepareCreate(ActionEvent event) {
        BilanCognitifSuivi newItem;
        try {
            this.selectedPatient = visiteController.getSelectedPatient();
            this.selectedVisit = visiteController.getSelected();
            newItem = BilanCognitifSuivi.class.newInstance();
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
