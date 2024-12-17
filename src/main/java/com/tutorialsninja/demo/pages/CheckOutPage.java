package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    WebElement notAvailableMessage;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Checkout']")
    WebElement checkOutText;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='New Customer']")
    WebElement newCustomer;

    @CacheLookup
    @FindBy(xpath = "//input[@value='guest']")
    WebElement guestRadioButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-account']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-firstname']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-lastname']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-email']")
    WebElement emailAddress;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-telephone']")
    WebElement telephoneNumber;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-address-1']")
    WebElement address;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-city']")
    WebElement city;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-postcode']")
    WebElement postCode;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-country']")
    WebElement country;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-zone']")
    WebElement region;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-guest']")
    WebElement continueButtonGuest;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-shipping-method']")
    WebElement continueButtonDelivery;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-payment-method']")
    WebElement continueButtonPayment;

    @CacheLookup
    @FindBy(xpath = "//div[@id='collapse-payment-method']//textarea[@name='comment']")
    WebElement textBox;


    @CacheLookup
    @FindBy(xpath = "//input[@name='agree']")
    WebElement agree;

    /**
     * This method will click onGuest radio button
     */
    public void clickOnGuestRadioButton() {
        clickOnElement(guestRadioButton);
        log.info("click onGuest radio button :"+guestRadioButton.toString());
    }

    /**
     * This method will get error message (if product is not available)
     * */
    public String getProductNotAvailableMessage(){
        return getTextFromElement(notAvailableMessage).split("\n")[0];
    }
    /**
     * This method will get the text from check out page
     *//*
    public String getTextOfCheckOut(String expected,String msg){
        return getTextFromElement(checkOutText);
    }*/

    /**
     * This method will click on continue button
     */
    public void clickOnContinue() {
        clickOnElement(continueButton);
        log.info("click on continue button :"+continueButton.toString());
    }
    /**
     * This method will enter name
     * */
    public void enterFirstName(String fName){
        sendTextToElement(firstName,fName);
        log.info("Enter name :"+firstName.toString());
    }
    /**
     * This method will enter last name
     * */
    public void enterLastName(String lName){
        sendTextToElement(lastName,lName);
        log.info("Enter last name :"+lastName.toString());
    }

    /**
     * This method will enter email
     * */
    public void enterEmailAddress(String email){
        sendTextToElement(emailAddress,email);
        log.info("Enter email :"+emailAddress.toString());
    }

    /**
     * This method will enter telephone
     * */
    public void enterTelephone(String phone){
        sendTextToElement(telephoneNumber,phone);
        log.info("Enter telephone :"+telephoneNumber.toString());
    }

    /**
     * This method will enter address
     * */
    public void enterAddress(String add){
        sendTextToElement(address,add);
        log.info("Enter address :"+address.toString());
    }

    /**
     * This method will enter city
     * */
    public void enterCityName(String cty){
        sendTextToElement(city,cty);
        log.info("Enter city :"+city.toString());
    }

    /**
     * This method will enter Post code
     * */
    public void enterPostCode(String pCode){
        sendTextToElement(postCode,pCode);
        log.info("Enter post code :"+postCode.toString());
    }

    /**
     * This method will select country
     * */
    public void selectCountry(String cnty){
        selectByVisibleTextFromDropDown(country,cnty);
        log.info("Select country :"+country.toString());
    }
    /**
     * This method will select region
     * */
    public void selectRegion(String rgn){
        selectByVisibleTextFromDropDown(region,rgn);
        log.info("Select region :"+region.toString());
    }
    /**
     *This method will click on continue button
     * */
    public void clickOnContinueButtonForGuest(){
        clickOnElement(continueButtonGuest);
        log.info("click on continue button :"+continueButton.toString());
    }

    public void clickOnContinueButtonForDelivery(){
        clickOnElement(continueButtonDelivery);
        log.info("click on continue button  for delivery:"+continueButtonDelivery.toString());
    }
    /**
     * This method will enter data in text field
     * */
    public void enterCommentInTextBox(String message){
        sendTextToElement(textBox,message);
        log.info("Enter data in text field :"+textBox.toString());

    }

    /**
     * This method will accept terms
     * */
    public void clickOnTerms(){
        clickOnElement(agree);
        log.info("Accept terms :"+agree.toString());
    }

    public void clickOnContinueButtonForPayment(){
        clickOnElement(continueButtonPayment);
        log.info("click on continue button for payment :"+continueButtonPayment.toString());
    }
}
