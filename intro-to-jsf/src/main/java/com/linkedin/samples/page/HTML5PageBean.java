package com.linkedin.samples.page;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Eyitayo Koleoso
 */
@Named("html5Bean")
@RequestScoped
public class HTML5PageBean {

    private String dateTime;

    private String savedDateTime;

    public void saveField() {
        savedDateTime = dateTime;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getSavedDateTime() {
        return savedDateTime;
    }

    public void setSavedDateTime(String savedDateTime) {
        this.savedDateTime = savedDateTime;
    }

}
