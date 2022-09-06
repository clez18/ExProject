package com.adt.step_definitions;

import com.adt.pages.CheckboxPage;
import com.adt.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class CheckBox_StepDef extends CheckboxPage {

    @Given("user is on checkbox page")
    public void user_is_on_checkbox_page() {
        Driver.getDriver().findElement(By.xpath("//a[starts-with(@href, '/checkboxes')]")).click();
    }
    @When("user clicks check box {int}")
    public void user_clicks_check_box(Integer int1) {
        checkBox1.click();
    }
    @When("user unclicks check box {int}")
    public void user_unclicks_check_box(Integer int1) {
        checkbox2.click();
    }
    @Then("user will have only check box {int} clicked")
    public void user_will_have_only_check_box_clicked(Integer int1) {
        if(!(checkBox1.isSelected() == checkbox2.isSelected()) ){
            System.out.println("Yay");
        }
    }
}
