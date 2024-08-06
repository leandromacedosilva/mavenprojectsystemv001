package com.mycompany.mavenprojectsystemv001.util;

/**
 *
 * @author leandro
 */
public class Caracter {
    public static String caracterRemove(String text) {
        //return text.replace(".", "").replace("-", "");
        return text.replace(",", ".");
    }
    
}
