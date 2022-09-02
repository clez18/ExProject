
package com.adt.step_definitions;

import com.adt.pages.BasePage;
import com.adt.pages.LoginPage;
import com.adt.utilities.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;

public class Login_StepDef extends LoginPage {


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
       Driver.getDriver().findElement(By.xpath("//a[starts-with(@href, '/login')]")).click();

   }
    @When("user enters tomsmith username")
    public void user_enters_tomsmith_username() {
        username.sendKeys("tomsmith");
    }
    @And("user enters SuperSecretPassword password")
    public void user_enters_super_secret_password_password() {
        password.sendKeys("SuperSecretPassword");
    }
    @Then("user should see the successful login")
    public void user_should_see_the_successful_login() {
        loginButton.click();
    }

}
