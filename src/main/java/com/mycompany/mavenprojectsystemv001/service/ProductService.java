
package com.mycompany.projectprototypesystemv01.service;

import com.mycompany.projectprototypesystemv01.generic.GenericService;
import com.mycompany.projectprototypesystemv01.model.Product;
import jakarta.ejb.Stateless;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author leandro
 */
@Stateless
public class ProductService extends GenericService<Product> {
       
    public ProductService() {
        super(Product.class);
    }
    
    public List<Product> findByAll(Product product) {
        String sql = "select p from Product p where ";
        if(product.getDescription() != null && !product.getDescription().equals("")) {
            sql += "lower(p.description) like lower(:description) and ";
        }
        if(product.getBarcode() != null && !product.getBarcode().equals("")) {
            sql += "p.barcode like :barcode and ";
        }
        sql += "p.active = true";
        System.out.println("" + sql);
        Query query = getEntityManager().createQuery(sql);
        if(product.getDescription() != null && !product.getDescription().equals("")) {
        query.setParameter("description", "%" + product.getDescription() + "%");
        }
        if(product.getBarcode() != null && !product.getBarcode().equals("")) {
            query.setParameter("barcode", "%" + product.getBarcode() + "%");
        }
        return query.getResultList();
    }
    
    
    public List<Product> findByDescription(String description) {
        String query = "select p from Product p where p.desciption like '" + description + "' ";
        return getEntityManager().createQuery(query).getResultList();
    }
}
