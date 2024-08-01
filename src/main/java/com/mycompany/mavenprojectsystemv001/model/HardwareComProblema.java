package com.mycompany.mavenprojectsystemv001.model;

import com.mycompany.mavenprojectsystemv001.generic.GenericEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author leandro
 */
@Entity
@Table(name = "tbhardwarecomdefeito")
public class HardwareComProblema extends GenericEntity {
    @Id
    private Long id;
    private String descricao;
    
    public HardwareComProblema() {}

    public HardwareComProblema(String descricao) {
        this.descricao = descricao;
    }

    public HardwareComProblema(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
