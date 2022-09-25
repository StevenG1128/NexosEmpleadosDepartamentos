package co.com.developer.controller;


import co.com.developer.ejb.DepartamentosInterface;
import co.com.developer.entity.Departamentos;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
@SessionScoped


@ManagedBean

public class manejadorDeptos implements Serializable {
/**
 *
 * @author brayan.gomez
 */
    @EJB
    private DepartamentosInterface departamentosFacade;
    private List<Departamentos> listaDepartamentos;
    private Departamentos departamentos;
    private String message;

    public List<Departamentos> getListaDepartamentos() {
        this.listaDepartamentos = this.departamentosFacade.findAll();
        return listaDepartamentos;
    }

    public void setListaDepartamentos(List<Departamentos> listaDepartamentos) {
        this.listaDepartamentos = listaDepartamentos;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

    @PostConstruct
    public void init() {
        this.departamentos = new Departamentos();
    }
    
    public void guardar(){
        try {
            this.departamentosFacade.create(departamentos);
            this.message = "El Departamento A Sido Creado.";
            this.departamentos = new Departamentos();
        } catch (Exception ex) {
            ex.printStackTrace();
            this.message = "Error - Caused By: " + ex.getMessage();
        }
        FacesMessage msn = new FacesMessage(this.message);
        FacesContext.getCurrentInstance().addMessage(null, msn);
    }
     
    
    public void editar(){
        try {
            this.departamentosFacade.mod(departamentos);
            this.message = "El Departamento Fue Actualizado.";
            this.departamentos = new Departamentos();
        } catch (Exception ex) {
            ex.printStackTrace();
            this.message = "Error - Caused By: " + ex.getMessage();
        }
        FacesMessage msn = new FacesMessage(this.message);
        FacesContext.getCurrentInstance().addMessage(null, msn);
    }
    
    public void eliminar(Departamentos objDep){
        try {
            this.departamentosFacade.eliminar(objDep);
            this.message = "Este Departamento Fue eliminado.";
        } catch (Exception ex) {
            ex.printStackTrace();
            this.message = "Error - Caused By: " + ex.getMessage();
        }
        FacesMessage msn = new FacesMessage(this.message);
        FacesContext.getCurrentInstance().addMessage(null, msn);
    }
    
    public void pintar(Departamentos objDep){
        this.departamentos = objDep;
    }
    
    public void limpiar(){
        this.departamentos = new Departamentos();
    }
}
