package edu.ilp.JaQuispe.entity;

import net.bytebuddy.implementation.bind.annotation.Empty;
import org.yaml.snakeyaml.events.Event;

import javax.persistence.*;

@Entity
@Table(name = "direccion")
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iddireccion;

    private String calle;
    private String cuidad;
    private String estado;
    private String Pais;

    public Direccion() {
    }

    public Direccion(Long iddireccion) {
        this.iddireccion = iddireccion;
    }

    public Direccion(Long iddireccion, String calle, String cuidad, String estado, String pais) {
        this.iddireccion = iddireccion;
        this.calle = calle;
        this.cuidad = cuidad;
        this.estado = estado;
        Pais = pais;
    }

    public Long getIddireccion() {
        return iddireccion;
    }

    public void setIddireccion(Long iddireccion) {
        this.iddireccion = iddireccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }
}
