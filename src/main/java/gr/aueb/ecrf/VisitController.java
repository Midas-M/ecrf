package gr.aueb.ecrf;

import gr.aueb.ecrf.util.MobilePageController;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import org.primefaces.context.RequestContext;

@Named(value = "visitController")
@ViewScoped
public class VisitController extends AbstractController<Visit> {
    private Boolean renderCsct=false;
    private Boolean selectedVisit=false;
    @Inject
    private IrmController irmController;
    
    @Inject
    private ConsultationController consultationController;
    @Inject
    private BilanCognitifLbController bilanCognitifLbControllerController;
   @Inject
    private BilanCognitifSuiviController bilanCognitifSuiviControllerController;
   
   
    public Boolean getRenderCsct() {
        return renderCsct;
    }

    public Boolean getSelectedVisit() {
        return selectedVisit;
    }
    public void setRenderCsct(Boolean renderCsct) {
        this.renderCsct = renderCsct;
    }
    @Inject
    private PatientController patientController;
    @Inject
    private CsctController csctController;
    @Inject
    private MobilePageController mobilePageController;
    private Patient selectedPatient;

    public VisitController() {
        // Inform the Abstract parent controller of the concrete Visit Entity
        super(Visit.class); 
        this.renderCsct=false;
    }
    @PostConstruct
    public void init() {     
        Patient patient = (Patient) FacesContext.getCurrentInstance().getExternalContext().getFlash().get("patient"); 
        this.selectedPatient=patient;
       
    }
    
    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
  /**
     * Retrieve the currently selected item.
     *
     * @return  the currently selected Entity
     */
    @Override
    public Visit getSelected() {
        return this.selected;
    }

    /**
     * Pass in the currently selected item.
     *
     * @param selected  the Entity that should be set as selected
     */
    @Override
    public void setSelected(Visit selected) {
        csctController.setVisit(selected);
        this.selected = selected;  
    }
    
    public Patient getSelectedPatient() {       
        return this.selectedPatient; 
    }     

    public String getCodePatient() {       
        return this.selectedPatient.getCodepatient(); 
    }       

    public String goBackBtn(){
	resetParents();
        String url = this.mobilePageController.getMobilePagesPrefix() +"/patient/index?faces-redirect=true";
        return url;
  }
   
    public void resetParents() {

    }
    
    public void clearSelection(){
        this.renderCsct=false;
        csctController.setSelected(null);
        irmController.setSelected(null);
         
        consultationController.setSelected(null);
        bilanCognitifLbControllerController.setSelected(null);
        bilanCognitifSuiviControllerController.setSelected(null);
        
    }
    
     public void examDialog() {
        if(this.selected!=null){       
            this.renderCsct=true;
            FacesContext.getCurrentInstance().getExternalContext().getFlash().put("patient", this.selectedPatient);      
        } 
    }
  public void toggleSelectedVisit() {
         System.out.println(selectedPatient);
        this.selectedVisit = true;
         System.out.println(selectedPatient);
    }
   
    @Override
    public Visit prepareCreate(ActionEvent event) {
        Visit newItem;
        try {
           newItem = Visit.class.newInstance();         
           newItem.setCodepatient(this.selectedPatient);
           this.setSelected(newItem);
            initializeEmbeddableKey();
            return newItem;
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Override
    public Collection<Visit> getItems() {
        if(this.selectedPatient==null){
             RequestContext context = RequestContext.getCurrentInstance();
             context.execute("PF('dlg2').show();");
             return null;
        }
        if (items == null) {
            items = this.ejbFacade.findVisits(this.selectedPatient);
        }
        return items;
    }
}
