package com.mycompany.projectprototypesystemv01.service;

import com.mycompany.projectprototypesystemv01.generic.GenericService;
import com.mycompany.projectprototypesystemv01.model.HardwareInputInStore;
import jakarta.ejb.Stateless;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author leandro
 */
@Stateless
public class HardwareInputInStoreService extends GenericService<HardwareInputInStore> {
    public HardwareInputInStoreService() {
        super(HardwareInputInStore.class);
    }
    public List<HardwareInputInStore> findByAll(HardwareInputInStore hardwareInputInStore) {
        
        String sql = "select p from HardwareInputInStore p where ";
        
        if(hardwareInputInStore.getDescription() != null && !hardwareInputInStore.getDescription().equals("")) {
            sql += "lower(p.description) like lower(:description) and ";
        }
        
        if(hardwareInputInStore.getApNumber() != null && !hardwareInputInStore.getApNumber().equals("")) {
            sql += "lower(p.apNumber) like lower(:apNumber) and ";
        }
        sql += "p.active = true";
        
        System.out.println("" + sql);
        
        Query query = getEntityManager().createQuery(sql);
        
        if(hardwareInputInStore.getDescription()!= null && !hardwareInputInStore.getDescription().equals("")) {
        query.setParameter("description", "%" + hardwareInputInStore.getDescription() + "%");
        }
        
        if(hardwareInputInStore.getApNumber() != null && !hardwareInputInStore.getApNumber().equals("")) {
            query.setParameter("apNumber", "%" + hardwareInputInStore.getApNumber() + "%");
        }
        
        return query.getResultList();
    }
    
    public List<HardwareInputInStore> findByDescription(String description) {
        String query = "select p from HardwareInputInStore p where p.description like '" + description + "' ";
        return getEntityManager().createQuery(query).getResultList();
    }
}
