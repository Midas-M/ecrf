/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.aueb.ecrf;

/**
 *
 * @author Midas
 */
import java.net.URI;
import java.net.URISyntaxException;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("gr.aueb.ecrf.maxminValidator")
public class maxminValidator implements Validator {

    @Override
    public void validate(FacesContext facesContext,
            UIComponent component, Object value)
            throws ValidatorException {

        String min = (String) component.getAttributes().get("min");
        String max = (String) component.getAttributes().get("max");
        if (value != null) {

            String val = value.toString();
            Integer minInt = Integer.valueOf(min);
            Integer maxInt = Integer.valueOf(max);

            Float valueInt;
            try {
                System.out.println(value);
                valueInt = Float.valueOf(value.toString());

            } catch (Exception e) {
                FacesMessage msg
                        = new FacesMessage("Please enter an Float between " + min + " and " + max);
                msg.setSeverity(FacesMessage.SEVERITY_ERROR);
                throw new ValidatorException(msg);
            }

            if (valueInt < minInt || valueInt > maxInt) {
                if (valueInt != -1000.0) {
                    FacesMessage msg
                            = new FacesMessage("The value must be between " + min + " and " + max);
                    msg.setSeverity(FacesMessage.SEVERITY_ERROR);
                    throw new ValidatorException(msg);
                }
            }

        }
    }

}
