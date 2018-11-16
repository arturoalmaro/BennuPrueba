/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bennu.controller;

import com.bennu.entities.Asignatura;
import com.bennu.entities.Colegio;
import com.bennu.entities.Profesores;
import com.bennu.implementacion.BennuDAOFuncional;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
//import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author fabyo
 */

//@Named
@ManagedBean(name = "profesoresController")
@RequestScoped
public class ProfesoresController implements Serializable{
    
    private String nombre, apellido;
    private Date fechaNac;
    private int id;
    private Boolean activo;
    private Colegio colegio;
    private Asignatura asignatura;

    public ProfesoresController() {
    }
    
    @Inject
   private BennuDAOFuncional func;
   
   @PostConstruct
   public void init(){
       
   }
   
   public boolean createProfesores(){       
        return func.createProfesores(nombre, apellido, fechaNac, activo);
        
    }
    
    public  boolean updateProfesores(){
        return func.updateProfesores(nombre, apellido, fechaNac, activo);
    }
    
    public void deleteProfesores(){
         func.deleteProfesores(id);
    }
    
     public List<Profesores> getAllProfesores(){       
        return func.findAllProfesores("Profesores.findAll");
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
     * @return the activo
     */
    public Boolean getActivo() {
        return activo;
    }

    /**
     * @param activo the activo to set
     */
    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    
    public String irNotasAgregar(){
        
        return "/faces/view/template/notasAgregar/notasAgregarTemplateClient.xhtml";
    }
   
    public String irAtras(){
        
        return "/faces/view/template/profesores/profesoresTemplateClient.xhtml";
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

    /**
     * @return the asignatura
     */
    public Asignatura getAsignatura() {
        return asignatura;
    }

    /**
     * @param asignatura the asignatura to set
     */
    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
    
    
    
    
    
}
