/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bennu.controller;

import com.bennu.entities.Alumnos;
import com.bennu.entities.Asignatura;
import com.bennu.entities.Colegio;
import com.bennu.implementacion.BennuDAOFuncional;
import com.bennu.util.RequestContextUtil;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
//import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author fabyo
 */

//@Named
@ManagedBean(name = "alumnoC") 

@RequestScoped
public class AlumnosController implements Serializable{
    
    
    private String nombre, apellido;
    private Date fechaNac;
    private int id;
    private Colegio colegio;
    private Asignatura asignatura;
    

    public AlumnosController() {
    }
    
    
    @Inject
   private BennuDAOFuncional func;
   
   @PostConstruct
   public void init(){
       
   }
    
    
    public boolean createAlumnos(){
       
        return getFunc().createAlumno(getNombre(), getApellido(), getFechaNac(), colegio);
        
    }
    
    public  boolean updateAlumnos(){
        return getFunc().updateAlumnos(getNombre(), getApellido(), getFechaNac(), colegio);
    }
    
    public void deleteAlumnos(Alumnos alumnos){
         getFunc().deleteAlumnos(alumnos);
    }
    
     public List<Alumnos> getAllAlumnos(){       
        return getFunc().findAllAlumnos("Alumnos.findAll");
    }
     public List<Alumnos> getById(){       
        return getFunc().findByIdAlumnos("Alumnos.findById");
    }
     public List<Alumnos> getByNombre(){       
        return getFunc().findByNombreAlumnos("Alumnos.findByNombre");
    }
     public List<Alumnos> getByApellido(){       
        return getFunc().findByApellidoAlumnos("Alumnos.findByApellido");
    }
     public List<Alumnos> getByFechaNac(){       
        return getFunc().findByfechaNacAlumnos("Alumnos.findByFechaNac");
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
    
    
    
    public void seleccion(SelectEvent event) {
        FacesMessage msg = new FacesMessage("Alumno Elegido", ((Alumnos) event.getObject()).getId().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void irANota() throws IOException{        
        
        FacesContext.getCurrentInstance().getExternalContext().redirect(RequestContextUtil.getContexPath()+"/faces/view/template/notasAlumno/notasAlumnoTemplateClient.xhtml");
    }
   
    public void irAtras() throws IOException{
        
        FacesContext.getCurrentInstance().getExternalContext().redirect(RequestContextUtil.getContexPath()+"/faces/view/template/alumnos/alumnosTemplateClient.xhtml");
    }
    public void irUpdate() throws IOException{
        
        FacesContext.getCurrentInstance().getExternalContext().redirect(RequestContextUtil.getContexPath()+"/faces/view/template/updateAlumnos/actualizarAlumnosTemplateClient.xhtml");
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
