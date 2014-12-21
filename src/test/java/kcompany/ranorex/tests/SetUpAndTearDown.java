/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kcompany.ranorex.tests;

import java.util.concurrent.TimeUnit;
import kcompany.ranorex.classes.BrowserNotFoundExeption;
import kcompany.ranorex.classes.Browsers;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

/**
 *
 * @author Konst
 */
public class SetUpAndTearDown {

    public WebDriver driver;
    public FirefoxProfile profile;
    private final Browsers browser = new Browsers();
    public final String testURL;

    public SetUpAndTearDown() {
        testURL = System.getProperty("testURL");
    }

    @After
    public void TearDown() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }

    @Before
    public void SetUp() {

        try {
            driver = browser.getDriver();
        } catch (BrowserNotFoundExeption ex) {
            System.out.println("Test will run in FireFox");
            driver = new FirefoxDriver();
        }

        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
}
