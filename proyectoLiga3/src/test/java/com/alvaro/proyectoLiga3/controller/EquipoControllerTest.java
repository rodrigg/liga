package com.alvaro.proyectoLiga3.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.alvaro.proyectoLiga3.domain.Equipo;
import com.alvaro.proyectoLiga3.service.EquipoService;



public class EquipoControllerTest {
	
	  @Mock
	    EquipoService equipoService;

	    EquipoController controller;

	    MockMvc mockMvc;

	    @Before
	    public void setUp() throws Exception {
	        MockitoAnnotations.initMocks(this);

	        controller = new EquipoController(equipoService);
	        mockMvc = MockMvcBuilders.standaloneSetup(controller)
	                
	                .build();
	    }
	    @Test
	    public void setUpListOfTeams() throws Exception {
	    	List<Equipo> equipos=new ArrayList<>();
	    	Equipo equipo1 = new Equipo();
	    	equipo1.setNombre("Athletic");
	    	Equipo equipo2 = new Equipo();
	    	equipo2.setNombre("Barça");
	    	equipos=Arrays.asList(equipo1,equipo2);
	    	when(equipoService.obtenerEquipos()).thenReturn(equipos);
	    	
	    	mockMvc.perform(get("/equipos"))
            .andExpect(status().isOk())
            .andExpect(view().name("index"))
            .andExpect(model().attributeExists("equipos"));
	    	
	    	verify(equipoService,times(1)).obtenerEquipos();
	    }

}
