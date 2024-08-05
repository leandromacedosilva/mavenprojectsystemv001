package com.mycompany.mavenprojectsystemv001.manager;

import com.mycompany.mavenprojectsystemv001.model.AssistenciaTecnica;
import com.mycompany.mavenprojectsystemv001.model.HardwareComProblema;
import com.mycompany.mavenprojectsystemv001.service.HardwareComProblemaService;
import com.mycompany.mavenprojectsystemv001.util.Message;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leandro
 */
@Named
@ViewScoped
public class ManagerHardware implements Serializable {
    
    @EJB
    HardwareComProblemaService hardwareComProblemaService;
    
    private AssistenciaTecnica assistenciaTecnica;
    private HardwareComProblema hardwareComProblema;
    private List<HardwareComProblema> hardwaresComProblemas;
    private String resultado;

    public ManagerHardware() {
    }
    
    // apos o construtor, faca
    @PostConstruct
    public void instance(){
        assistenciaTecnica = new AssistenciaTecnica();
        hardwareComProblema = new HardwareComProblema();
        hardwaresComProblemas = new ArrayList<>();
    }
    
    //public void salvar() {
        //this.resultado = hardwareComProblema.getDescricao();
    //}
    // ******
    public void save() {
        hardwareComProblemaService.save(hardwareComProblema);
        instance();
        //hardwareComProblema = new HardwareComProblema();
        Message.message("Dados persistidos com sucesso no banco de dados!");
    }
    
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
            hardwaresComProblemas.add(hardwareComProblema);
            hardwareComProblema = new HardwareComProblema();
    }
    
    public void removeRegister(HardwareComProblema hCP) {
        hardwaresComProblemas.remove(hCP);
        Message.message("O REGISTRO FOI DELETADO COM SUCESSO!");
    }
    
    public void visualizar() {
        System.out.println("DESCRICAO: " + assistenciaTecnica.getDescricao());
        assistenciaTecnica.setHardwaresComProblemas(hardwaresComProblemas);
        System.out.println("LISTA: " + assistenciaTecnica.getHardwaresComProblemas());
    }

    public AssistenciaTecnica getAssistenciaTecnica() {
        return assistenciaTecnica;
    }

    public void setAssistenciaTecnica(AssistenciaTecnica assistenciaTecnica) {
        this.assistenciaTecnica = assistenciaTecnica;
    }

    public List<HardwareComProblema> getHardwaresComProblemas() {
        return hardwaresComProblemas;
    }

    public void setHardwaresComProblemas(List<HardwareComProblema> hardwaresComProblemas) {
        this.hardwaresComProblemas = hardwaresComProblemas;
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
