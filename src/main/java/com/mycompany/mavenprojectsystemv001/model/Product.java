
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
@Table(name = "tbproduct")
public class Product extends GenericEntity {
    @Id
    @SequenceGenerator(name = "seq_tbproduct", sequenceName = "seq_tbproduct", initialValue = 1)
    @GeneratedValue(generator = "seq_tbproduct", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(length = 12)
    private Long idWt;
    @Column(length = 16)
    private String barcode;
    @Column(length = 50)
    private String description;
    @Column(length = 12)
    private String packaging;
    
    public Product() {}

    public Product(Long idWt, String barcode, String description, String packaging) {
        this.idWt = idWt;
        this.barcode = barcode;
        this.description = description;
        this.packaging = packaging;
    }

    public Product(Long id, Long idWt, String barcode, String description, String packaging) {
        this.id = id;
        this.idWt = idWt;
        this.barcode = barcode;
        this.description = description;
        this.packaging = packaging;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdWt() {
        return idWt;
    }

    public void setIdWt(Long idWt) {
        this.idWt = idWt;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", idWt=" + idWt + ", barcode=" + barcode + ", description=" + description + ", packaging=" + packaging + '}';
    }
    
    
}
