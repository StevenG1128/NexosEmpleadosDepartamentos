/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.developer.ejb;

import co.com.developer.entity.Empleados;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author brayan.gomez
 */
@Local
public interface EmpleadosInterface {

    void create(Empleados empleados);

    void edit(Empleados empleados);

    void remove(Empleados empleados);

    Empleados find(Object id);

    List<Empleados> findAll();

    List<Empleados> findRange(int[] range);

    int count();
}
