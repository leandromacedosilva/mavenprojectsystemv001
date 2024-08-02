
package com.mycompany.mavenprojectsystemv001.model;

import com.mycompany.mavenprojectsystemv001.generic.GenericEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.List;

/**
 *
 * @author itccolina
 */
@Entity
public class AssistenciaTecnica extends GenericEntity {
    @Id
    private Long id;
    private List<HardwareComProblema> hardwaresComProblemas;
    private String observacao;
    
    public AssistenciaTecnica() {}

    public AssistenciaTecnica(List<HardwareComProblema> hardwaresComProblemas, String observacao) {
        this.hardwaresComProblemas = hardwaresComProblemas;
        this.observacao = observacao;
    }

    public AssistenciaTecnica(Long id, List<HardwareComProblema> hardwaresComProblemas, String observacao) {
        this.id = id;
        this.hardwaresComProblemas = hardwaresComProblemas;
        this.observacao = observacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<HardwareComProblema> getHardwaresComProblemas() {
        return hardwaresComProblemas;
    }

    public void setHardwaresComProblemas(List<HardwareComProblema> hardwaresComProblemas) {
        this.hardwaresComProblemas = hardwaresComProblemas;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    
}
