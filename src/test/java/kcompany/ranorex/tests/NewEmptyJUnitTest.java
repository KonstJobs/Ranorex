/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kcompany.ranorex.tests;

import kcompany.ranorex.classes.Category;
import kcompany.ranorex.classes.Person;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Konst
 */
public class NewEmptyJUnitTest {

    public NewEmptyJUnitTest() {

    }

    @Test
    public void test() {

        Person person = new Person.Builder("first", "setco").category(Category.SCIENCE).build();
        
        System.out.println(person.getCategory());
    }

}
