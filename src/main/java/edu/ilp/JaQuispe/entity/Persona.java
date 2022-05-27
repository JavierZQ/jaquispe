package edu.ilp.JaQuispe.entity;

import javax.persistence.*;

@Entity
@Table(name = "persona")
@Inheritance(strategy = InheritanceType.JOINED)
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpersona", length = 10)
    private Long idpersona;

    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;
    private String teledono;
    private String email;

    @OneToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "iddireccion")
    private Direccion iddireccion;

    public Persona() {
    }

    public Persona(Long idpersona) {
        this.idpersona = idpersona;
    }

    public Persona(Long idpersona, String nombre, String teledono, String email, Direccion iddireccion) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.teledono = teledono;
        this.email = email;
        this.iddireccion = iddireccion;
    }

    public Long getIdpersona() {

        return idpersona;
    }

    public void setIdpersona(Long idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTeledono() {
        return teledono;
    }

    public void setTeledono(String teledono) {
        this.teledono = teledono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Direccion getIddireccion() {
        return iddireccion;
    }

    public void setIddireccion(Direccion iddireccion) {
        this.iddireccion = iddireccion;
    }
}


