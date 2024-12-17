package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DesktopPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    By productNames=By.xpath("//div[@id='content']//div//div[1]//div[2]//div[1]//h4");

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement selectFilter;

    @CacheLookup
    @FindBy(css = "body > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(7) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > h4:nth-child(1) > a:nth-child(1)")
    WebElement products;

    /**
     * This method will return list of product names
     */
    public List<String> getListOfProductsName() {
        log.info("List of product Names :"+productNames.toString());
        return getListOfTextFromElement(productNames);
    }
    /**
     * This Method will sort the data in selected filter
     */
    public void selectSortByFilter(String option) {
        selectByVisibleTextFromDropDown(selectFilter, option);
        log.info("Sort the data in selected filter :"+selectFilter.toString());
    }
    public String getProductName(){
        return getTextFromElement(products);
    }

}
