
package com.mycompany.projectprototypesystemv01.service;

import com.mycompany.projectprototypesystemv01.generic.GenericService;
import com.mycompany.projectprototypesystemv01.model.PointOfSale;
import jakarta.ejb.Stateless;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author leandro
 */
@Stateless
public class PointOfSaleService extends GenericService<PointOfSale> {
    public PointOfSaleService() {
        super(PointOfSale.class);
    }
    
    public List<PointOfSale> findByAll(PointOfSale pointOfSale) {
        
        String sql = "select p from PointOfSale p where ";
        
        if(pointOfSale.getCardType() != null && !pointOfSale.getCardType().equals("")) {
            sql += "lower(p.cardType) like lower(:cardType) and ";
        }
        
        if(pointOfSale.getOperator() != null && !pointOfSale.getOperator().equals("")) {
            sql += "lower(p.operator) like lower(:operator) and ";
        }
        sql += "p.active = true";
        
        System.out.println("" + sql);
        
        Query query = getEntityManager().createQuery(sql);
        
        if(pointOfSale.getCardType() != null && !pointOfSale.getCardType().equals("")) {
        query.setParameter("cardType", "%" + pointOfSale.getCardType() + "%");
        }
        
        if(pointOfSale.getOperator() != null && !pointOfSale.getOperator().equals("")) {
            query.setParameter("operator", "%" + pointOfSale.getOperator() + "%");
        }
        
        return query.getResultList();
    }
    
    public List<PointOfSale> findByDescription(String operador) {
        String query = "select p from PointOfSale p where p.operator like '" + operador + "' ";
        return getEntityManager().createQuery(query).getResultList();
    }
}
