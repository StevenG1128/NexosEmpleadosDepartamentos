package co.com.developer.entity;

import co.com.developer.entity.Empleados;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-09-23T17:56:50")
@StaticMetamodel(Departamentos.class)
public class Departamentos_ { 

    public static volatile SingularAttribute<Departamentos, String> nombreDepto;
    public static volatile ListAttribute<Departamentos, Empleados> empleadosList;
    public static volatile SingularAttribute<Departamentos, Integer> codDepto;
    public static volatile SingularAttribute<Departamentos, Date> fechaHoraCrea;
    public static volatile SingularAttribute<Departamentos, Date> fechaHoraMod;
    public static volatile SingularAttribute<Departamentos, Integer> id;

}