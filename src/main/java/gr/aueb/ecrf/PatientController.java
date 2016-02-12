package gr.aueb.ecrf;

import gr.aueb.ecrf.util.MobilePageController;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "patientController")
@ViewScoped
public class PatientController extends AbstractController<Patient> {

    String codePatient;
    Boolean selectedPatient = false;
    Boolean renderDosimetrie = false;
    Boolean renderSortie = false;
    @Inject
    private DosimetrieController dosimetrieController;
    @Inject
    private SortieDeEtudeController sortieDeEtudeController;

    public Boolean getRenderSortie() {
        return renderSortie;
    }

    public void setRenderSortie(Boolean renderSortie) {
        this.renderSortie = renderSortie;
    }
    
    
    public Boolean getRenderDosimetrie() {
        return renderDosimetrie;
    }

    public void setRenderDosimetrie(Boolean renderDosimetrie) {
        this.renderDosimetrie = renderDosimetrie;
    }
    @Inject
    private MobilePageController mobilePageController;

    public Boolean getSelectedPatient() {
        return selectedPatient;
    }

    public void toggleSelectedPatient() {
        this.selectedPatient = true;
    }

    public void clearSelection() {
 this.renderDosimetrie = false;
        this.renderSortie = false;
        dosimetrieController.setSelected(null);
       
        sortieDeEtudeController.setSelected(null);
        
    }

    public PatientController() {
        // Inform the Abstract parent controller of the concrete Patient Entity
        super(Patient.class);
    }

    public void dosimetrieDialog() {
        if (this.selected != null) {
            this.renderDosimetrie = true;
            FacesContext.getCurrentInstance().getExternalContext().getFlash().put("patient", this.selectedPatient);
        }
    }
 public void sortieDialog() {
        if (this.selected != null) {
            this.renderSortie = true;
            FacesContext.getCurrentInstance().getExternalContext().getFlash().put("patient", this.selectedPatient);
        }
    }
    public String navigateVisitCollection() {

        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getFlash().put("patient", this.getSelected());
        }
        String url;
        url = this.mobilePageController.getMobilePagesPrefix() + "/visit/index";
        return url;
    }

    //action listener event
    public void attrListener(ActionEvent event) {
        codePatient = (String) event.getComponent().getAttributes().get("codePatient");
    }

    @Override
    public Patient prepareCreate(ActionEvent event) {
        Patient newItem;
        try {
            newItem = Patient.class.newInstance();
            this.setSelected(newItem);
            initializeEmbeddableKey();
            return newItem;
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
