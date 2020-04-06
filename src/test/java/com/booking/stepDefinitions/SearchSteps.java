package com.booking.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchSteps {

    WebDriver driver;

    @Given("I am on rentalcars homepage")
    public void i_am_on_rentalcars_homepage() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.navigate().to ("https://www.rentalcars.com/");

    }

    @Given("I leave the location empty")
    public void i_leave_the_location_empty() {

    }

    @Given("I enter a {string} of my choice")
    public void i_enter_a_of_my_choice(String string) {

    }

    @Given("I enter the Pick-up Date as {string}")
    public void i_enter_the_Pick_up_Date_as(String string) {

    }
    @Given("I enter Drop off Date as {string}")
    public void i_enter_Drop_off_Date_as(String string) {

    }
    @When("I click on the search button")
    public void i_click_on_the_search_button() {

    }
    @Then("I am prompted to {string}")
    public void i_am_prompted_to(String string) {

    }

    @Then("the results of the rentals cars are displayed")
    public void the_results_of_the_rentals_cars_are_displayed()
    {

    }


}
