/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bennu.implementacion;

import com.bennu.dao.BennuDAO;
import com.bennu.dao.impl.BennuDAOImpl;
import com.bennu.entities.Alumnos;
import com.bennu.entities.Asignatura;
import com.bennu.entities.Colegio;
import com.bennu.entities.Nota;
import com.bennu.entities.Profesores;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author fabyo
 */
@Named
@RequestScoped 
public class BennuDAOFuncional {

    private static Colegio colegio;
    private static Alumnos alumnos;
    private static Profesores prof;
    private static Nota nota;
    private static Asignatura asign;
    private static List<Colegio> listaColegio;
    private static List<Alumnos> listaAlumnos;
    private static List<Profesores> listaProfesores;
    private static List<Nota> listaNota;
    private static List<Asignatura> listaAsignatura;
    

    private static BennuDAO dao;
    

    static {
        colegio = new Colegio();
        alumnos = new Alumnos();
        prof = new Profesores();
        nota = new Nota();
        asign = new Asignatura();
        listaColegio = new LinkedList<>();
        listaAlumnos = new LinkedList<>();
        listaProfesores = new LinkedList<>();
        listaNota = new LinkedList<>();
        listaAsignatura = new LinkedList<>();

        dao = new BennuDAOImpl();
    }
//    int id, not;
//    String nombre, apellido, ubicacion;
//    Date fechaNac;

    public BennuDAOFuncional() {
    }

    //Colegio
    public static boolean createColegio(String nombre, String ubicacion) {
        colegio.setId(Integer.SIZE);
        colegio.setNombre(nombre);
        colegio.setUbicacion(ubicacion);
        colegio = (Colegio) dao.create(colegio);        
       return true;

    }

    public static boolean updateColegio(String nombre, String ubicacion) {
        colegio.setNombre(nombre);
        colegio.setUbicacion(ubicacion);
        colegio = (Colegio) dao.update(colegio);
        return true;
    }

    public static void deleteColegio(int id) {
        
        dao.delete(Colegio.class, id);
    }
    

    

    //Alumno
    public static boolean createAlumno(String nombre, String apellido, Date fechaNac, Colegio colegio) {
        alumnos.setId(Integer.SIZE);
        alumnos.setNombre(nombre);
        alumnos.setApellido(apellido);
        alumnos.setFechaNac(fechaNac);
        alumnos.setIdColegio(colegio);
        alumnos = (Alumnos) dao.create(alumnos);
        return true;

    }

    public static boolean updateAlumnos(String nombre, String apellido, Date fechaNac, Colegio colegio) {
        alumnos.setNombre(nombre);
        alumnos.setApellido(apellido);
        alumnos.setFechaNac(fechaNac);
        alumnos.setIdColegio(colegio);
        alumnos = (Alumnos) dao.create(alumnos);
       return true;
    }

    public static void deleteAlumnos(int id) {
        alumnos.setId(id);
       dao.delete(Alumnos.class, id);
    }

    //Profesores
    public static boolean createProfesores(String nombre, String apellido, Date fechaNac, Boolean activo, Asignatura asign, Colegio colegio) {
        prof.setId(Integer.SIZE);
        prof.setNombre(nombre);
        prof.setApellido(apellido);
        prof.setFechaNac(fechaNac);
        prof.setIdAsignatura(asign);
        prof.setActivo(activo);
        prof.setIdColegio(colegio);
        prof = (Profesores) dao.create(prof);
        return true;

    }

    public static boolean updateProfesores(String nombre, String apellido, Date fechaNac, Boolean activo) {
        prof.setNombre(nombre);
        prof.setApellido(apellido);
        prof.setFechaNac(fechaNac);
        prof.setIdAsignatura(asign);
        prof.setIdColegio(colegio);
        prof.setActivo(activo);
        prof = (Profesores) dao.create(prof);
        return true;
    }

    public static void deleteProfesores(Profesores profesores) {
        prof.setId(prof.getId());
        dao.delete(Profesores.class, profesores.getId());
    }

    //Notas
    public static boolean createNota(int puntaje) {
        nota.setId(Integer.SIZE);
        nota.setIdAlumno(alumnos);
        nota.setIdAsignatura(asign);
        nota.setNota(puntaje);
        nota = (Nota) dao.create(nota);
        return true;

    }

    public static boolean updateNota(int puntaje) {
        nota.setNota(puntaje);
        nota = (Nota) dao.create(nota);
        return true;
    }

    public static void deleteNota(int id) {
        nota.setId(id);
        dao.delete(Nota.class, id);
    }
    
    //Asignatura
    public static boolean createAsignatura(String nombre) {
        asign.setId(Integer.SIZE);
        asign.setNombre(nombre);
        
        asign = (Asignatura) dao.create(asign);
        return true;

    }

    public static boolean updateAsignatura(String nombre) {
//        asign.setId(id);
        asign.setNombre(nombre);
        
        asign = (Asignatura) dao.create(asign);
        return true;
    }

    public static void deleteAsignatura(int id) {
        asign.setId(id);
        dao.delete(Asignatura.class, id);
        
        
    }
    
   
    
    
    //Read
    //Colegio
    public static List<Colegio> findAllColegio(String namedQuery){
        listaColegio = (List<Colegio>)dao.getAll(namedQuery);
        return listaColegio;
        
    }
    public static List<Colegio> findByIdColegio(String namedQuery){
        listaColegio = (List<Colegio>)dao.getAll(namedQuery);
        return listaColegio;
        
    }
    public static List<Colegio> findByNombreColegio(String namedQuery){
        listaColegio = (List<Colegio>)dao.getAll(namedQuery);
        return listaColegio;
        
    }
    public static List<Colegio> findByUbicacionColegio(String namedQuery){
        listaColegio = (List<Colegio>)dao.getAll(namedQuery);
        return listaColegio;
        
    }
    public static List<Colegio> findNombreColegio(String namedQuery){
        listaColegio = (List<Colegio>)dao.getAll(namedQuery);
        return listaColegio;
        
    }
   
    
    
