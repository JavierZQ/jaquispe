package edu.ilp.JaQuispe.service.impl;

import edu.ilp.JaQuispe.dao.IPersonaDao;
import edu.ilp.JaQuispe.entity.Persona;
import edu.ilp.JaQuispe.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonaServiceImpl implements IPersonaService {
    @Autowired
    private IPersonaDao personaDao;
    @Override
    public List<Persona> listarPersona() {
        return this.personaDao.findAll();
    }

    @Override
    public List<Persona> listarPorNombre(String nom) {
        return this.personaDao.listarPorNombre(nom);
    }
}
