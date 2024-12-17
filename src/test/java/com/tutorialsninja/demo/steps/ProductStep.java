package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.demo.pages.ProductPage;
import com.tutorialsninja.demo.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.Collections;
import java.util.List;

public class ProductStep {
    @And("I Select product “{}")
    public void iSelectProduct(String p) {


    }

    @And("I should see the Text {string}")
    public void iShouldSeeTheText(String arg0) {

    }


    @And("I Enter Qty {int} using Select class.")
    public void iEnterQtyUsingSelectClass(int arg0) {

    }

    @And("I Click on Add to Cart button")
    public void iClickOnAddToCartButton() {
        new ProductPage().clickOnTheAddToCart();
    }

    @And("I should see the Message Success: You have added “{}” to your shopping cart!")
    public void iShouldSeeTheMessageSuccessYouHaveAddedToYourShoppingCart(String arg0) {

    }

    @And("I Click on link shopping cart display into success message")
    public void iClickOnLinkShoppingCartDisplayIntoSuccessMessage() {
    }

    @And("I Select Sort By {string}")
    public void iSelectSortBy(String order) {
        new LaptopsAndNotebooksPage().sortProductByPrice(("Price (High > Low)"));
    }

    @Then("I should see the Product price will arrange in High to Low order.")
    public void iShouldSeeTheProductPriceWillArrangeInHighToLowOrder() {
        List<String> productPriceBefore = new LaptopsAndNotebooksPage().getListOfProductPrice();
        Collections.sort(productPriceBefore, Collections.reverseOrder());
        System.out.println(productPriceBefore);

        List<String> productPriceAfter = new LaptopsAndNotebooksPage().getListOfProductPrice();
        System.out.println(productPriceAfter);
        Assert.assertEquals(productPriceAfter, productPriceBefore, "Price are not in High to low");
    }

    @And("I Select Product “MacBook”")
    public void iSelectProductMacBook() {
        new LaptopsAndNotebooksPage().clickOnMacBook();
    }

    @And("I should see the text “MacBook”")
    public void iShouldSeeTheTextMacBook() {
        String expected = "MacBook";
        Assert.assertEquals(new ProductPage().getProductNameFromProductPage(), expected, "MacBook text is not displayed");
    }

    @And("I should see the message Success: You have added MacBook to your shopping cart!")
    public void iShouldSeeTheMessageSuccessYouHaveAddedMacBookToYourShoppingCart() {
        String expectedMessage = "Success: You have added MacBook to your shopping cart!";
        Assert.assertEquals(new ProductPage().getShoppingCartMessage(), expectedMessage, "Shopping Cart Message is not displayed");
    }

    @And("I Change Quantity {string}")
    public void iChangeQuantity(String q) {
        new ShoppingCartPage().changeQtyOfProduct(q);
    }

    @And("I Click on “Update” Tab")
    public void iClickOnUpdateTab() {
        new ShoppingCartPage().clickOnUpdateButton();
    }

    @And("I should see the message Success: You have modified your shopping cart!")
    public void iShouldSeeTheMessageSuccessYouHaveModifiedYourShoppingCart() {
        String expectedMessage="Success: You have modified your shopping cart!";
        Assert.assertEquals(new ShoppingCartPage().getUpdatedCartMessage(),expectedMessage,"Updated Shopping cart message is not displayed");
    }


    @And("I should see the Total £{double}")
    public void iShouldSeeTheTotal£(String expectedPrice) {
        Assert.assertEquals(new ShoppingCartPage().getPrice(),expectedPrice,"Price is not displayed");
    }


    @And("I Click on Checkout button")
    public void iClickOnCheckoutButton() {
        new ShoppingCartPage().clickOnCheckOut();
    }
}
