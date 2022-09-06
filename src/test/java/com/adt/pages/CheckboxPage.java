package com.adt.pages;

import com.adt.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxPage {
    public CheckboxPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy (xpath = "//*[@name='checkbox1']")
    public WebElement checkBox1;

    @FindBy(xpath = "//*[@name='checkbox2']")
    public WebElement checkbox2;



}
