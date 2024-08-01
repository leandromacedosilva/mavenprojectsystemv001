package com.mycompany.mavenprojectsystemv001.util;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;

/**
 *
 * @author leandro
 */
public class Message {
    public void message() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("AQUI E UM TESTE"));
    }
}
