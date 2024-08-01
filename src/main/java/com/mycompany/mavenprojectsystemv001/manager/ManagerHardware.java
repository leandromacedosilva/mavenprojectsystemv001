package com.mycompany.mavenprojectsystemv001.manager;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;

/**
 *
 * @author leandro
 */
@Named
@ViewScoped
public class ManagerHardware implements Serializable {
    private String nome;
    public void message() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("AQUI E UM TESTE" + nome));
    }

    public ManagerHardware() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
