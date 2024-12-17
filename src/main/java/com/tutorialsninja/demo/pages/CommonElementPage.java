package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CommonElementPage extends Utility {
    private static final Logger log = LogManager.getLogger(CommonElementPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement myAccountLink;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Account Logout']")
    WebElement logoutMessageElement;

    @CacheLookup
    @FindBy(linkText = "Continue")
    WebElement continueButton;

    By selectMyAccountOption = By.xpath("//li[@class='dropdown open']//li/a");

    /**
     * This method will click on my account link.
     */
    public void clickOnMyAccountLink() {
        clickOnElement(myAccountLink);
        log.info("Clicking on my account link :"+myAccountLink.toString());
    }

    /**
     * This method will select option from my account link
     */
    public void selectMyAccountOption(String option) {
        log.info("Select Option from my account link :"+selectMyAccountOption.toString());
        List<WebElement> options = findElements(selectMyAccountOption);
        for (WebElement e : options) {
            if (e.getText().equalsIgnoreCase(option)) {
                e.click();
                break;
            }
        }
    }
    /**
     * This method will get the logout message
     */
    public String getLogoutText(){
        log.info("Logout Text :"+logoutMessageElement.toString());
        return getTextFromElement(logoutMessageElement);
    }
    /**
     * This method will click on continue button
     */
    public void clickOnContinueButton() {
        clickOnElement(continueButton);
        log.info("Clicking on the continue button :"+continueButton.toString());
    }

}
