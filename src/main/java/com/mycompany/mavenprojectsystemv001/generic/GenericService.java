
package com.mycompany.projectprototypesystemv01.generic;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

/**
 *
 * @author leandro
 * @param <T>
 */
public class GenericService<T> {
    
    private final Class<T> entity;
    
    @PersistenceContext
    private EntityManager entityManager;
    
    public GenericService(Class<T> entity) {
        this.entity = entity;
    }
    
    public void save(T entity) {
        entityManager.persist(entity);
    }
    
    public void update(T entity) {
        entityManager.merge(entity);
    }
    
    public void remove(T entity) {
        entityManager.remove(entity);
    }
    
    public T find(Long id) {
        T object = getEntityManager().find(entity, id);
        getEntityManager().refresh(object);
        return object;
    }
    
    public T find2(Long id) {
        T object = entityManager.find(entity, id);
        entityManager.refresh(object);
        return object;
    }
    
    public List<T> findAlll() {
        String query = "select p from " + entity.getSimpleName() + " p where p.active = true";
        return entityManager.createQuery(query).getResultList();
    }
    
    public List<T> findAll() {
        String query = "select p from " + entity.getName() + " p";
        return entityManager.createQuery(query).getResultList();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    
}
