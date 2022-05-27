package edu.ilp.JaQuispe.service.impl;

import edu.ilp.JaQuispe.dao.IEstudianteDao;
import edu.ilp.JaQuispe.entity.Estidiante;
import edu.ilp.JaQuispe.service.IEstudianteSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteServiceImpl implements IEstudianteSevice {
    @Autowired
    private IEstudianteDao estudianteDao;

    @Override
    public Estidiante buscaPorCodigp(String codigo) {
        return this.estudianteDao.buscarPorCodigo(codigo);
    }
}
