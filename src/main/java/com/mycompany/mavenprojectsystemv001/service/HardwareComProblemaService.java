package com.mycompany.mavenprojectsystemv001.service;

import com.mycompany.mavenprojectsystemv001.model.HardwareComProblema;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

/**
 *
 * @author leandro
 */

@Stateless
public class HardwareComProblemaService {
    
    @PersistenceContext
    EntityManager entityManager;
    
    public void save(HardwareComProblema hardwareComProblema) {
        entityManager.persist(hardwareComProblema);
    }
    
    public void update(HardwareComProblema hardwareComProblema) {
        entityManager.merge(hardwareComProblema);
    }
    
    public HardwareComProblema find(Long id) {
        return entityManager.find(HardwareComProblema.class, id);
    }
    
}
