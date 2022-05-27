package edu.ilp.JaQuispe.entity;

import javax.persistence.*;

@Entity
@Table(name = "profesor")
@PrimaryKeyJoinColumn(referencedColumnName = "IDPERSONA")
public class Profesor extends Persona {

    @Column(name = "idprofesor",length = 10,nullable = false)
    private String idpofesor;

    @Column(name = "salario",length = 10)
    private int salario;

    public Profesor() {
    }

    public Profesor(String idpofesor) {
        this.idpofesor = idpofesor;
    }

    public Profesor(String idpofesor, int salario) {
        this.idpofesor = idpofesor;
        this.salario = salario;
    }

    public Profesor(Long idpersona, String idpofesor, int salario) {
        super(idpersona);
        this.idpofesor = idpofesor;
        this.salario = salario;
    }

    public Profesor(Long idpersona, String nombre, String teledono, String email, Direccion iddireccion, String idpofesor, int salario) {
        super(idpersona, nombre, teledono, email, iddireccion);
        this.idpofesor = idpofesor;
        this.salario = salario;
    }

    public String getIdpofesor() {
        return idpofesor;
    }

    public void setIdpofesor(String idpofesor) {
        this.idpofesor = idpofesor;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
