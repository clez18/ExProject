package com.adt.pages;

import com.adt.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownsPage {

    public DropDownsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "dropdown")
    public WebElement selectDrop;

    @FindBy(id = "year")
    public WebElement selectYear;

    @FindBy(id = "month")
    public WebElement selectMonth;

    @FindBy(id = "day")
    public WebElement selectDay;

    @FindBy(id = "state")
    public WebElement selectState;

    @FindBy(name = "Languages")
    public WebElement selectLang;






}
