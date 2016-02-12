package gr.aueb.ecrf;

import gr.aueb.ecrf.util.MobilePageController;
import java.util.Collection;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "dosimetrieController")
@ViewScoped
public class DosimetrieController extends AbstractController<Dosimetrie> {

    @Inject
    private MobilePageController mobilePageController;
    private Patient selectedPatient; 
     @Inject
    private PatientController codepatientController;
    private Boolean nItemsLimit=false;

    public Boolean getnItemsLimit() {
        return nItemsLimit;
    }

    public void setnItemsLimit(Boolean nItemsLimit) {
        this.nItemsLimit = nItemsLimit;
    }
    public DosimetrieController() {
        // Inform the Abstract parent controller of the concrete Dosimetrie Entity
        super(Dosimetrie.class);
    }

    @Override
    public Dosimetrie prepareCreate(ActionEvent event) {
        Dosimetrie newItem; 
           newItem=new Dosimetrie();
           this.selectedPatient=codepatientController.getSelected(); 
           newItem.setCodepatient(this.selectedPatient);   
           this.setSelected(newItem);
           initializeEmbeddableKey();
            nItemsLimit=true;
           return newItem;
    }  
    @Override
    public Collection<Dosimetrie> getItems() { 
        this.selectedPatient=codepatientController.getSelected();
        if(selectedPatient!=null)
            items = this.ejbFacade.findDosimetrie(Dosimetrie.class,selectedPatient);
        if(items.size()>=1)
            nItemsLimit=true;
        else if(items.size()==0)
            nItemsLimit=false;
        return items;
        
       
    }  

}
