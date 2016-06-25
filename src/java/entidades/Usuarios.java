/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
 * @author FrancoSebastian
 */
@Entity
@Table(name = "usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u"),
    @NamedQuery(name = "Usuarios.findByRut", query = "SELECT u FROM Usuarios u WHERE u.rut = :rut"),
    @NamedQuery(name = "Usuarios.findByNombre", query = "SELECT u FROM Usuarios u WHERE u.nombre = :nombre"),
    @NamedQuery(name = "Usuarios.findByFechaNacimiento", query = "SELECT u FROM Usuarios u WHERE u.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Usuarios.findByApellidoPaterno", query = "SELECT u FROM Usuarios u WHERE u.apellidoPaterno = :apellidoPaterno"),
    @NamedQuery(name = "Usuarios.findByApellidoMaterno", query = "SELECT u FROM Usuarios u WHERE u.apellidoMaterno = :apellidoMaterno"),
    @NamedQuery(name = "Usuarios.findByTelefono", query = "SELECT u FROM Usuarios u WHERE u.telefono = :telefono"),
    @NamedQuery(name = "Usuarios.findByEmail", query = "SELECT u FROM Usuarios u WHERE u.email = :email"),
    @NamedQuery(name = "Usuarios.findByDireccion", query = "SELECT u FROM Usuarios u WHERE u.direccion = :direccion"),
    @NamedQuery(name = "Usuarios.findBySueldoLiquido", query = "SELECT u FROM Usuarios u WHERE u.sueldoLiquido = :sueldoLiquido"),
    @NamedQuery(name = "Usuarios.findByPassword", query = "SELECT u FROM Usuarios u WHERE u.password = :password"),
    @NamedQuery(name = "Usuarios.findBySexo", query = "SELECT u FROM Usuarios u WHERE u.sexo = :sexo"),
    @NamedQuery(name = "Usuarios.findByEnfermedadCronica", query = "SELECT u FROM Usuarios u WHERE u.enfermedadCronica = :enfermedadCronica"),
    @NamedQuery(name = "Usuarios.findByNumeroHijos", query = "SELECT u FROM Usuarios u WHERE u.numeroHijos = :numeroHijos"),
    @NamedQuery(name = "Usuarios.findByIdEstadoCivil", query = "SELECT u FROM Usuarios u WHERE u.idEstadoCivil = :idEstadoCivil"),
    @NamedQuery(name = "Usuarios.findByIdTipoEducacion", query = "SELECT u FROM Usuarios u WHERE u.idTipoEducacion = :idTipoEducacion"),
    @NamedQuery(name = "Usuarios.findByIdComuna", query = "SELECT u FROM Usuarios u WHERE u.idComuna = :idComuna"),
    @NamedQuery(name = "Usuarios.findByIdTipoUsuario", query = "SELECT u FROM Usuarios u WHERE u.idTipoUsuario = :idTipoUsuario")})
public class Usuarios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "Rut")
    private String rut;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "FechaNacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ApellidoPaterno")
    private int apellidoPaterno;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ApellidoMaterno")
    private int apellidoMaterno;
    @Size(max = 30)
    @Column(name = "Telefono")
    private String telefono;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "Email")
    private String email;
    @Size(max = 50)
    @Column(name = "Direccion")
    private String direccion;
    @Column(name = "SueldoLiquido")
    private Integer sueldoLiquido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Password")
    private String password;
    @Size(max = 10)
    @Column(name = "Sexo")
    private String sexo;
    @Column(name = "EnfermedadCronica")
    private Boolean enfermedadCronica;
    @Column(name = "NumeroHijos")
    private Integer numeroHijos;
    @Column(name = "IdEstadoCivil")
    private Integer idEstadoCivil;
    @Column(name = "IdTipoEducacion")
    private Integer idTipoEducacion;
    @Column(name = "IdComuna")
    private Integer idComuna;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdTipoUsuario")
    private int idTipoUsuario;

    public Usuarios() {
    }

    public Usuarios(String rut) {
        this.rut = rut;
    }

    public Usuarios(String rut, String nombre, int apellidoPaterno, int apellidoMaterno, String password, int idTipoUsuario) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.password = password;
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(int apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public int getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(int apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getSueldoLiquido() {
        return sueldoLiquido;
    }

    public void setSueldoLiquido(Integer sueldoLiquido) {
        this.sueldoLiquido = sueldoLiquido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Boolean getEnfermedadCronica() {
        return enfermedadCronica;
    }

    public void setEnfermedadCronica(Boolean enfermedadCronica) {
        this.enfermedadCronica = enfermedadCronica;
    }

    public Integer getNumeroHijos() {
        return numeroHijos;
    }

    public void setNumeroHijos(Integer numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    public Integer getIdEstadoCivil() {
        return idEstadoCivil;
    }

    public void setIdEstadoCivil(Integer idEstadoCivil) {
        this.idEstadoCivil = idEstadoCivil;
    }

    public Integer getIdTipoEducacion() {
        return idTipoEducacion;
    }

    public void setIdTipoEducacion(Integer idTipoEducacion) {
        this.idTipoEducacion = idTipoEducacion;
    }

    public Integer getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(Integer idComuna) {
        this.idComuna = idComuna;
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rut != null ? rut.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.rut == null && other.rut != null) || (this.rut != null && !this.rut.equals(other.rut))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Usuarios[ rut=" + rut + " ]";
    }
    
}
