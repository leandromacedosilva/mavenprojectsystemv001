package com.mycompany.mavenprojectsystemv001.model;

import com.mycompany.mavenprojectsystemv001.generic.GenericEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

/**
 *
 * @author leandro
 */
@Entity
@Table(name = "tbhardwarecomdefeito")
@SequenceGenerator(name = "seq_tbhardwarecomdefeito", sequenceName = "seq_tbhardwarecomdefeito", initialValue = 1)
public class HardwareComProblema extends GenericEntity {
    @Id
    @GeneratedValue(generator = "seq_tbhardwarecomdefeito", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String descricao;
    private String modelo;
    private String numeroSerie;
    private String retirado;
    
    public HardwareComProblema() {}

    public HardwareComProblema(String descricao, String modelo, String numeroSerie, String retirado) {
        this.descricao = descricao;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.retirado = retirado;
    }

    public HardwareComProblema(Long id, String descricao, String modelo, String numeroSerie, String retirado) {
        this.id = id;
        this.descricao = descricao;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.retirado = retirado;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getRetirado() {
        return retirado;
    }

    public void setRetirado(String retirado) {
        this.retirado = retirado;
    }

    @Override
    public String toString() {
        return "HardwareComProblema{" + "id=" + id + ", descricao=" + descricao + ", modelo=" + modelo + ", numeroSerie=" + numeroSerie + ", retirado=" + retirado + '}';
    }
    
    
}
