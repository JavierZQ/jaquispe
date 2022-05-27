package edu.ilp.JaQuispe.service.impl;

import edu.ilp.JaQuispe.dao.ICursoDao;
import edu.ilp.JaQuispe.entity.Curso;
import edu.ilp.JaQuispe.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements ICursoService {
    @Autowired
    private ICursoDao cursoDao;

    @Override
    public List<Curso> listarPorNombre(String nom) {
        return this.cursoDao.listarPorNombre(nom);
    }
}
