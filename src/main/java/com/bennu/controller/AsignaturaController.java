/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bennu.controller;

import com.bennu.entities.Asignatura;
import com.bennu.implementacion.BennuDAOFuncional;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author fabyo
 */
@Named
@RequestScoped
@ManagedBean
public class AsignaturaController implements Serializable{
    
    private  String nombre, apellido;
    private Date fechaNac;
    private int id;

    public AsignaturaController() {
    }
    
    
    @Inject
   BennuDAOFuncional func;
   
   @PostConstruct
   public void init(){
       
   }
   
     public boolean createColegio(){
       
        return func.createAsignatura(nombre);
        
    }
    
    public  boolean updateAsignatura(){
        return func.updateAsignatura(nombre);
    }
    
    public void deleteAsignatura(){
         func.deleteAsignatura(id);
    }
    
     public List<Asignatura> getAllAsignatura(){       
        return func.findAllAsignatura("Asignatura.findAll");
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the fechaNac
     */
    public Date getFechaNac() {
        return fechaNac;
    }

    /**
     * @param fechaNac the fechaNac to set
     */
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    
  
    
    
}
