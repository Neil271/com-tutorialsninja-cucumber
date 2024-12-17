package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class LaptopsAndNotebooksPage extends Utility {
    private static final Logger log = LogManager.getLogger(LaptopsAndNotebooksPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']")
    WebElement selectSort;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='MacBook']")
    WebElement macBookProduct;

    By listOfProductName = By.xpath("//div[@id='content']//div//div[1]//div[2]//div[1]//p[2]");

    /**
     * This method will sort the list of product
     */
    public void sortProductByPrice(String option) {
        selectByVisibleTextFromDropDown(selectSort, option);
        log.info("Sort the list of product :"+selectSort.toString());
    }
    /**
     * This method will click on macBook product
     */
    public void clickOnMacBook() {
        clickOnElement(macBookProduct);
        log.info("Clicking on macBook product :"+macBookProduct.toString());
    }
    /**
     * This method will get name of all products
     */
    public List<String> getListOfProductPrice() {
        log.info("All products name :"+listOfProductName.toString());
        List<WebElement> priceList = findElements(listOfProductName);

        List<String> priceListBefore = new ArrayList<>();
        for (WebElement e : priceList) {
            String price = e.getText().split("\n")[0].replace("$", "").trim();
            priceListBefore.add(price);
        }
        return priceListBefore;
    }

}
