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
import com.bennu.util.RequestContextUtil;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
//import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
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
    
    private String nombre, apellido, colegioSeleccionado, asignaturaSeleccionada;
    private Date fechaNac;
    private int id, idCol, idAs;
    private Boolean activo;
    private Colegio colegio;
    private Asignatura asignatura;
    private Profesores profesores;

    public ProfesoresController() {
    }
    
    @Inject
   private BennuDAOFuncional func;
   
   @PostConstruct
   public void init(){
       
   }
   
   public boolean createProfesores(){       
        return func.createProfesores(nombre, apellido, fechaNac, activo, Integer.parseInt(asignaturaSeleccionada), Integer.parseInt(colegioSeleccionado));
        
        
    }
//   public boolean createProfesores(){       
//        return func.createProfesores(nombre, apellido, fechaNac, activo, asignaturaSeleccionada, colegioSeleccionado);
//        
//        
//    }
    
    public  boolean updateProfesores(){
        return func.updateProfesores(nombre, apellido, fechaNac, activo);
    }
    
    public void deleteProfesores(Profesores profesores){
         func.deleteProfesores(profesores);
    }
    
     public List<Profesores> getAllProfesores(){       
        return func.findAllProfesores("Profesores.findAll");
    }
     
      public List<Profesores> getById(){       
        return getFunc().findByIdProfesores("Profesores.findById");
    }
     public List<Profesores> getByNombre(){       
        return getFunc().findByNombreProfesores("Profesores.findByNombre");
    }
     public List<Profesores> getByApellido(){       
        return getFunc().findByApellidoProfesores("Profesores.findByApellido");
    }
     public List<Profesores> getByFechaNac(){       
        return getFunc().findByfechaNacProfesores("Profesores.findByFechaNac");
    }
     public List<Profesores> getByActivo(){       
        return getFunc().findByfActivo("Profesores.findByActivo");
    }
     
//     public String ElegirColegio(){
//         return null;
//     }
//     public Asignatura ElegirAsignatura(){
//         return null;
//     }
     

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
     * @return the colegioSeleccionado
     */
    public String getColegioSeleccionado() {
        return colegioSeleccionado;
    }

    /**
     * @param colegioSeleccionado the colegioSeleccionado to set
     */
    public void setColegioSeleccionado(String colegioSeleccionado) {
        this.colegioSeleccionado = colegioSeleccionado;
    }

    /**
     * @return the asignaturaSeleccionada
     */
    public String getAsignaturaSeleccionada() {
        return asignaturaSeleccionada;
    }

    /**
     * @param asignaturaSeleccionada the asignaturaSeleccionada to set
     */
    public void setAsignaturaSeleccionada(String asignaturaSeleccionada) {
        this.asignaturaSeleccionada = asignaturaSeleccionada;
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
    
      public void irAgregarNota() throws IOException{        
        
        FacesContext.getCurrentInstance().getExternalContext().redirect(RequestContextUtil.getContexPath()+"/faces/view/template/notasAgregar/notasAgregarTemplateClient.xhtml");
    }
   
    public void irAtras() throws IOException{
        
        FacesContext.getCurrentInstance().getExternalContext().redirect(RequestContextUtil.getContexPath()+"/faces/view/template/profesores/profesoresTemplateClient.xhtml");
    }
    public void irUpdate() throws IOException{
        
        FacesContext.getCurrentInstance().getExternalContext().redirect(RequestContextUtil.getContexPath()+"/faces/view/template/updateProfesores/updateProfesoresTemplateClient.xhtml");
    }

    /**
     * @return the idCol
     */
    public int getIdCol() {
        return idCol;
    }

    /**
     * @param idCol the idCol to set
     */
    public void setIdCol(int idCol) {
        this.idCol = idCol;
    }

    /**
     * @return the idAs
     */
    public int getIdAs() {
        return idAs;
    }

    /**
     * @param idAs the idAs to set
     */
    public void setIdAs(int idAs) {
        this.idAs = idAs;
    }

  
    
    
    
}
