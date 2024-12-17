package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TopMenuStep {
    @Given("I am on homepage")
    public void iAmOnHomepage() {

    }

    @When("I mouse hover on “Desktops” Tab and click")
    public void iMouseHoverOnDesktopsTabAndClick() {
        new HomePage().mouseHoverAndClickOnDesktop();
    }

    @And("I call selectMenu method and pass the menu = “Show All Desktops”")
    public void iCallSelectMenuMethodAndPassTheMenuShowAllDesktops() {
        new HomePage().selectMenu("Show AllDesktops");
    }

    @Then("I should see the text ‘Desktops’")
    public void iShouldSeeTheTextDesktops() {
        String expectedText = "Desktops";
        String actualText = new HomePage().getMenuTabText();
        Assert.assertEquals(actualText, expectedText, "Desktops text not displayed");
    }

    @When("I mouse hover on “Laptops & Notebooks” Tab and click")
    public void iMouseHoverOnLaptopsNotebooksTabAndClick() {
        new HomePage().mouseHoverAndClickOnLaptopAndNoteBook();
    }

    @And("I call selectMenu method and pass the menu = “Show All Laptops & Notebooks”")
    public void iCallSelectMenuMethodAndPassTheMenuShowAllLaptopsNotebooks() {
        new HomePage().selectMenu("Show AllLaptops & Notebooks");
    }

    @Then("I should see the text ‘Laptops & Notebooks’")
    public void iShouldSeeTheTextLaptopsNotebooks() {
        String expectedText = "Laptops & Notebooks";
        String actualText = new HomePage().getMenuTabText();
        Assert.assertEquals(actualText, expectedText, "Laptops & Notebooks text not displayed");
    }

    @When("I Mouse hover on “Components” Tab and click")
    public void iMouseHoverOnComponentsTabAndClick() {
        new HomePage().mouseHoverAndClickOnComponents();
    }

    @And("I call selectMenu method and pass the menu = “Show All Components”")
    public void iCallSelectMenuMethodAndPassTheMenuShowAllComponents() {
        new HomePage().selectMenu("Show AllComponents");
    }

    @Then("I should see the text ‘Components’")
    public void iShouldSeeTheTextComponents() {
        String expectedText = "Components";
        String actualText = new HomePage().getMenuTabText();
        Assert.assertEquals(actualText, expectedText, "Components text not displayed");
    }

    @When("I Mouse hover on Currency Dropdown and click")
    public void iMouseHoverOnCurrencyDropdownAndClick() {
        new HomePage().mouseHoverAndClickOnCurrency();
    }

    @And("I Mouse hover on £Pound Sterling and click")
    public void iMouseHoverOn£PoundSterlingAndClick() {
        new HomePage().mouseHoverAndClickOnPoundCurrency();
    }
}
