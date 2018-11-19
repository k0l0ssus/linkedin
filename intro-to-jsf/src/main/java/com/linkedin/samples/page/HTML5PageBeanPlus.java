package com.linkedin.samples.page;

import java.time.LocalDateTime;
import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Eyitayo Koleoso
 */
@Named("html5BeanPlus")
@RequestScoped
public class HTML5PageBeanPlus {

    private Date dateTime;

    private Date savedDateTime;


    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Date getSavedDateTime() {
        return savedDateTime;
    }

    public void setSavedDateTime(Date savedDateTime) {
        this.savedDateTime = savedDateTime;
    }

}
