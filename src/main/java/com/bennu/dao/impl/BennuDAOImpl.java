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
import com.bennu.util.RequestContextUtil;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;
import javax.naming.InitialContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.UserTransaction;


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
//        UserTransaction transaction = (UserTransaction)new InitialContext().lookup("java:app/bennuprueba");
//        transaction.begin();
        em.persist(t);
//        transaction.commit();
        entityTransaction.commit();
        em.refresh(t);
//        em.getEntityManagerFactory().getCache().evictAll();
       
        
        return t;
        
    }
    
    
    

    @Override
    public void deleteColegio(int id) {
        EntityTransaction entityTransaction = em.getTransaction();
        Colegio ref = this.em.find(Colegio.class, id);        
        entityTransaction.begin();        
//        if(ref !=null){
        this.em.remove(ref);
        entityTransaction.commit();
        
    }
    @Override
    public void deleteProfesores(Object id) {
        EntityTransaction entityTransaction = em.getTransaction();
        Profesores ref = this.em.find(Profesores.class, id);        
        entityTransaction.begin();        
        this.em.remove(ref);
        entityTransaction.commit();
    }
    @Override
    public void deleteAsignatura(Object id) {
       EntityTransaction entityTransaction = em.getTransaction();
        Asignatura ref = this.em.find(Asignatura.class, id);        
        entityTransaction.begin();        
        this.em.remove(ref);
        entityTransaction.commit();
    }
    @Override
    public void deleteNota(Object id) {
       EntityTransaction entityTransaction = em.getTransaction();
        Nota ref = this.em.find(Nota.class, id);        
        entityTransaction.begin();        
        this.em.remove(ref);
        entityTransaction.commit();
    }
    @Override
    public void deleteAlumnos(Object id) {
        EntityTransaction entityTransaction = em.getTransaction();
        Alumnos ref = this.em.find(Alumnos.class, id);        
        entityTransaction.begin();        
        this.em.remove(ref);
        entityTransaction.commit();
        
    }
    @Override
    public void delete(Class type, Object id) {
        Object ref = this.em.getReference(type, id);
        this.em.remove(ref);
    }

    @Override
    public T update(T t) {
        EntityTransaction entityTransaction = em.getTransaction();             
        entityTransaction.begin();        
        em.merge(t);
        entityTransaction.commit();
        em.refresh(t);
        return t;
        
        
    }
    
    @SuppressWarnings("unchecked")
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
