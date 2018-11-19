/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bennu.controller;


import com.bennu.dao.BennuDAO;
import com.bennu.entities.Colegio;
import com.bennu.implementacion.BennuDAOFuncional;
import java.io.Serializable;
import java.util.List;
//import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
//import javax.inject.Named;

/**
 *
 * @author fabyo
 */

@RequestScoped
@ManagedBean(name = "colegioC")
//@Named
public class ColegiosController implements Serializable{
    
  
    private int id;
    private String nombre, ubicacion;
    private List<Colegio> listColegio;
    private Colegio colegio;

    

    public ColegiosController() {
    }
    
        
   @Inject
   BennuDAOFuncional func;
   
   @PostConstruct
   public void init(){
       
   }
    
    
    public boolean createColegio(){       
        return func.createColegio(nombre, ubicacion);
        
    }
    
    public  boolean updateColegio(){
        return func.updateColegio(nombre, ubicacion);
    }
    
    public void deleteColegio(){
         func.deleteColegio(colegio.getId());
    }
    
    public List<Colegio> getAllColegio(){       
        return func.findAllColegio("Colegio.findAll");
    }
      public List<Colegio> getById(){       
        return func.findByIdColegio("Colegio.findById");
    }
     public List<Colegio> getByNombre(){       
        return func.findByNombreColegio("Colegio.findByNombre");
    }
     public List<Colegio> getElNombre(){       
        return func.findByNombreColegio("Colegio.findNombreColegio");
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
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {        
        this.ubicacion = ubicacion;
    }

    /**
     * @return the colegio
     */
    public Colegio getColegio() {
        return colegio;
    }

    /**
     * @param colegio the colegio to set
     */
    public void setColegio(Colegio colegio) {
        this.colegio = colegio;
    }
    
    
    
    
}
