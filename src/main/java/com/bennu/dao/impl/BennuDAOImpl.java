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
    
//    Colegio colegio = new Colegio();
//    Alumnos alumnos = new Alumnos();
//    Profesores profesores = new Profesores();
//    Nota nota = new Nota();
//    Asignatura asignatura = new Asignatura();
    
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
        em.getTransaction().begin();
        this.em.remove(id);
        em.getTransaction().commit();
//        Object ref = this.em.getReference(type, id);
//        this.em.remove(ref);
    }

    @Override
    public T update(T t) {
        return (T)this.em.merge(t);
        
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
    

//    public List findWithNamedQuery(String queryName) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public List<Alumnos> findAllAlumnos() {
//        List<Alumnos> listAlumnos;
//        Query query = em.createNamedQuery("Alumnos.findAll");
//        listAlumnos = (List<Alumnos>)query.getResultList();
//        return listAlumnos;
//       
//    }
//
//    @Override
//    public List<Alumnos> findByIdAlumnos() {
//        List<Alumnos> listAlumnos;
//        Query query = em.createNamedQuery("Alumnos.findById");
//        listAlumnos = (List<Alumnos>)query.getResultList();
//        return listAlumnos;
//    }
//
//    @Override
//    public List<Alumnos> findByNombreAlumnos() {
//    
//        List<Alumnos> listAlumnos;
//        Query query = em.createNamedQuery("Alumnos.findByNombre");
//        listAlumnos = (List<Alumnos>)query.getResultList();
//        return listAlumnos;
//    }
//
//    @Override
//    public List<Alumnos> findByApellidoAlumnos() {
//    
//        List<Alumnos> listAlumnos;
//        Query query = em.createNamedQuery("Alumnos.findByApellido");
//        listAlumnos = (List<Alumnos>)query.getResultList();
//        return listAlumnos;
//    }
//
//    @Override
//    public List<Alumnos> findByFechaNacAlumnos() {
//    
//        List<Alumnos> listAlumnos;
//        Query query = em.createNamedQuery("Alumnos.findByFechaNac");
//        listAlumnos = (List<Alumnos>)query.getResultList();
//        return listAlumnos;
//    }
//    
//
//    @Override
//    public List<Colegio> findAllColegios() {
//    
//        List<Colegio> listColegios;
//        Query query = em.createNamedQuery("Colegio.findAll");
//        listColegios = (List<Colegio>)query.getResultList();
//        return listColegios;
//    }
//
//    @Override
//    public List<Colegio> findByIdColegios() {
//    
//        
//        List<Colegio> listColegios;
//        Query query = em.createNamedQuery("Colegio.findById");
//        listColegios = (List<Colegio>)query.getResultList();
//        return listColegios;
//    }
//
//    @Override
//    public List<Colegio> findByNombreColegios() {
//    
//        
//        List<Colegio> listColegios;
//        Query query = em.createNamedQuery("Colegio.findByNombre");
//        listColegios = (List<Colegio>)query.getResultList();
//        return listColegios;
//    }
//
//    @Override
//    public List<Colegio> findByUbicacionColegios() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public List<Profesores> findAllProfesores() {
//    
//        List<Profesores> listProfesores;
//        Query query = em.createNamedQuery("Profesores.findAll");
//        listProfesores = (List<Profesores>)query.getResultList();
//        return listProfesores;
//    }
//
//    @Override
//    public List<Profesores> findByIdProfesores() {
//        
//        
//        List<Profesores> listProfesores;
//        Query query = em.createNamedQuery("Profesores.findById");
//        listProfesores = (List<Profesores>)query.getResultList();
//        return listProfesores;
//    }
//
//    @Override
//    public List<Profesores> findByAsignaturaProfesores() {
//    
//        
//        List<Profesores> listProfesores;
//        Query query = em.createNamedQuery("Profesores.findAll");
//        listProfesores = (List<Profesores>)query.getResultList();
//        return listProfesores;
//    }
//
//    @Override
//    public List<Profesores> findByNombreProfesores() {
//    
//        
//        List<Profesores> listProfesores;
//        Query query = em.createNamedQuery("Profesores.findByNombre");
//        listProfesores = (List<Profesores>)query.getResultList();
//        return listProfesores;
//    }
//
//    @Override
//    public List<Profesores> findByApellidoProfesores() {
//       
//        List<Profesores> listProfesores;
//        Query query = em.createNamedQuery("Profesores.findByApellido");
//        listProfesores = (List<Profesores>)query.getResultList();
//        return listProfesores;
//    }
//
//    @Override
//    public List<Nota> findAllNotas() {
//       
//        List<Nota> listNotas;
//        Query query = em.createNamedQuery("Nota.findAll");
//        listNotas = (List<Nota>)query.getResultList();
//        return listNotas;
//    }
//
//    @Override
//    public List<Nota> findByNotaNotas() {
//    
//         List<Nota> listNotas;
//        Query query = em.createNamedQuery("Nota.findByNota");
//        listNotas = (List<Nota>)query.getResultList();
//        return listNotas;
//    }

//    @Override
//    public List<T> findAll(String namedQuery) {
//         List<T> list;
//        Query query = em.createNamedQuery(namedQuery);
//        list = (List<T>)query.getResultList();
//        return list;
//    }
//
//    @Override
//    public List<T> findById(String namedQuery) {
//         List<T> list;
//        Query query = em.createNamedQuery(namedQuery);
//        list = (List<T>)query.getResultList();
//        return list;
//    }
//
//    @Override
//    public List<T> findByNombre(String namedQuery) {
//         List<T> list;
//        Query query = em.createNamedQuery(namedQuery);
//        list = (List<T>)query.getResultList();
//        return list;
//    }
//
//    @Override
//    public List<T> findByApellido(String namedQuery) {
//         List<T> list;
//        Query query = em.createNamedQuery(namedQuery);
//        list = (List<T>)query.getResultList();
//        return list;
//    }
//
//    @Override
//    public List<T> findByFechaNac(String namedQuery) {
//         List<T> list;
//        Query query = em.createNamedQuery(namedQuery);
//        list = (List<T>)query.getResultList();
//        return list;
//    }
//
//    @Override
//    public List<T> findByAsignatura(String namedQuery) {
//         List<T> list;
//        Query query = em.createNamedQuery(namedQuery);
//        list = (List<T>)query.getResultList();
//        return list;
//    }
//
//    @Override
//    public List<T> findByNota(String namedQuery) {
//         List<T> list;
//        Query query = em.createNamedQuery(namedQuery);
//        list = (List<T>)query.getResultList();
//        return list;
//    }
//

    
    
    // PRueba
    
//    
//    @Override
//    public void createColegio(String nombre, String ubicacion) {
//        EntityTransaction entityTransaction = em.getTransaction();
//        entityTransaction.begin();
//        em.persist();
//        entityTransaction.commit();
//        em.refresh(t);
//        return t;
//    }
//
//    @Override
//    public void createAlumno(String nombre, String apellido, Date fechaNac, int idColegio) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void createProfesor(String nombre, String apellido, Date fechaNac, int idColegio, int idAsignatura) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void createNota(int nota, int idAsignatura) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void createAsignatura(String nombreAsignatura) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void deleteColegio(Colegio colegio) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void deleteAlumno(Alumnos alumno) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void deleteProfesor(Profesores profesor) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void deleteNota(Nota nota) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void deleteAsignatura(Asignatura asignatura) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void updateColegio(Colegio colegio) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void updateAlumno(Alumnos alumnos) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void updateProfesor(Profesores profesores) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void updateNota(Nota nota) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void updateAsignatura(Asignatura asignatura) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    
}
