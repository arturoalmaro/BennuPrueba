package com.bennu.entities;

import com.bennu.entities.Asignatura;
import com.bennu.entities.Colegio;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-19T05:41:30")
@StaticMetamodel(Profesores.class)
public class Profesores_ { 

    public static volatile SingularAttribute<Profesores, Date> fechaNac;
    public static volatile SingularAttribute<Profesores, String> apellido;
    public static volatile SingularAttribute<Profesores, Integer> id;
    public static volatile SingularAttribute<Profesores, Asignatura> idAsignatura;
    public static volatile SingularAttribute<Profesores, String> nombre;
    public static volatile SingularAttribute<Profesores, Colegio> idColegio;
    public static volatile SingularAttribute<Profesores, Boolean> activo;

}