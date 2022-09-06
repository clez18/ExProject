package com.adt.pages;

import com.adt.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[starts-with(@href, '/login')]")
    public WebElement Login;

    @FindBy(xpath = "//a[starts-with(@href, '/dropdown')]")
    public WebElement DropD;


}
