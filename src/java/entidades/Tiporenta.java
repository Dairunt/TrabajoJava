/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author FrancoSebastian
 */
@Entity
@Table(name = "tiporenta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tiporenta.findAll", query = "SELECT t FROM Tiporenta t"),
    @NamedQuery(name = "Tiporenta.findById", query = "SELECT t FROM Tiporenta t WHERE t.id = :id"),
    @NamedQuery(name = "Tiporenta.findByNombre", query = "SELECT t FROM Tiporenta t WHERE t.nombre = :nombre")})
public class Tiporenta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Nombre")
    private String nombre;

    public Tiporenta() {
    }

    public Tiporenta(Integer id) {
        this.id = id;
    }

    public Tiporenta(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        if (!(object instanceof Tiporenta)) {
            return false;
        }
        Tiporenta other = (Tiporenta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Tiporenta[ id=" + id + " ]";
    }
    
}
