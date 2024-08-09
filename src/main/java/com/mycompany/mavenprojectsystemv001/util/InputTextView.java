package com.mycompany.mavenprojectsystemv001.util;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

/**
 *
 * @author leandro
 */
@Named
@RequestScoped
public class InputTextView {
    private String text;
    
    public InputTextView() {}

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    
}
