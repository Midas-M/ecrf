/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.aueb.ecrf;

import java.util.Objects;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Midas
 */
@FacesConverter("gr.aueb.ecrf.booleanConverter")
public class booleanConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value != null) {
            if (value.equals("true")) {
                return true;
            } else {
                return false;
            }
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
     if (value != null) {
            if (Objects.equals(Boolean.valueOf(value.toString()), Boolean.valueOf("true"))) {
                return "true";
            } else {
                return "false";
            }
        }
        return null;
    }

}
