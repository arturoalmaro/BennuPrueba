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

    
//    Borrar
    public void deleteColegio(int id);
    public void deleteProfesores(Object id);
    public void deleteAsignatura(Object id);
    public void deleteNota(Object id);
    public void deleteAlumnos(Object id);
    public void delete(Class type, Object id);

//    
//    Actualizar
    public T update(T t);

    
//    Leer
    
//    public List findWithNamedQuery(String queryName);
    public   T find(Class type,Object id);
    public List<T> getAll(String namedQuery);
    public List<T> getById (String namedQuery);
    public List<T> getByNombre (String namedQuery);
    public List<T> getByApellido (String namedQuery);
    public List<T> getByFechaNac (String namedQuery);
    
    

    
    
    
    
}
