/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.developer.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author brayan.gomez
 */
@Entity
@Table(name = "empleados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleados.findAll", query = "SELECT e FROM Empleados e")
    , @NamedQuery(name = "Empleados.findById", query = "SELECT e FROM Empleados e WHERE e.id = :id")
    , @NamedQuery(name = "Empleados.findByDocTipo", query = "SELECT e FROM Empleados e WHERE e.docTipo = :docTipo")
    , @NamedQuery(name = "Empleados.findByDocNumero", query = "SELECT e FROM Empleados e WHERE e.docNumero = :docNumero")
    , @NamedQuery(name = "Empleados.findByNombres", query = "SELECT e FROM Empleados e WHERE e.nombres = :nombres")
    , @NamedQuery(name = "Empleados.findByApellidos", query = "SELECT e FROM Empleados e WHERE e.apellidos = :apellidos")
    , @NamedQuery(name = "Empleados.findByCiudad", query = "SELECT e FROM Empleados e WHERE e.ciudad = :ciudad")
    , @NamedQuery(name = "Empleados.findByDireccion", query = "SELECT e FROM Empleados e WHERE e.direccion = :direccion")
    , @NamedQuery(name = "Empleados.findByCorreo", query = "SELECT e FROM Empleados e WHERE e.correo = :correo")
    , @NamedQuery(name = "Empleados.findByTelefono", query = "SELECT e FROM Empleados e WHERE e.telefono = :telefono")
    , @NamedQuery(name = "Empleados.findByFechaHoraCrea", query = "SELECT e FROM Empleados e WHERE e.fechaHoraCrea = :fechaHoraCrea")
    , @NamedQuery(name = "Empleados.findByFechaHoraMod", query = "SELECT e FROM Empleados e WHERE e.fechaHoraMod = :fechaHoraMod")})
public class Empleados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "doc_tipo")
    private String docTipo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "doc_numero")
    private int docNumero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombres")
    private String nombres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "apellidos")
    private String apellidos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ciudad")
    private String ciudad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "correo")
    private String correo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "telefono")
    private int telefono;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_hora_crea")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraCrea;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_hora_mod")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraMod;
    @JoinColumn(name = "depto_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Departamentos deptoId;

    public Empleados() {
    }

    public Empleados(Integer id) {
        this.id = id;
    }

    public Empleados(Integer id, String docTipo, int docNumero, String nombres, String apellidos, String ciudad, String direccion, String correo, int telefono, Date fechaHoraCrea, Date fechaHoraMod) {
        this.id = id;
        this.docTipo = docTipo;
        this.docNumero = docNumero;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.fechaHoraCrea = fechaHoraCrea;
        this.fechaHoraMod = fechaHoraMod;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocTipo() {
        return docTipo;
    }

    public void setDocTipo(String docTipo) {
        this.docTipo = docTipo;
    }

    public int getDocNumero() {
        return docNumero;
    }

    public void setDocNumero(int docNumero) {
        this.docNumero = docNumero;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Date getFechaHoraCrea() {
        return fechaHoraCrea;
    }

    public void setFechaHoraCrea(Date fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
    }

    public Date getFechaHoraMod() {
        return fechaHoraMod;
    }

    public void setFechaHoraMod(Date fechaHoraMod) {
        this.fechaHoraMod = fechaHoraMod;
    }

    public Departamentos getDeptoId() {
        return deptoId;
    }

    public void setDeptoId(Departamentos deptoId) {
        this.deptoId = deptoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleados)) {
            return false;
        }
        Empleados other = (Empleados) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.developer.entity.Empleados[ id=" + id + " ]";
    }
    
}
