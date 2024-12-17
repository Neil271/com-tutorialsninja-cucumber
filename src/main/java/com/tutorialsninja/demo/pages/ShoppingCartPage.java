package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    @CacheLookup
    @FindBy(css ="input[value='1']" )
    WebElement productQty;

    @CacheLookup
    @FindBy(xpath ="//button[@type='submit']" )
    WebElement updateButton;

    @CacheLookup
    @FindBy(xpath ="//div[@class='alert alert-success alert-dismissible']" )
    WebElement updateMessage;

    @CacheLookup
    @FindBy(xpath ="//tbody//tr//td[6]" )
    WebElement productPrice;

    @CacheLookup
    @FindBy(xpath ="//a[@class='btn btn-primary']" )
    WebElement checkOutButton;

    /**
     * This method will update the qty
     */
    public void changeQtyOfProduct(String qty) {
        sendTextToElement(productQty, qty);
        log.info("Update the qty :"+productQty.toString());
    }

    /**
     * click on the update cart button
     */
    public void clickOnUpdateButton() {
        clickOnElement(updateButton);
        log.info("Update cart button :"+updateButton.toString());
    }

    /**
     * This method will get the updated cart message
     */
    public String getUpdatedCartMessage(){
        log.info("Get the updated cart message :"+updateMessage);
        return getTextFromElement(updateMessage);
    }
    /**
     * This method will get the price
     */
    public String getPrice() {
        log.info("Get the price :"+productPrice.toString());
       return getTextFromElement(productPrice);
    }
    /**
     * This method will click on the checkout button
     */
    public void clickOnCheckOut() {
        clickOnElement(checkOutButton);
        log.info("Click on the checkout button :"+checkOutButton.toString());
    }

}
