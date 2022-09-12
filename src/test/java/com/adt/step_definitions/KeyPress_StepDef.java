package com.adt.step_definitions;

import com.adt.pages.KeyPressPage;
import com.adt.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.Assert;

public class KeyPress_StepDef extends KeyPressPage {



    @Given ("user is on keypress website")
    public void user_is_on_keypress_website(){
        Driver.getDriver().findElement(By.xpath("//a[starts-with(@href, '/key_presses')]")).click();
            }
    @When("a key is pressed")
    public void a_key_is_pressed(){
        Container.sendKeys("Enter");
    }
    @Then ("the key is displayed on the site")
    public void the_key_is_displayed_on_the_site(){
        Assert.assertEquals(KeyDisplayed,"Enter");
    }
}
