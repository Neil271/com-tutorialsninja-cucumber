package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-email']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Returning Customer']")
    WebElement loginText;

    /**
     * This method will get the Login text
     */
    public String getLoginText() {
        log.info("Login Text :" + loginText.toString());
        return getTextFromElement(loginText);
    }
    /**
     * This method will enter email Address
     */
    public void enterEmail(String emailAdd) {
        sendTextToElement(email,emailAdd);
        log.info("Enter Email :"+email.toString());
    }
    /**
     * This method will enter password
     */
    public void enterPassword(String pass){
        sendTextToElement(password,pass);
        log.info("Enter Password :"+password.toString());
    }
    /**
     * This method will click on login button
     */
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
        log.info("Clicking on login button :"+loginButton.toString());
    }

}
