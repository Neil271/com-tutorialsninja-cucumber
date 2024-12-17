package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    @CacheLookup
    @FindBy(css = "div[id='content'] h1")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-quantity']")
    WebElement productQty;

    @CacheLookup
    @FindBy(css = "#button-cart")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement shoppingCartMessage;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCartLink;

    /**
     * This method will get the product name
     */
    public String getProductNameFromProductPage() {
        return getTextFromElement(productName);
    }
    /**
     * This method will change the qty of the product
     */
    public void productQty(String qty) {
        sendTextToElement(productQty, qty);
        log.info("change the qty of the product :"+productQty.toString());
    }

    /**
     * This method will click on the add to cart button
     */
    public void clickOnTheAddToCart() {
        clickOnElement(addToCart);
        log.info("click on the add to cart button :"+addToCart.toString());
    }

    /**
     * This method will get the shopping cart message
     */
    public String getShoppingCartMessage()  {
        log.info("Shopping cart message :"+shoppingCartMessage.toString());
     return getTextFromElement(shoppingCartMessage).split("\n")[0];
    }

    /**
     * This method will click on the shopping cart link
     */
    public void clickOnTheShoppingCartLink() {
        clickOnElement(shoppingCartLink);
        log.info("click on the shopping cart link :"+shoppingCartLink.toString());
    }
}
