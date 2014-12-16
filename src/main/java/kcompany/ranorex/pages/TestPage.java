/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kcompany.ranorex.pages;

import org.openqa.selenium.WebDriver;

/**
 *
 * @author Konst
 */
public class TestPage {

    private WebDriver driver;

    public TestPage(WebDriver driver) {
        this.driver = driver;
    }

    public TestPage() {
    }
    
public void addPerson(String firstName, String lastName, String other) {
    
}
    public void addPerson(String firstName, String lastName) {
          addPerson(firstName, lastName, null);
    }

}
