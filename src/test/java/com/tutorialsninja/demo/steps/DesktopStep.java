package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.DesktopPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.Collections;
import java.util.List;

public class DesktopStep {
    @And("I select Sort By position {string}")
    public void iSelectSortByPosition(String order) {
        new DesktopPage().selectSortByFilter(order);
    }

    @Then("I should see the Product will arrange in Descending order.")
    public void iShouldSeeTheProductWillArrangeInDescendingOrder() {
        //get all product name before doing any action in the desktop page
        List<String> productsNameBefore = new DesktopPage().getListOfProductsName();
        Collections.sort(productsNameBefore, Collections.reverseOrder());
        System.out.println(productsNameBefore);

        List<String> productsNameAfter = new DesktopPage().getListOfProductsName();
        Assert.assertEquals(productsNameAfter,productsNameBefore,"Product is not display in descending order");
    }
}
