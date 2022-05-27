package edu.ilp.JaQuispe.entity;

import javax.persistence.*;

@Entity
@Table(name = "curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcuson;

    private String nombrecurso;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Profesor idprofesor;

    public Curso() {
    }

    public Curso(Long idcuson) {
        this.idcuson = idcuson;
    }

    public Curso(Long idcuson, String nombrecurso, Profesor idprofesor) {
        this.idcuson = idcuson;
        this.nombrecurso = nombrecurso;
        this.idprofesor = idprofesor;
    }

    public Long getIdcuson() {
        return idcuson;
    }

    public void setIdcuson(Long idcuson) {
        this.idcuson = idcuson;
    }

    public String getNombrecurso() {
        return nombrecurso;
    }

    public void setNombrecurso(String nombrecurso) {
        this.nombrecurso = nombrecurso;
    }

    public Profesor getIdprofesor() {
        return idprofesor;
    }

    public void setIdprofesor(Profesor idprofesor) {
        this.idprofesor = idprofesor;
    }
}
