package edu.ilp.JaQuispe.service;

import edu.ilp.JaQuispe.entity.Curso;
import edu.ilp.JaQuispe.entity.Persona;


import java.util.List;

public interface ICursoService {

    List<Curso> listarPorNombre(String nom);

}
