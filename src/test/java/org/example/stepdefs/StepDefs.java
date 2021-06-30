package org.example.stepdefs;

import io.cucumber.java8.En;
import io.cucumber.spring.CucumberContextConfiguration;
import org.example.pages.GoogleSearchPage;
import org.example.pages.SearchResultsPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

public class StepDefs implements En {

    @Autowired
    GoogleSearchPage googleSearchPage;

    @Autowired
    SearchResultsPage searchResultsPage;

    public StepDefs() {

        Given("^User is on Google search page$", () -> {
            googleSearchPage.openURL();
        });

        When("^User searches for Selenium$", () -> {
            googleSearchPage.searchFor("Selenium");
        });

        Then("^User can see Selenium results$", () -> {
            Assert.assertTrue(searchResultsPage.lnkSelenium.isDisplayed());
        });
    }
}