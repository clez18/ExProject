package com.adt.pages;
import com.adt.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KeyPressPage {
    public KeyPressPage(){
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy (xpath = "//*[@id='result']")
    public WebElement KeyDisplayed;

    @FindBy (xpath = "//*[@class='container']")
    public WebElement Container;



}
