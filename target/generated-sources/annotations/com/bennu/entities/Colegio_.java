package com.bennu.entities;

import com.bennu.entities.Alumnos;
import com.bennu.entities.Profesores;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-20T13:19:09")
@StaticMetamodel(Colegio.class)
public class Colegio_ { 

    public static volatile SingularAttribute<Colegio, String> ubicacion;
    public static volatile ListAttribute<Colegio, Alumnos> alumnosList;
    public static volatile SingularAttribute<Colegio, Integer> id;
    public static volatile SingularAttribute<Colegio, String> nombre;
    public static volatile ListAttribute<Colegio, Profesores> profesoresList;

}