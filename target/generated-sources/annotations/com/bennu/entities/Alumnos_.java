package com.bennu.entities;

import com.bennu.entities.Colegio;
import com.bennu.entities.Nota;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-19T05:41:30")
@StaticMetamodel(Alumnos.class)
public class Alumnos_ { 

    public static volatile SingularAttribute<Alumnos, Date> fechaNac;
    public static volatile SingularAttribute<Alumnos, String> apellido;
    public static volatile SingularAttribute<Alumnos, Integer> id;
    public static volatile SingularAttribute<Alumnos, String> nombre;
    public static volatile SingularAttribute<Alumnos, Colegio> idColegio;
    public static volatile ListAttribute<Alumnos, Nota> notaList;

}