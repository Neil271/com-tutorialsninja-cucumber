package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.CheckOutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CheckOutStep {
    @And("I should see the text “Checkout”")
    public void iShouldSeeTheTextCheckout() {
       /* if (new CheckOutPage().getProductNotAvailableMessage().equals("Products marked with *** are not available in the desired quantity or not in stock!")) {
            System.out.println(new DesktopPage().getProductName() + " is not available in the desired quantity or not in stock!.");
        } else {
            // Verify the text “Checkout”
            new CheckOutPage().getTextOfCheckOut("Checkout", "CheckOut text is not displayed");
        }*/
    }

    @And("I should see the Text “New Customer”")
    public void iShouldSeeTheTextNewCustomer() {

    }

    @And("I Click on Guest Checkout radio button")
    public void iClickOnGuestCheckoutRadioButton() {
        new CheckOutPage().clickOnGuestRadioButton();
    }

    @And("I Click on Continue tab")
    public void iClickOnContinueTab() {
        new CheckOutPage().clickOnContinue();

    }

    @And("I Fill the mandatory fields")
    public void iFillTheMandatoryFields() {
        new CheckOutPage().enterFirstName("Payal");
        new CheckOutPage().enterLastName("Pandya");
        new CheckOutPage().enterEmailAddress("Ppatel112@gmail.com");
        new CheckOutPage().enterTelephone("2323232323");
        new CheckOutPage().enterAddress("232d Dream street");
        new CheckOutPage().enterCityName("London");
        new CheckOutPage().enterPostCode("HA5 0QQ");
        new CheckOutPage().selectCountry("United Kingdom");
        new CheckOutPage().selectRegion("Bedfordshire");
    }

    @And("I Click on Continue Button")
    public void iClickOnContinueButton() {
        new CheckOutPage().clickOnContinueButtonForGuest();
        new CheckOutPage().clickOnContinueButtonForDelivery();
    }

    @And("I Add Comments About your order into text area")
    public void iAddCommentsAboutYourOrderIntoTextArea() {
        new CheckOutPage().enterCommentInTextBox("This is comment");
    }

    @And("I Check the Terms & Conditions check box")
    public void iCheckTheTermsConditionsCheckBox() {
        new CheckOutPage().clickOnTerms();
    }

    @And("I Click on the Continue button")
    public void iClickOnTheContinueButton() {
        new CheckOutPage().clickOnContinueButtonForPayment();
    }

    @Then("I should see the message Warning: Payment method required!")
    public void iShouldSeeTheMessageWarningPaymentMethodRequired() {
    }

}
