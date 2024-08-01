package com.mycompany.mavenprojectsystemv001.util;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;

/**
 *
 * @author leandro
 */
public class Message {
    private String nome;
    private String resultado;
    public void message() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("AQUI E UM TESTE" + nome));
        this.resultado = this.nome;
    }

    public Message() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    
}
