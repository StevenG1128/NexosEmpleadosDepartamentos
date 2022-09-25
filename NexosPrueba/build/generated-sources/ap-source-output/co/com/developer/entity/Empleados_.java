package co.com.developer.entity;

import co.com.developer.entity.Departamentos;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-09-23T17:56:50")
@StaticMetamodel(Empleados.class)
public class Empleados_ { 

    public static volatile SingularAttribute<Empleados, String> apellidos;
    public static volatile SingularAttribute<Empleados, Integer> docNumero;
    public static volatile SingularAttribute<Empleados, String> ciudad;
    public static volatile SingularAttribute<Empleados, String> correo;
    public static volatile SingularAttribute<Empleados, String> direccion;
    public static volatile SingularAttribute<Empleados, Date> fechaHoraMod;
    public static volatile SingularAttribute<Empleados, Date> fechaHoraCrea;
    public static volatile SingularAttribute<Empleados, Integer> id;
    public static volatile SingularAttribute<Empleados, Departamentos> deptoId;
    public static volatile SingularAttribute<Empleados, Integer> telefono;
    public static volatile SingularAttribute<Empleados, String> nombres;
    public static volatile SingularAttribute<Empleados, String> docTipo;

}