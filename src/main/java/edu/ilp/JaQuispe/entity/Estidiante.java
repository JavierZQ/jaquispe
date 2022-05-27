package edu.ilp.JaQuispe.entity;

import javax.persistence.*;

@Entity
@Table(name = "estudiante")
@PrimaryKeyJoinColumn(referencedColumnName = "IDPERSONA")
public class Estidiante extends Persona {

    @Column(name = "codigo", length = 10, nullable = false)
    private String codigo;

    @Column(name = "serie", length = 50)
    private String serie;

    public Estidiante() {
    }

    public Estidiante(String codigo) {
        this.codigo = codigo;
    }

    public Estidiante(String codigo, String serie) {
        this.codigo = codigo;
        this.serie = serie;
    }

    public Estidiante(Long idpersona, String codigo, String serie) {
        super(idpersona);
        this.codigo = codigo;
        this.serie = serie;
    }

    public Estidiante(Long idpersona, String nombre, String teledono, String email, Direccion iddireccion, String codigo, String serie) {
        super(idpersona, nombre, teledono, email, iddireccion);
        this.codigo = codigo;
        this.serie = serie;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}