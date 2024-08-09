package com.mycompany.mavenprojectsystemv001.service;

import com.mycompany.projectprototypesystemv01.generic.GenericService;
import com.mycompany.projectprototypesystemv01.model.ProductPub;
//import jakarta.ejb.Stateless;
import jakarta.ejb.Stateless;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author leandro
 */
@Stateless
public class ProductPubService extends GenericService<ProductPub> {
    public ProductPubService() {
        super(ProductPub.class);
    }

    //public ProductPub findByAll(ProductPub productPub) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}
    public List<ProductPub> findByAll(ProductPub productPub) {
        
        String sql = "select pb from ProductPub pb where ";
        
        if(productPub.getProduct() != null && !productPub.getProduct().equals("")) {
            sql += "lower(pb.description) like lower(:description) and ";
        }
        
        if(productPub.getId() != null && !productPub.getId().equals("")) {
            sql += "lower(pb.operator) like lower(:operator) and ";
        }
        sql += "pb.active = true";
        
        System.out.println("" + sql);
        
        Query query = getEntityManager().createQuery(sql);
        
        if(productPub.getProduct() != null && !productPub.getProduct().equals("")) {
        query.setParameter("cardType", "%" + productPub.getProduct() + "%");
        }
        
        if(productPub.getId() != null && !productPub.getId().equals("")) {
            query.setParameter("operator", "%" + productPub.getId() + "%");
        }
        
        return query.getResultList();
    }
    
    public List<ProductPub> findByDescription(String operador) {
        String query = "select pb from ProductPub p where p.operator like '" + operador + "' ";
        return getEntityManager().createQuery(query).getResultList();
    }
}