    //Alumnos
    public static List<Alumnos> findAllAlumnos(String namedQuery){
        listaAlumnos = (List<Alumnos>)dao.getAll(namedQuery);
        return listaAlumnos;
        
    }
    public static List<Alumnos> findByIdAlumnos(String namedQuery){
        listaAlumnos = (List<Alumnos>)dao.getAll(namedQuery);
        return listaAlumnos;
        
    }
    public static List<Alumnos> findByNombreAlumnos(String namedQuery){
        listaAlumnos = (List<Alumnos>)dao.getAll(namedQuery);
        return listaAlumnos;
        
    }
    public static List<Alumnos> findByApellidoAlumnos(String namedQuery){
        listaAlumnos = (List<Alumnos>)dao.getAll(namedQuery);
        return listaAlumnos;
        
    }
    public static List<Alumnos> findByColegioAlumnos(String namedQuery){
        listaAlumnos = (List<Alumnos>)dao.getAll(namedQuery);
        return listaAlumnos;
        
    }
    public static List<Alumnos> findByNotaAlumnos(String namedQuery){
        listaAlumnos = (List<Alumnos>)dao.getAll(namedQuery);
        return listaAlumnos;
        
    }
    public static List<Alumnos> findByfechaNacAlumnos(String namedQuery){
        listaAlumnos = (List<Alumnos>)dao.getAll(namedQuery);
        return listaAlumnos;
        
    }
    
    //Profesores
    public static List<Profesores> findAllProfesores(String namedQuery){
        listaProfesores = (List<Profesores>)dao.getAll(namedQuery);
        return listaProfesores;
        
    }
    public static List<Profesores> findByIdProfesores(String namedQuery){
        listaProfesores = (List<Profesores>)dao.getAll(namedQuery);
        return listaProfesores;
        
    }
    public static List<Profesores> findByNombreProfesores(String namedQuery){
        listaProfesores = (List<Profesores>)dao.getAll(namedQuery);
        return listaProfesores;
        
    }
    public static List<Profesores> findByApellidoProfesores(String namedQuery){
        listaProfesores = (List<Profesores>)dao.getAll(namedQuery);
        return listaProfesores;
        
    }
    public static List<Profesores> findByfechaNacProfesores(String namedQuery){
        listaProfesores = (List<Profesores>)dao.getAll(namedQuery);
        return listaProfesores;
        
    }
    public static List<Profesores> findByfActivo(String namedQuery){
        listaProfesores = (List<Profesores>)dao.getAll(namedQuery);
        return listaProfesores;
        
    }
    public static List<Profesores> findByColegioProfesores(String namedQuery){
        listaProfesores = (List<Profesores>)dao.getAll(namedQuery);
        return listaProfesores;
        
    }
    public static List<Profesores> findByAsignaturaProfesores(String namedQuery){
        listaProfesores = (List<Profesores>)dao.getAll(namedQuery);
        return listaProfesores;
        
    }
    
    //Nota
    public static List<Nota> findAllNota(String namedQuery){
        listaNota = (List<Nota>)dao.getAll(namedQuery);
        return listaNota;
        
    }
    public static List<Nota> findByIdNota(String namedQuery){
        listaNota = (List<Nota>)dao.getAll(namedQuery);
        return listaNota;
        
    }
    public static List<Nota> findByAlumosNota(String namedQuery){
        listaNota = (List<Nota>)dao.getAll(namedQuery);
        return listaNota;
        
    }
    public static List<Nota> findByNotasNota(String namedQuery){
        listaNota = (List<Nota>)dao.getAll(namedQuery);
        return listaNota;
        
    }
    public static List<Nota> findByAsignaturaNota(String namedQuery){
        listaNota = (List<Nota>)dao.getAll(namedQuery);
        return listaNota;
        
    }
    public static List<Nota> findByProfesorNota(String namedQuery){
        listaNota = (List<Nota>)dao.getAll(namedQuery);
        return listaNota;
        
    }
    
    //Asignatura
    public static List<Asignatura> findAllAsignatura(String namedQuery){
        listaAsignatura = (List<Asignatura>)dao.getAll(namedQuery);
        return listaAsignatura;
        
    }
    public static List<Asignatura> findByIdAsignatura(String namedQuery){
        listaAsignatura = (List<Asignatura>)dao.getAll(namedQuery);
        return listaAsignatura;
        
    }
    public static List<Asignatura> findByProfesorAsignatura(String namedQuery){
        listaAsignatura = (List<Asignatura>)dao.getAll(namedQuery);
        return listaAsignatura;
        
    }
    public static List<Asignatura> findByNombreAsignatura(String namedQuery){
        listaAsignatura = (List<Asignatura>)dao.getAll(namedQuery);
        return listaAsignatura;
        
    }
    
    
    
    public static void findById(String namedQuery){
        dao.getById(namedQuery);
        
    }
    public static void findByNombre(String namedQuery){
        dao.getByNombre(namedQuery);
        
    }
    public static void findByApellido(String namedQuery){
        dao.getByApellido(namedQuery); 
        
    }
    public static void findByFechaNac(String namedQuery){
        dao.getByFechaNac(namedQuery);
        
    }
    
}
