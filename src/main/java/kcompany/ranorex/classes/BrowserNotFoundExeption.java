/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kcompany.ranorex.classes;

import java.util.logging.Logger;

/**
 *
 * @author Konst
 */
public class BrowserNotFoundExeption extends Exception {
    
    static Logger log = Logger.getLogger(
                      BrowserNotFoundExeption.class.getName());

    public BrowserNotFoundExeption(String message) {
        super(message);
     //  log.d("EXEPTION: Browser '" + message + "' not found!!!");
     log.info("EXEPTION: Browser '" + message + "' not found!!!");
        
        System.out.println("EXEPTION: Browser '" + message + "' not found!!!");
    }

    public BrowserNotFoundExeption() {
    }

}
