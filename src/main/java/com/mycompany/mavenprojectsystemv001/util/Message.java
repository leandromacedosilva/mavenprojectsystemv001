package com.mycompany.mavenprojectsystemv001.util;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;

/**
 *
 * @author leandro
 */
public class Message {
    
    public static void message(String text) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(text));
    }
    
}
