/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kcompany.ranorex.pages;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kcompany.ranorex.classes.Person;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Konst
 */
public class TestPage {

    private WebDriver driver;

    public TestPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public TestPage() {
    }

    //------------------------  * Buttons *  ----------------------------
    @FindBy(id = "connect")
    private WebElement buttonConnect;

    @FindBy(id = "Load")
    private WebElement buttonLoad;

    @FindBy(id = "Save")
    private WebElement buttonSave;

    @FindBy(id = "Clear")
    private WebElement buttonClear;

    @FindBy(id = "Add")
    private WebElement buttonAdd;

    //------------------------  * Fields *  ----------------------------
    @FindBy(id = "FirstName")
    private WebElement fieldFristName;

    @FindBy(id = "LastName")
    private WebElement fieldLastName;

    @FindBy(id = "Category")
    private WebElement selectElement;

    @FindBy(id = "count")
    private WebElement fieldVipCount;

    //------------------------  * Methods *  ----------------------------
    public void addPerson(Person person) throws InterruptedException {

        fieldFristName.sendKeys(person.getFirstName());
        fieldLastName.sendKeys(person.getLastName());
        selectCategory(person);
        selectGender(person);
        buttonAdd.click();
    }

    private void selectCategory(Person person) {

        Select select = new Select(selectElement);
        String category = person.getCategory().getModifiedCategory();
        select.selectByVisibleText(category);

    }

    private void selectGender(Person person) {

        String gender = person.getGender().getModifiedGender();
        driver.findElement(By.xpath("//input[@value='" + gender + "']")).click();

    }

    public int getVIPcount() {

        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(fieldVipCount.getText());
        m.find();
        Integer vipCount = Integer.parseInt(m.group());

        return vipCount;
    }

}
