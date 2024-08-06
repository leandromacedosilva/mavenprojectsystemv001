
package com.mycompany.projectprototypesystemv01.model;

import com.mycompany.projectprototypesystemv01.generic.GenericEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.util.List;

/**
 *
 * @author leandro
 */
@Entity
@Table(name = "tbproductpub")
public class ProductPub extends GenericEntity {
    @Id
    @SequenceGenerator(sequenceName = "seq_tbproductpub", name = "seq_tbproductpub", initialValue = 1)
    @GeneratedValue(generator = "seq_tbproductpub", strategy = GenerationType.SEQUENCE)
    private Long id;
    private Product product;
    private List<Product> products;
    private float quantity;
    
    public ProductPub() {}

    public ProductPub(Long id, Product product, List<Product> products, float quantity) {
        this.id = id;
        this.product = product;
        this.products = products;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ProductPub{" + "id=" + id + ", product=" + product + ", products=" + products + ", quantity=" + quantity + '}';
    }
    
    
}
