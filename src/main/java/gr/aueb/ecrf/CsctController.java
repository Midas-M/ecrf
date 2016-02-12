package gr.aueb.ecrf;

import gr.aueb.ecrf.util.MobilePageController;
import java.util.Collection;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "csctController")
@ViewScoped
public class CsctController extends AbstractController<Csct> {
    private Patient selectedPatient; 
    private Visit selectedVisit; 
    @Inject
    private PatientController codepatientController;
    @Inject
    private VisitController visiteController;
    @Inject
    private MobilePageController mobilePageController;
    private Boolean nItemsLimit=false;

    public Boolean getnItemsLimit() {
        return nItemsLimit;
    }

    public void setnItemsLimit(Boolean nItemsLimit) {
        this.nItemsLimit = nItemsLimit;
    }
    
    public CsctController() {
        // Inform the Abstract parent controller of the concrete Csct Entity
      
        super(Csct.class);    
        System.out.println("constructor");
    }

    @PostConstruct
    public void init() {   
       // this.selectedPatient = (Patient) FacesContext.getCurrentInstance().getExternalContext().getFlash().get("patient"); 
        this.selectedPatient=visiteController.getSelectedPatient();
    }
    
    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        //visitController.setSelected(null);
        //codepatientController.setSelected(null);
        //visiteController.setSelected(null);
    }

     public String getCodePatient() {
        return this.selectedPatient.getCodepatient();
    }      
      public void setVisit(Visit v) {   
         this.selectedVisit=v;  
    }
      public String getVisit() {   
        return this.selectedVisit.getNom_visite();   
    }
 
      
    @Override
    public Csct prepareCreate(ActionEvent event) {
        Csct newItem; 
           newItem=new Csct();
           this.selectedPatient=visiteController.getSelectedPatient();
           this.selectedVisit= visiteController.getSelected();
           newItem.setCodepatient(this.selectedPatient);         
           newItem.setVisite(this.selectedVisit);
           newItem.setDateexamen(selectedVisit.getDate());
           
           this.setSelected(newItem);
           initializeEmbeddableKey();
           nItemsLimit=true;
           return newItem;
    }  
    @Override
    public Collection<Csct> getItems() { 
        this.selectedPatient=visiteController.getSelectedPatient();
        this.selectedVisit= visiteController.getSelected(); 
        items = this.ejbFacade.findExams(Csct.class,selectedPatient,selectedVisit);
        if(items.size()>=1)
            nItemsLimit=true;
        else if(items.size()==0)
            nItemsLimit=false;
        return items;
    }  
     @Override
    public void setSelected(Csct selected) { 
        this.selected = selected;  
    }

   @Override
    public Csct getSelected() {
        return this.selected;
    }    
}
