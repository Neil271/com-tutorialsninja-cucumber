package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.propertyreader.PropertyReader;
import com.tutorialsninja.demo.utilities.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.testng.annotations.BeforeMethod;

public class Hooks extends Utility {

    @BeforeMethod(alwaysRun = true)
    @Before
    public void setUp() {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = getScreenShot();
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        closeBrowser();
    }
}
