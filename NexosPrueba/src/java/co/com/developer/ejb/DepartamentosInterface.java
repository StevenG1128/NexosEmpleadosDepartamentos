/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.developer.ejb;


import co.com.developer.entity.Departamentos;
import java.util.List;
import javax.ejb.Local;



/**
 *
 * @author brayan.gomez
 */
@Local
public interface DepartamentosInterface {
    
    void create(Departamentos departamentos);

    void mod(Departamentos departamentos);

    void eliminar(Departamentos departamentos);

    Departamentos find(Object id);

    List<Departamentos> findAll();

    List<Departamentos> findRange(int[] range);

    int count();
}
