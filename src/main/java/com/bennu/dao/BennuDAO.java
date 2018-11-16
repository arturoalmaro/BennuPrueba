/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bennu.dao;

import com.bennu.entities.Alumnos;
import com.bennu.entities.Asignatura;
import com.bennu.entities.Colegio;
import com.bennu.entities.Nota;
import com.bennu.entities.Profesores;
import java.util.Date;
import java.util.List;



/**
 *
 * @author Luis Almaro
 * @param <T>
 *
 */

public interface BennuDAO<T>{
    
//    Crear 
    public T create(T t);
//    public void createColegio(String nombre, String ubicacion);
//    public void createAlumno(String nombre, String apellido, Date fechaNac, int idColegio);
//    public void createProfesor(String nombre, String apellido, Date fechaNac, int idColegio, int idAsignatura);
//    public void createNota(int nota, int idAsignatura);
//    public void createAsignatura(String nombreAsignatura);
    
//    Borrar
    public void delete(Class type, Object id);
//    public void deleteColegio(Colegio colegio);
//    public void deleteAlumno(Alumnos alumno);
//    public void deleteProfesor(Profesores profesor);
//    public void deleteNota(Nota nota);
//    public void deleteAsignatura(Asignatura asignatura);
//    
//    Actualizar
    public T update(T t);
//    public void updateColegio(Colegio colegio);
//    public void updateAlumno(Alumnos alumnos);
//    public void updateProfesor(Profesores profesores);
//    public void updateNota(Nota nota);
//    public void updateAsignatura(Asignatura asignatura);
    
//    Leer
    
//    public T findById(Class type, Object id);
//    public List findWithNamedQuery(String queryName);
    public List<T> getAll(String namedQuery);
    public List<T> getById (String namedQuery);
    public List<T> getByNombre (String namedQuery);
    public List<T> getByApellido (String namedQuery);
    public List<T> getByFechaNac (String namedQuery);
    
    
//    public List<T> findAll(String namedQuery);
//    public List<T> findById(String namedQuery);
//    public List<T> findByNombre(String namedQuery);
//    public List<T> findByApellido(String namedQuery);
//    public List<T> findByFechaNac(String namedQuery);
//            
//    public List<T> findByAsignatura(String namedQuery);
//    
//    public List<T> findByNota(String namedQuery);
    
    
//    //Alumnos
//    public List<Alumnos> findAllAlumnos();
//    public List<Alumnos> findByIdAlumnos();
//    public List<Alumnos> findByNombreAlumnos();
//    public List<Alumnos> findByApellidoAlumnos();
//    public List<Alumnos> findByFechaNacAlumnos();
//    
//    //Colegios
//    public List<Colegio> findAllColegios();
//    public List<Colegio> findByIdColegios();
//    public List<Colegio> findByNombreColegios();
//    public List<Colegio> findByUbicacionColegios();
//    
//    //Profesores
//    public List<Profesores> findAllProfesores();
//    public List<Profesores> findByIdProfesores();
//    public List<Profesores> findByAsignaturaProfesores();
//    public List<Profesores> findByNombreProfesores();
//    public List<Profesores> findByApellidoProfesores();
//    
//    //Nota
//    
//    public List<Nota> findAllNotas();
//    public List<Nota> findByNotaNotas();
    
    
    
    
}
