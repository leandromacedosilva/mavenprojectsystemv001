package com.mycompany.mavenprojectsystemv001.manager;

import com.mycompany.mavenprojectsystemv001.model.AssistenciaTecnica;
import com.mycompany.mavenprojectsystemv001.model.HardwareComProblema;
import com.mycompany.mavenprojectsystemv001.util.Message;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author leandro
 */
@Named
@ViewScoped
public class ManagerHardware2 implements Serializable {
    private AssistenciaTecnica assistenciaTecnica;
    private HardwareComProblema hardwareComProblema;
    
    private String resultado;

    public ManagerHardware2() {
    }
    
    // apos o construtor, faca
    @PostConstruct
    public void instance(){
        assistenciaTecnica = new AssistenciaTecnica();
        assistenciaTecnica.setHardwaresComProblemas(new ArrayList<>());
        hardwareComProblema = new HardwareComProblema();
        
    }
    
    //public void salvar() {
        //this.resultado = hardwareComProblema.getDescricao();
    //}
    
    public void informationsPrinters() {
        System.out.println("" + assistenciaTecnica.getDescricao());
        System.out.println("" + assistenciaTecnica.getObservacao());
        resultado = assistenciaTecnica.getObservacao();
    }
    
//    public void addPrintersAssistTecnic() {
//        if(hardwareComProblema.getId() != null && !Objects.equals(hardwareComProblema.getId(), hardwareComProblema.getId())){
//            hardwaresComProblemas.add(hardwareComProblema);
//            hardwareComProblema = new HardwareComProblema();
//        } else {
//            //Message.message("JA EXISTE UM CADASTRO COM ESTE CODIGO.");
//            Message.message("O CODIGO DO REGISTRO NAO PODE SER NULO.");
//        }
//        
//    }
    
    public void addPrintersAssistTecnic() {
            this.assistenciaTecnica.getHardwaresComProblemas().add(hardwareComProblema);
            hardwareComProblema = new HardwareComProblema();
    }
    
    public void removeRegister(HardwareComProblema hCP) {
        this.assistenciaTecnica.getHardwaresComProblemas().remove(hCP);
        Message.message("O REGISTRO FOI DELETADO COM SUCESSO!");
    }
    
    public void visualizar() {
        System.out.println("DESCRICAO: " + assistenciaTecnica.getDescricao());
        System.out.println("LISTA: " + assistenciaTecnica.getHardwaresComProblemas());
    }

    public AssistenciaTecnica getAssistenciaTecnica() {
        return assistenciaTecnica;
    }

    public void setAssistenciaTecnica(AssistenciaTecnica assistenciaTecnica) {
        this.assistenciaTecnica = assistenciaTecnica;
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
