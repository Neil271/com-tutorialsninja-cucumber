package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register Account']")
    WebElement registerText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-firstname']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-lastname']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-email']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-telephone']")
    WebElement telephone;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-confirm']")
    WebElement cPassword;

    @CacheLookup
    @FindBy(css = "input[value='1'][name='newsletter']")
    WebElement yesRadio;

    @CacheLookup
    @FindBy(xpath = "//input[@name='agree']")
    WebElement privacyCheckBox;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(css = "div[id='content'] h1")
    WebElement registerSuccessMessageElement;

    @CacheLookup
    @FindBy(linkText = "Continue")
    WebElement continueSuccess;

    /**
     * This method will get the Register text
     */
    public String getRegisterText() {
        log.info("Register Text :" + registerText.toString());
        return getTextFromElement(registerText);
    }
    /**
     * This method will get the Register successful text
     *//*
    public String getRegisterSuccessfulText() {
        log.info("Get the Register successful text :" + registerSuccessMessageElement.toString());
       return getTextFromElement(registerSuccessMessageElement);
    }*/

    /**
     * This method will enter firstname
     */
    public void enterFirstName(String fName) {
        sendTextToElement(firstName, fName);
        log.info("enter firstname :" + firstName.toString());
    }

    /**
     * This method will enter firstname
     */
    public void enterLastName(String lName) {
        sendTextToElement(lastName, lName);
        log.info("enter firstname :" + lastName.toString());
    }

    /**
     * This method will enter email
     */
    public void enterEmail(String emailAddress) {
        sendTextToElement(email, emailAddress);
        log.info("enter email :" + email.toString());
    }

    /**
     * This method will enter telephone
     */
    public void enterTelephone(String phone) {
        sendTextToElement(telephone, phone);
        log.info("enter telephone :" + telephone.toString());
    }

    /**
     * This method will enter password
     */
    public void enterPassword(String passwordText) {
        sendTextToElement(password, passwordText);
        log.info("enter password :" + password.toString());
    }

    /**
     * This method will enter confirmPassword
     */
    public void enterConfirmPassword(String passwordText) {
        sendTextToElement(cPassword, passwordText);
        log.info("enter confirmPassword :" + cPassword.toString());
    }

    /**
     * This method will click on the Yes radio button
     */
    public void clickOnTheYesRadioButton() {
        clickOnElement(yesRadio);
        log.info("click on the Yes radio button :" + yesRadio.toString());
    }

    /**
     * This method will click on privacy checkbox
     */
    public void clickOnThePrivacyCheckbox() {
        clickOnElement(privacyCheckBox);
        log.info("click on privacy checkbox :" + privacyCheckBox.toString());
     }

    /**
     * This method will click on the continue button
     */
    public void clickOnContinueButton() {
        clickOnElement(continueButton);
        log.info("click on the continue button :" + continueButton.toString());
    }

    /**
     * This method will click on the continue successful button
     */
    public void clickOnContinueButtonAfterSuccessfulAccountCreated() {
        clickOnElement(continueSuccess);
        log.info("click on the continue successful button :" + continueSuccess.toString());
    }
}
