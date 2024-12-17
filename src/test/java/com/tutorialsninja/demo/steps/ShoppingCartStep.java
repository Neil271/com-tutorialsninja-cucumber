package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.DesktopPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ShoppingCartStep {
    @And("I should see the text {string}")
    public void iShouldSeeTheText(String p) {

    }

    @And("I should see the Product name {string}")
    public void iShouldSeeTheProductName(String product) {
        Assert.assertEquals(new DesktopPage().getProductName(),product,"The product name macbook is not displayed");
    }

    @And("I should see the Model {string}")
    public void iShouldSeeTheModel(String arg0) {
    }

    @Then("I should see the Total {string}")
    public void iShouldSeeTheTotal(String p) {

    }
}
