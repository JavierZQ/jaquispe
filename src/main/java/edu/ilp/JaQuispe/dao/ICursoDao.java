package edu.ilp.JaQuispe.dao;

import edu.ilp.JaQuispe.entity.Curso;
import edu.ilp.JaQuispe.entity.Estidiante;
import edu.ilp.JaQuispe.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ICursoDao extends JpaRepository<Curso,Long> {

    @Query("SELECT e FROM Curso e WHERE e.nombrecurso LIKE CONCAT('%',:nom,'%') ")
    List<Curso> listarPorNombre(@Param("nom")String nom);
}
