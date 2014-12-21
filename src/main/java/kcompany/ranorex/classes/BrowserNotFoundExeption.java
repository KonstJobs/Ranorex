/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kcompany.ranorex.classes;

/**
 *
 * @author Konst
 */
public class BrowserNotFoundExeption extends Exception {

    public BrowserNotFoundExeption(String message) {
        super(message);
        System.out.println("EXEPTION: Browser '" + message + "' not found!!!");
    }

    public BrowserNotFoundExeption() {
    }

}
