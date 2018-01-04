package com.alvaro.proyectoLiga3.service;

import java.util.List;

import com.alvaro.proyectoLiga3.domain.Equipo;

public interface EquipoService {
	
	public List<Equipo> obtenerEquipos();
	
	public Equipo obtenerEquipo(long id);
	
	public void eliminarEquipo(long id);
	
	public Equipo grabar(Equipo equipo);

}
