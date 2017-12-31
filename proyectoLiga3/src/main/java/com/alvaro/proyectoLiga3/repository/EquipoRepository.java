package com.alvaro.proyectoLiga3.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alvaro.proyectoLiga3.domain.Equipo;
@Repository
public interface EquipoRepository extends CrudRepository<Equipo, Long> {

}
