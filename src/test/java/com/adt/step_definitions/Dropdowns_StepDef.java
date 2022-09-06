package com.adt.step_definitions;

import com.adt.pages.DropDownsPage;
import com.adt.utilities.ConfigurationReader;
import com.adt.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdowns_StepDef extends DropDownsPage {

    @Given("user is on Dropdowns List page")
    public void user_is_on_dropdowns_list_page() {
        Driver.getDriver().findElement(By.xpath("//a[starts-with(@href, '/dropdown')]")).click();

    }
    @When("user clicks option one from simple dropdown")
    public void user_clicks_option_from_simple_dropdown() {
        Select opt = new Select(selectDrop);
        opt.selectByVisibleText("Option 1");

        String assOpt1 = opt.getFirstSelectedOption().getText();
        Assert.assertEquals("Option 1", assOpt1);

    }
    @When("user clicks {int}, October, and {int} from select your date of birth")
    public void user_clicks_october_and_from_select_your_date_of_birth(Integer int1, Integer int2) {
        Select yr = new Select(selectYear);
        yr.selectByVisibleText("2000");

        Select month = new Select(selectMonth);
        month.selectByVisibleText("October");

        Select day = new Select(selectDay);
        day.selectByVisibleText("31");

    }
    @When("user clicks Texas from state selection")
    public void user_clicks_texas_from_state_selection() {
        Select state = new Select(selectState);
        state.selectByVisibleText("Texas");

        String ass2 = state.getFirstSelectedOption().getText();
        Assert.assertEquals("Texas", ass2);

    }
    @When("user clicks Java from which programming languages do you know?")
    public void user_clicks_java_from_which_programming_languages_do_you_know() {
        Select langs = new Select(selectLang);
        langs.selectByVisibleText("Python");
        langs.selectByIndex(0);

    }
    @Then("user should assert selected dropdowns to verify")
    public void user_should_assert_selected_dropdowns_to_verify() {
        // asserted in lines above except for user clicks Java from which programming languages do you know?
    }

}
