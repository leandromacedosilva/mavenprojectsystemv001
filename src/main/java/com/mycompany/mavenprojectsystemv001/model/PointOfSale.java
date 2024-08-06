
package com.mycompany.mavenprojectsystemv001.model;

import com.mycompany.mavenprojectsystemv001.util.Caracter;
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
// pos class
@Entity
@Table(name = "tbpointofsale")
public class PointOfSale extends GenericEntity {
    @Id
    @SequenceGenerator(name = "seq_tbpointofsale", sequenceName = "seq_tbpointofsale", initialValue = 1)
    @GeneratedValue(generator = "seq_tbpointofsale", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(length = 50)
    private String operator;
    private int fisicalBox;
    private int logicalBox;
    private float posValue;
    private String vlText;
    @Column(length = 50)
    private String cardType;
    //  classe generica dataregistro;
    @Column(length = 100)
    private String note;
    
    public PointOfSale() {}

    public PointOfSale(Long id, String operator, int fisicalBox, int logicalBox, float posValue, String cardType, String note) {
        this.id = id;
        this.operator = operator;
        this.fisicalBox = fisicalBox;
        this.logicalBox = logicalBox;
        this.posValue = posValue;
        this.cardType = cardType;
        this.note = note;
    }
    
    // converter virgula para ponto 
    public void convertCaracter() {
        vlText = String.valueOf(this.posValue);
        Caracter.caracterRemove(vlText);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getFisicalBox() {
        return fisicalBox;
    }

    public void setFisicalBox(int fisicalBox) {
        this.fisicalBox = fisicalBox;
    }

    public int getLogicalBox() {
        return logicalBox;
    }

    public void setLogicalBox(int logicalBox) {
        this.logicalBox = logicalBox;
    }

    public float getPosValue() {
        return posValue;
    }

    public void setPosValue(float posValue) {
        this.posValue = posValue;
    }

    public String getVlText() {
        return vlText;
    }

    public void setVlText(String vlText) {
        this.vlText = vlText;
    }
    
    

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    /*@Override
    public Boolean getActive() {
        return active;
    }

    @Override
    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public Date getDateRegister() {
        return dateRegister;
    }

    /**
     *
     * @param dateRegister
     */
    /*@Override
    public void setDateRegister(Date dateRegister) {
        this.dateRegister = dateRegister;
    }

    @Override
    public Date getDateUpdate() {
        return dateUpdate;
    }

    @Override
    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }*/
        
}
