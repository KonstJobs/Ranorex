/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kcompany.ranorex.tests;

import kcompany.ranorex.classes.Category;
import kcompany.ranorex.classes.Gender;
import kcompany.ranorex.classes.Person;
import kcompany.ranorex.classes.PersonBuilder;
import kcompany.ranorex.pages.TestPage;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Konst
 */
public class TestAddingPersons extends SetUpAndTearDown {

    public TestAddingPersons() {

    }

    @Test
    public void test() throws InterruptedException {
        
        driver.get(testURL);
        
        TestPage testPage = new TestPage(driver);

        // Given
        Person person = PersonBuilder.createDefPerson("FirstName", "LastName");

        // When
        testPage.addPerson(person);

        //Then
        assertEquals(1, testPage.getVIPcount());
    }

}
