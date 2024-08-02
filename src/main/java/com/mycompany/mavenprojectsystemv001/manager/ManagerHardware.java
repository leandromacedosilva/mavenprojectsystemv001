package com.mycompany.mavenprojectsystemv001.manager;

import com.mycompany.mavenprojectsystemv001.model.HardwareComProblema;
import jakarta.annotation.PostConstruct;
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
    private HardwareComProblema hardwareComProblema;
    private String resultado;

    public ManagerHardware() {
    }
    
    // apos o construtor, faca
    @PostConstruct
    public void instance(){
        hardwareComProblema = new HardwareComProblema();
    }
    
    public void salvar() {
        this.resultado = hardwareComProblema.getDescricao();
    }

    public HardwareComProblema getHardwareComProblema() {
        return hardwareComProblema;
    }

    public void setHardwareComProblema(HardwareComProblema hardwareComProblema) {
        this.hardwareComProblema = hardwareComProblema;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    
}
