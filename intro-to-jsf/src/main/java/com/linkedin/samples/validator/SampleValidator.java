
package com.linkedin.samples.validator;

import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author SIGINT-X
 */

@FacesValidator("selectValidator")
public class SampleValidator implements Validator {
    


    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
            
        boolean foundSelect = Pattern.compile(Pattern.quote("select"), Pattern.CASE_INSENSITIVE).matcher(value.toString()).find();
        
        if(foundSelect){
            System.out.println("Found select");
            throw new ValidatorException(new FacesMessage("Validation error: found select"));
        }
       
    }

}
