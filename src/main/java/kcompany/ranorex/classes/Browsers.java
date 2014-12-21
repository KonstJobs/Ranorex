package kcompany.ranorex.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 *
 * @author Konst
 */
public class Browsers {

    private final String browser;
    public WebDriver driver;

    public Browsers() {
        browser = System.getProperty("currentBrowser");
    }

    public WebDriver getDriver() throws BrowserNotFoundExeption {

        switch (browser) {

            case "FireFox":
                driver = new FirefoxDriver();
                break;
            case "Chrome":
                System.setProperty("webdriver.chrome.driver",
                        "D:\\chromedriver\\chromedriver.exe");
                driver = new ChromeDriver();
                break;

            case "Html":
                driver = new HtmlUnitDriver();
                break;

            default:
                throw new BrowserNotFoundExeption(browser);

        }

        return driver;
    }
}
