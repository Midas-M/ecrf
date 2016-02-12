package gr.aueb.ecrf;

import gr.aueb.ecrf.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "usersController")
@ViewScoped
public class UsersController extends AbstractController<Users> {

    @Inject
    private MobilePageController mobilePageController;

    public UsersController() {
        // Inform the Abstract parent controller of the concrete Users Entity
        super(Users.class);
    }

}
