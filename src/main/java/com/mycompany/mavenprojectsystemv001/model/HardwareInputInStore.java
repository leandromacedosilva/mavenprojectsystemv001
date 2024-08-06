package com.mycompany.projectprototypesystemv01.model;

import com.mycompany.projectprototypesystemv01.generic.GenericEntity;
import jakarta.persistence.Column;
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
@Table(name = "tbhardwareinputinstore")
@SequenceGenerator(name = "seq_tbhardwareinputinstore", sequenceName = "seq_tbhardwareinputinstore", initialValue = 1)
public class HardwareInputInStore extends GenericEntity {
    @Id
    @GeneratedValue(generator = "seqtbhardwareinputinstore", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(length = 50)
    private String description;
    @Column(length = 50)
    private String acquirer;
    @Column(length = 50)
    private String apNumber;
    @Column(length = 50)
    private String serialNUmber;
    @Column(length = 50)
    private String anatel;
    @Column(length = 6)
    private int numberFisicalBox;
    @Column(length = 6)
    private int numberLogicalBox;
    
    public HardwareInputInStore() {}

    public HardwareInputInStore(String description, String acquirer, String apNumber, String serialNUmber, String anatel, int numberFisicalBox, int numberLogicalBox) {
        this.description = description;
        this.acquirer = acquirer;
        this.apNumber = apNumber;
        this.serialNUmber = serialNUmber;
        this.anatel = anatel;
        this.numberFisicalBox = numberFisicalBox;
        this.numberLogicalBox = numberLogicalBox;
    }

    public HardwareInputInStore(Long id, String description, String acquirer, String apNumber, String serialNUmber, String anatel, int numberFisicalBox, int numberLogicalBox) {
        this.id = id;
        this.description = description;
        this.acquirer = acquirer;
        this.apNumber = apNumber;
        this.serialNUmber = serialNUmber;
        this.anatel = anatel;
        this.numberFisicalBox = numberFisicalBox;
        this.numberLogicalBox = numberLogicalBox;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAcquirer() {
        return acquirer;
    }

    public void setAcquirer(String acquirer) {
        this.acquirer = acquirer;
    }

    public String getApNumber() {
        return apNumber;
    }

    public void setApNumber(String apNumber) {
        this.apNumber = apNumber;
    }

    public String getSerialNUmber() {
        return serialNUmber;
    }

    public void setSerialNUmber(String serialNUmber) {
        this.serialNUmber = serialNUmber;
    }

    public String getAnatel() {
        return anatel;
    }

    public void setAnatel(String anatel) {
        this.anatel = anatel;
    }

    public int getNumberFisicalBox() {
        return numberFisicalBox;
    }

    public void setNumberFisicalBox(int numberFisicalBox) {
        this.numberFisicalBox = numberFisicalBox;
    }

    public int getNumberLogicalBox() {
        return numberLogicalBox;
    }

    public void setNumberLogicalBox(int numberLogicalBox) {
        this.numberLogicalBox = numberLogicalBox;
    }

    @Override
    public String toString() {
        return "HardwareInputInStore{" + "id=" + id + ", description=" + description + ", acquirer=" + acquirer + ", apNumber=" + apNumber + ", serialNUmber=" + serialNUmber + ", anatel=" + anatel + ", numberFisicalBox=" + numberFisicalBox + ", numberLogicalBox=" + numberLogicalBox + '}';
    }
    
    
}
