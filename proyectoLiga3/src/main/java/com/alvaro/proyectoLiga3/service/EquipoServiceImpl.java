package com.alvaro.proyectoLiga3.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alvaro.proyectoLiga3.domain.Equipo;
import com.alvaro.proyectoLiga3.repository.EquipoRepository;
@Service
public class EquipoServiceImpl implements EquipoService {
	private EquipoRepository equipoRepository;
	
	
	public EquipoServiceImpl(EquipoRepository equipoRepository) {
		super();
		this.equipoRepository = equipoRepository;
	}

	@Override
	public List<Equipo> obtenerEquipos() {
		List<Equipo> equipos =new ArrayList<Equipo>();
		equipoRepository.findAll().iterator().forEachRemaining(equipos::add);;
		
		return equipos;
	}

	@Override
	public Equipo obtenerEquipo(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarEquipo(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Equipo grabar(Equipo equipo) {
		// TODO Auto-generated method stub
		return null;
	}

}
