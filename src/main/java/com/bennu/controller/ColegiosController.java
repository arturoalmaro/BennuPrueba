/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bennu.controller;


import com.bennu.dao.BennuDAO;
import com.bennu.entities.Colegio;
import com.bennu.implementacion.BennuDAOFuncional;
import com.bennu.util.RequestContextUtil;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
//import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
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
        listColegio = new ArrayList<Colegio>();
        listColegio = func.findAllColegio("Colegio.findAll");
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
    
    public void deleteColegio(Colegio colegio){
//       colegio =  func.findColegio(colegio);
         func.deleteColegio(colegio);
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
     
      public void irAtras() throws IOException{
        
        FacesContext.getCurrentInstance().getExternalContext().redirect(RequestContextUtil.getContexPath()+"/faces/view/template/colegios/colegiosTemplateClient.xhtml");
    }
    public void irUpdate() throws IOException{
        
        FacesContext.getCurrentInstance().getExternalContext().redirect(RequestContextUtil.getContexPath()+"/faces/view/template/updateColegio/updateColegioTemplateClient.xhtml");
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
     * @param idColegio
     * @return the colegio
     */
    public Colegio getColegio(Integer id) {
         if (id == null){
            throw new IllegalArgumentException("no id provided");
        }
        for (Colegio colegio : listColegio){
            if (id.equals(colegio.getId())){
                return colegio;
            }
        }
        return null;
    }

    /**
     * @param colegio the colegio to set
     */
    public void setColegio(Colegio colegio) {
        this.colegio = colegio;
    }

    /**
     * @return the listColegio
     */
    public List<Colegio> getListColegio() {
        return listColegio;
    }

    /**
     * @param listColegio the listColegio to set
     */
    public void setListColegio(List<Colegio> listColegio) {
        this.listColegio = listColegio;
    }
    
    
    
    
}
