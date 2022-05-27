package edu.ilp.JaQuispe.service;

import edu.ilp.JaQuispe.entity.Persona;

import java.util.List;

public interface IPersonaService {
    //listar
    List<Persona> listarPersona();
    List<Persona> listarPorNombre(String nom);
}
