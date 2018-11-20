/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bennu.dao.impl;

import com.bennu.dao.BennuDAO;
import com.bennu.entities.Alumnos;
import com.bennu.entities.Asignatura;
import com.bennu.entities.Colegio;
import com.bennu.entities.Nota;
import com.bennu.entities.Profesores;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


/**
 *
 * @author fabyo
 * @param <T>
 */


public class BennuDAOImpl<T> implements BennuDAO<T>{

    EntityManager em;
    EntityManagerFactory emf;
    
    public BennuDAOImpl() {
    
        emf = Persistence.createEntityManagerFactory("com.bennu_BennuPruebaMaven_war_1.0-SNAPSHOTPU");
        em = emf.createEntityManager();
        
    }
    
    
    //CRUD EntityManagerFactory y EntityManager (JPA)
    
    @Override
    public T create(T t) {
        EntityTransaction entityTransaction = em.getTransaction();
        entityTransaction.begin();
        em.persist(t);
        entityTransaction.commit();
        em.refresh(t);
//        em.getEntityManagerFactory().getCache().evictAll();
       
        
        return t;
        
    }
    
    
    

    @Override
    public void delete(Class type, Object id) {
        Object ref = this.em.getReference(type, id);
        this.em.remove(ref);
    }

    @Override
    public T update(T t) {
        return (T)this.em.merge(t);
        
    }
    
    
        @Override
    public T find(Class type, Object id) {
     return (T) this.em.find(type, id);   
    }
    
    @Override
    public List<T> getAll(String namedQuery) {
        List<T> listEntity;
        Query query=em.createNamedQuery(namedQuery);        
        listEntity=(List<T>)query.getResultList();        
        return listEntity;
    }
    @Override
    public List<T> getById(String namedQuery) {
        List<T> listEntity;
        Query query=em.createNamedQuery(namedQuery);        
        listEntity=(List<T>)query.getResultList();        
        return listEntity;
    }

@Override
    public List<T> getByNombre(String namedQuery) {
        List<T> listEntity;
        Query query=em.createNamedQuery(namedQuery);        
        listEntity=(List<T>)query.getResultList();        
        return listEntity;
    }
@Override
    public List<T> getByApellido(String namedQuery) {
        List<T> listEntity;
        Query query=em.createNamedQuery(namedQuery);        
        listEntity=(List<T>)query.getResultList();        
        return listEntity;
    }
@Override
    public List<T> getByFechaNac(String namedQuery) {
        List<T> listEntity;
        Query query=em.createNamedQuery(namedQuery);        
        listEntity=(List<T>)query.getResultList();        
        return listEntity;
    }    
//       public List findWithNamedQuery(String queryName) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    




}
