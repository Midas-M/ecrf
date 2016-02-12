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
@FacesConverter("gr.aueb.ecrf.maxminConverter")
public class maxminConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        System.out.println("converter object");
        if (value != null) {
            if (value.equals("NA")) {
                return (float) -1000.0;
            } else {
                return value;
            }
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        System.out.println("converter String");
     if (value != null) {
         System.out.println(value);
            if (Objects.equals(Float.valueOf(value.toString()), Float.valueOf("-1000.0"))) {
                return "NA";
            } else {
                return value.toString();
            }
        }
        return null;
    }

}
