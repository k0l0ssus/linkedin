package com.linkedin.samples.converter;

import com.linkedin.samples.dao.DessertLoaderDAO;
import com.linkedin.samples.dto.Dessert;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author SIGINT-X
 */
@Named("dessertConverter")
public class DessertConverter implements Converter {

    @Inject
    DessertLoaderDAO dessertLoader;

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {

        Dessert theDessertToReturn = null;

        try {
            theDessertToReturn = dessertLoader.findDessertById(Long.parseLong(value));
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new ConverterException(ex.getMessage());
        }

        if (theDessertToReturn == null) {
            throw new ConverterException("Not a valid dessert");
        }
        return theDessertToReturn;

    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value != null && value instanceof Dessert) {
            System.out.println("Converting dessert");
            //Dessert loadedDessert = dessertLoader.findDessertById(Long.parseLong(value.toString()));
            return ((Dessert)value).getDessertName();
        }

        System.out.println("Not converting dessert");
        return String.valueOf(value);
    }

}
