/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.developer.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author brayan.gomez
 */
@Entity
@Table(name = "departamentos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Departamentos.findAll", query = "SELECT d FROM Departamentos d")
    , @NamedQuery(name = "Departamentos.findById", query = "SELECT d FROM Departamentos d WHERE d.id = :id")
    , @NamedQuery(name = "Departamentos.findByCodDepto", query = "SELECT d FROM Departamentos d WHERE d.codDepto = :codDepto")
    , @NamedQuery(name = "Departamentos.findByNombreDepto", query = "SELECT d FROM Departamentos d WHERE d.nombreDepto = :nombreDepto")
    , @NamedQuery(name = "Departamentos.findByFechaHoraCrea", query = "SELECT d FROM Departamentos d WHERE d.fechaHoraCrea = :fechaHoraCrea")
    , @NamedQuery(name = "Departamentos.findByFechaHoraMod", query = "SELECT d FROM Departamentos d WHERE d.fechaHoraMod = :fechaHoraMod")})
public class Departamentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_depto")
    private int codDepto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre_depto")
    private String nombreDepto;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "deptoId")
    private List<Empleados> empleadosList;

    public Departamentos() {
    }

    public Departamentos(Integer id) {
        this.id = id;
    }

    public Departamentos(Integer id, int codDepto, String nombreDepto, Date fechaHoraCrea, Date fechaHoraMod) {
        this.id = id;
        this.codDepto = codDepto;
        this.nombreDepto = nombreDepto;
        this.fechaHoraCrea = fechaHoraCrea;
        this.fechaHoraMod = fechaHoraMod;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCodDepto() {
        return codDepto;
    }

    public void setCodDepto(int codDepto) {
        this.codDepto = codDepto;
    }

    public String getNombreDepto() {
        return nombreDepto;
    }

    public void setNombreDepto(String nombreDepto) {
        this.nombreDepto = nombreDepto;
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

    @XmlTransient
    public List<Empleados> getEmpleadosList() {
        return empleadosList;
    }

    public void setEmpleadosList(List<Empleados> empleadosList) {
        this.empleadosList = empleadosList;
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
        if (!(object instanceof Departamentos)) {
            return false;
        }
        Departamentos other = (Departamentos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.developer.entity.Departamentos[ id=" + id + " ]";
    }
    
}
