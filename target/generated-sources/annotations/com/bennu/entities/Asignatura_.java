package com.bennu.entities;

import com.bennu.entities.Nota;
import com.bennu.entities.Profesores;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-23T01:48:24")
@StaticMetamodel(Asignatura.class)
public class Asignatura_ { 

    public static volatile SingularAttribute<Asignatura, Integer> id;
    public static volatile SingularAttribute<Asignatura, String> nombre;
    public static volatile ListAttribute<Asignatura, Nota> notaList;
    public static volatile ListAttribute<Asignatura, Profesores> profesoresList;

}