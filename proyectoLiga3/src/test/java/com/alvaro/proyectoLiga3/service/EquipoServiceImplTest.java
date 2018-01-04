package com.alvaro.proyectoLiga3.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.stereotype.Service;

import com.alvaro.proyectoLiga3.domain.Equipo;
import com.alvaro.proyectoLiga3.repository.EquipoRepository;


@Service
public class EquipoServiceImplTest {
	
	  @Mock
	  EquipoRepository equipoRepository;
	  EquipoServiceImpl equipoService;
	 
	
	

	 @Before
	 public void setUp() throws Exception {
	        MockitoAnnotations.initMocks(this);
	        
	        equipoService = new EquipoServiceImpl(equipoRepository);
	      ;
	       
	  }
	 
	 @Test
	 public void obtenerLista() throws Exception{
		  Equipo equipo1 = new Equipo();
	        equipo1.setId(1);
	        equipo1.setNombre("Athletic");
	        Equipo equipo2 = new Equipo();
	        equipo2.setId(2);
	        equipo2.setNombre("Barça");
	        Iterable<Equipo> equipos;
	        equipos=Arrays.asList(equipo1,equipo2);
	        when(equipoRepository.findAll()).thenReturn(equipos);
		 List<Equipo> obtenerEquipos = equipoService.obtenerEquipos();
		
		 
		 verify(equipoRepository, times(1)).findAll();
		 assertEquals(2, obtenerEquipos.size());
		 
		 
	 }

}
