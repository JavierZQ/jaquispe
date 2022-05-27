package edu.ilp.JaQuispe.dao;

import edu.ilp.JaQuispe.entity.Estidiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IEstudianteDao extends JpaRepository<Estidiante,Long> {
    @Query("SELECT e FROM Estidiante e WHERE e.codigo = :codigo ")
    Estidiante buscarPorCodigo(@Param("codigo") String codigo);
}
