package com.linkedin.samples.page;

import com.linkedin.samples.dao.DessertLoaderDAO;
import com.linkedin.samples.dto.Dessert;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.html.HtmlInputSecret;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Eyitayo Koleoso
 */
@RequestScoped
@Named("componentListing")
public class InputComponentPageBean {

    private String password1;

    private HtmlInputSecret secret = new HtmlInputSecret();

    private long selectOneRadioSelection;

    private long selectOneMenuSelection;

    private long selectListBoxSelection;

    private long selectOneMenu;

    private Dessert radioButtonDessert;

    private Dessert listBoxDessert;

    private List<Dessert> selectManyDesserts;

    private List<Long> selectManyCheckboxSelections = new LinkedList<>();

    private String inputTextAreaText;

    private BigDecimal moneyInput;
    
    private Dessert selectedDessert;

    @Inject
    private DessertLoaderDAO dessertLoader;

    @PostConstruct
    public void init() {
        secret.setDisabled(true);
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getInputTextAreaText() {
        return inputTextAreaText;
    }

    public void setInputTextAreaText(String inputTextAreaText) {
        this.inputTextAreaText = inputTextAreaText;
    }

    public long getSelectOneRadioSelection() {
        return selectOneRadioSelection;
    }

    public void setSelectOneRadioSelection(long selectOneRadioSelection) {
        this.selectOneRadioSelection = selectOneRadioSelection;
    }

    public long getSelectOneMenuSelection() {
        return selectOneMenuSelection;
    }

    public void setSelectOneMenuSelection(long selectOneMenuSelection) {
        this.selectOneMenuSelection = selectOneMenuSelection;
    }

    public long getSelectListBoxSelection() {
        return selectListBoxSelection;
    }

    public void setSelectListBoxSelection(long selectListBoxSelection) {
        this.selectListBoxSelection = selectListBoxSelection;
    }

    public long getSelectOneMenu() {
        return selectOneMenu;
    }

    public void setSelectOneMenu(long selectOneMenu) {
        this.selectOneMenu = selectOneMenu;
    }

    public List<Long> getSelectManyCheckboxSelections() {
        return selectManyCheckboxSelections;
    }

    public void setSelectManyCheckboxSelections(List<Long> selectManyCheckboxSelections) {
        this.selectManyCheckboxSelections = selectManyCheckboxSelections;
    }

    public HtmlInputSecret getSecret() {
        return secret;
    }

    public void setSecret(HtmlInputSecret secret) {
        this.secret = secret;
    }

    public void setDessertObject(long dessertId) {
        Dessert selectedDessert = dessertLoader.findDessertById(dessertId);
    }

    public Dessert getRadioButtonDessert() {
        return radioButtonDessert;
    }

    public void setRadioButtonDessert(Dessert radioButtonDessert) {
        this.radioButtonDessert = radioButtonDessert;
    }

    public Dessert getListBoxDessert() {
        return listBoxDessert;
    }

    public void setListBoxDessert(Dessert listBoxDessert) {
        this.listBoxDessert = listBoxDessert;
    }

    public List<Dessert> getSelectManyDesserts() {
        return selectManyDesserts;
    }

    public void setSelectManyDesserts(List<Dessert> selectManyDesserts) {
        this.selectManyDesserts = selectManyDesserts;
    }

    public DessertLoaderDAO getDessertLoader() {
        return dessertLoader;
    }

    public void setDessertLoader(DessertLoaderDAO dessertLoader) {
        this.dessertLoader = dessertLoader;
    }

    public BigDecimal getMoneyInput() {
        return moneyInput;
    }

    public void setMoneyInput(BigDecimal moneyInput) {
        this.moneyInput = moneyInput;
    }

    public Dessert getSelectedDessert() {
        return selectedDessert;
    }

    public void setSelectedDessert(Dessert selectedDessert) {
        this.selectedDessert = selectedDessert;
    }

   

}
