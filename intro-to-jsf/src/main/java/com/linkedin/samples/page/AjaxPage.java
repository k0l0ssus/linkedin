
package com.linkedin.samples.page;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author SIGINT-X
 */

@ViewScoped
@Named("ajaxBean")
public class AjaxPage implements Serializable {
    
    private String theInputValue;

    public String getTheInputValue() {
        return theInputValue;
    }

    public void setTheInputValue(String theInputValue) {
        this.theInputValue = theInputValue;
    }

}
