package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

    @Given("User should be on the login page")
    public void user_should_be_on_the_login_page() {
        System.out.println("I am on the login page");

    }

    @When("User enters driver user name and password")
    public void user_enter_user_name_and_password() {
        System.out.println("I driver username and password");

    }

    @Then("User click on login button")
    public void user_click_on_login_button() {
        System.out.println("Click on login buttton");

    }

    @Then("User should be able to enter home page")
    public void user_shoul_be_able_to_enter_home_page() {
        System.out.println("I am on the home page");

    }

    @When("User enters sales manager user name and password")
    public void user_enters_sales_manager_user_name_and_password() {
        System.out.println("I enter sales manager user name and password");

    }

    @When("User enters store manager user name and password")
    public void user_enters_store_manager_user_name_and_password() {
        System.out.println("I enter store manager user name and password");
    }


}
