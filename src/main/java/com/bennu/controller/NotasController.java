/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bennu.controller;

import com.bennu.entities.Nota;
import com.bennu.implementacion.BennuDAOFuncional;
import java.io.Serializable;
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
@ManagedBean
@RequestScoped
public class NotasController implements Serializable{
    
    private int id, puntaje;

    public NotasController() {
    }
    
    
    
    @Inject
   private BennuDAOFuncional func;
   
   @PostConstruct
   public void init(){
       
   }
    
    
    public boolean createNota(){
       
        return func.createNota(getId());
        
    }
    
    public  boolean updateNota(){
        return func.updateNota(getId());
    }
    
    public void deleteNota(){
         func.deleteNota(getId());
    }
    
    
     public List<Nota> getAllNota(){       
        return func.findAllNota("Nota.findAll");
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
     * @return the func
     */
    public BennuDAOFuncional getFunc() {
        return func;
    }

    /**
     * @param func the func to set
     */
    public void setFunc(BennuDAOFuncional func) {
        this.func = func;
    }

    /**
     * @return the puntaje
     */
    public int getPuntaje() {
        return puntaje;
    }

    /**
     * @param puntaje the puntaje to set
     */
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    
}
