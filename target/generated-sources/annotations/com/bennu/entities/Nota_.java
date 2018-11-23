package com.bennu.entities;

import com.bennu.entities.Alumnos;
import com.bennu.entities.Asignatura;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-23T01:48:24")
@StaticMetamodel(Nota.class)
public class Nota_ { 

    public static volatile SingularAttribute<Nota, Alumnos> idAlumno;
    public static volatile SingularAttribute<Nota, Integer> id;
    public static volatile SingularAttribute<Nota, Asignatura> idAsignatura;
    public static volatile SingularAttribute<Nota, Integer> nota;

}