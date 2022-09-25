/**
 *
 * @author brayan.gomez
 */
package co.com.developer.controller;


import co.com.developer.ejb.EmpleadosInterface;
import co.com.developer.entity.Departamentos;
import co.com.developer.entity.Empleados;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class manejadorEmpleados implements Serializable {

    @EJB
    private EmpleadosInterface empleadosFacade;
    private List<Empleados> listaEmpleados;
    private Empleados empleados;
    private Departamentos departamentos;
    private String message;

    public List<Empleados> getListaEmpleados() {
        this.listaEmpleados = this.empleadosFacade.findAll();
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleados> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public Empleados getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleados empleados) {
        this.empleados = empleados;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

    @PostConstruct
    public void init() {
        this.empleados = new Empleados();
        this.departamentos = new Departamentos();
    }

    public void guardar() {
        try {
            this.empleados.setDeptoId(departamentos);
            this.empleadosFacade.create(empleados);
            this.message = "El Empleado Fue creado Exitosamente";
            this.empleados = new Empleados();
            this.departamentos = new Departamentos();
        } catch (Exception ex) {
            ex.printStackTrace();
            this.message = "Error - Caused By: " + ex.getMessage();
        }
        FacesMessage msn = new FacesMessage(this.message);
        FacesContext.getCurrentInstance().addMessage(null, msn);
    }

    public void eliminar(Empleados objEmp) {
        try {
            this.empleadosFacade.remove(objEmp);
            this.message = "Este Empleado Fue eliminado.";
        } catch (Exception ex) {
            ex.printStackTrace();
            this.message = "Error - Caused By: " + ex.getMessage();
        }
        FacesMessage msn = new FacesMessage(this.message);
        FacesContext.getCurrentInstance().addMessage(null, msn);
    }

    public void pintar(Empleados objEmp) {
        this.empleados = objEmp;
    }

    public void edit() {
        try {
            this.empleados.setDeptoId(departamentos);
            this.empleadosFacade.edit(empleados);
            this.message = "El Empleado A Sido Actualizado.";
            this.departamentos = new Departamentos();
        } catch (Exception ex) {
            ex.printStackTrace();
            this.message = "Error - Caused By: " + ex.getMessage();
        }
        FacesMessage msn = new FacesMessage(this.message);
        FacesContext.getCurrentInstance().addMessage(null, msn);
    }

    public void limpiar() {
        this.empleados = new Empleados();
        this.departamentos = new Departamentos();
    }
}
