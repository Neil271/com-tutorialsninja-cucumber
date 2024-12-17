package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopMenu;

    @CacheLookup
    @FindBy(css = "div[id='content'] h2")
    WebElement menuTabText;

    @CacheLookup
    @FindBy(linkText = "Show AllDesktops")
    WebElement showAllDesktops;

    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopAndNotebookMenu;

    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement componentMenu;

    @CacheLookup
    @FindBy(xpath = "//button[@class='btn btn-link dropdown-toggle']")
    WebElement currencyTab;

    @CacheLookup
    @FindBy(css = "button[name='GBP']")
    WebElement poundCurrency;

    /**
     * This method will click on selected Menu tab
     */
    public void selectMenu(String menu) {
        clickOnElement(By.linkText(menu));
        log.info("Clicking on selected menu tab" + showAllDesktops.toString());
    }

    /**
     * This method will do mouse hover and click on teh desktop menu
     */
    public void mouseHoverAndClickOnDesktop() {
        mouseHoverToElementAndClick(desktopMenu);
        log.info("Do mouse hover and click on the desktop menu" + desktopMenu.toString());
    }

    /**
     * This method will get desktop text from desktop text
     */
    public String getMenuTabText() {
        log.info("Desktop Text :" + menuTabText.toString());
        return getTextFromElement(menuTabText);
    }

    /**
     * This method will do mouse hover and click on teh LaptopAndNoteBook menu
     */
    public void mouseHoverAndClickOnLaptopAndNoteBook() {
        mouseHoverToElementAndClick(laptopAndNotebookMenu);
        log.info("Do mouse hover and click on the LaptopAndNoteBook menu :" + menuTabText.toString());
    }

    /**
     * This method will do mouse hover and click on teh LaptopAndNoteBook menu
     */
    public void mouseHoverAndClickOnComponents() {
        mouseHoverToElementAndClick(componentMenu);
        log.info("Do mouse hover and click on teh LaptopAndNoteBook menu" + componentMenu.toString());
    }

    /**
     * This method will do mouse hover and click on the Currency Tab
     */
    public void mouseHoverAndClickOnCurrency() {
        mouseHoverToElementAndClick(currencyTab);
        log.info("Do mouse hover and click on the Currency Tab :" + currencyTab.toString());
    }

    /**
     * This method will do mouse hover and click on the pound currency
     */
    public void mouseHoverAndClickOnPoundCurrency() {
        mouseHoverToElementAndClick(poundCurrency);
        log.info("Do mouse hover and click on the pound currency :" + poundCurrency.toString());
    }
}
