package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.CommonElementPage;
import com.tutorialsninja.demo.pages.LoginPage;
import com.tutorialsninja.demo.pages.MyAccountPage;
import com.tutorialsninja.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MyAccountStep {
    @When("I click on My Account Link.")
    public void iClickOnMyAccountLink() {
        new CommonElementPage().clickOnMyAccountLink();
    }

    @And("I call the method “selectMyAccountOptions” method and pass the parameter “Register”")
    public void iCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameterRegister() {
        new CommonElementPage().selectMyAccountOption("Register");
    }

    @Then("I should see the text “Register Account”.")
    public void iShouldSeeTheTextRegisterAccount() {
        String expectedText = "Register Account";
        Assert.assertEquals(new RegisterPage().getRegisterText(), expectedText, "Register Account text not displayed");
    }

    @And("I call the method “selectMyAccountOptions” method and pass the parameter “Login”")
    public void iCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameterLogin() {
        new CommonElementPage().selectMyAccountOption("Login");
    }

    @Then("I should see the text “Returning Customer”.")
    public void iShouldSeeTheTextReturningCustomer() {
        String expectedText = "Returning Customer";
        Assert.assertEquals(new LoginPage().getLoginText(), expectedText, "Returning Customer text not displayed");
    }

    @And("I Enter First Name")
    public void iEnterFirstName() {
        new RegisterPage().enterFirstName("Rita");
    }

    @And("I Enter Last Name")
    public void iEnterLastName() {
        new RegisterPage().enterLastName("Kohli");
    }

    @And("I Enter Email")
    public void iEnterEmail() {
        new RegisterPage().enterEmail("gbgbfr33@yahoo.com");
    }

    @And("I Enter Telephone")
    public void iEnterTelephone() {
        new RegisterPage().enterTelephone("8786758");
    }

    @And("I Enter Password")
    public void iEnterPassword() {
        new RegisterPage().enterPassword("232323223");
    }

    @And("I Enter Password Confirm")
    public void iEnterPasswordConfirm() {
        new RegisterPage().enterConfirmPassword("232323223");
    }

    @And("I select Subscribe Yes radio button")
    public void iSelectSubscribeYesRadioButton() {
        new RegisterPage().clickOnTheYesRadioButton();
    }

    @And("I click on Privacy Policy check box")
    public void iClickOnPrivacyPolicyCheckBox() {
        new RegisterPage().clickOnThePrivacyCheckbox();
    }

    @And("I click on Continue button")
    public void iClickOnContinueButton() {
        new RegisterPage().clickOnContinueButton();
    }

   /* @And("I shouls see the message “Your Account Has Been Created!”")
    public void iShoulsSeeTheMessageYourAccountHasBeenCreated() {
        String expectedText = "Your Account Has Been Created!";
        //().getRegisterSuccessfulText(), expectedText, "The message your account has been created is not displayed");
        String actualText=new RegisterPage().getRegisterSuccessfulText();
        Assert.assertEquals(actualText,expectedText,"not diplayed");
    }*/

    @And("I click on Continue Successfully button")
    public void iClickOnContinueSuccessfullyButton() {
        new RegisterPage().clickOnContinueButtonAfterSuccessfulAccountCreated();
    }

    @And("I call the method “selectMyAccountOptions” method and pass the parameter “Logout”")
    public void iCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameterLogout() {
        new CommonElementPage().selectMyAccountOption("Logout");
    }

    @And("I should see the text “Account Logout”")
    public void iShouldSeeTheTextAccountLogout() {
        String expectedText = "Account Logout";
        Assert.assertEquals(new CommonElementPage().getLogoutText(), expectedText, "The logout message is not displayed");
    }

    @Then("I click on Continue Last button")
    public void iClickOnContinueLastButton() {
        new CommonElementPage().clickOnContinueButton();
    }

    @And("I click on Login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @And("I should see the text “My Account”")
    public void iShouldSeeTheTextMyAccount() {
        String expectedText="My Account";
        Assert.assertEquals(new MyAccountPage().getMyAccountText(),expectedText,"My account text is not displayed");
    }
}
