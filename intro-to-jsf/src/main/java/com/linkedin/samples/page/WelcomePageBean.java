package com.linkedin.samples.page;

import java.security.Principal;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author SIGINT-X
 */
@RequestScoped
@Named("namePage")
public class WelcomePageBean {

    @Inject
    transient private HttpServletRequest request;

    @Inject
    transient private Principal creds;

    private String givenName;

    private String completeGreeting;

    public void sayHello() {
        completeGreeting = "Hello " + givenName;
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,completeGreeting+"! ","Let's learn JSF together,"+givenName+"!");
        FacesContext.getCurrentInstance().addMessage("nameInput", message);
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public void setCompleteGreeting(String completeGreeting) {
        this.completeGreeting = completeGreeting;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getCompleteGreeting() {
        return completeGreeting;
    }

}
