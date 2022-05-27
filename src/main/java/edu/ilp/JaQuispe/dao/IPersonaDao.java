package edu.ilp.JaQuispe.dao;

import edu.ilp.JaQuispe.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPersonaDao extends JpaRepository<Persona,Long> {
    @Query("SELECT e FROM Persona e WHERE e.nombre LIKE CONCAT('%',:nom,'%') ")
    List<Persona> listarPorNombre(@Param("nom")String nom);
}
