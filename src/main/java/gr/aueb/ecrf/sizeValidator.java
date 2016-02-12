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

@FacesValidator("gr.aueb.ecrf.sizeValidator")
public class sizeValidator implements Validator {

   @Override
   public void validate(FacesContext facesContext,
      UIComponent component, Object value)
      throws ValidatorException {

      if(value.toString().length()!=16){
      FacesMessage msg =
            new FacesMessage("Length of the ID must be 16 characters");
         msg.setSeverity(FacesMessage.SEVERITY_ERROR);
         throw new ValidatorException(msg);
      }
      
   }
}
