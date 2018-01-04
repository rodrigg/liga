package com.alvaro.proyectoLiga3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.alvaro.proyectoLiga3.service.EquipoService;

@Controller
public class EquipoController {
	
	private EquipoService equipoService;

	
	
	
	public EquipoController(EquipoService equipoService) {
		super();
		this.equipoService = equipoService;
	}




	@GetMapping({"/","equipos"})
	public String equipo(Model model){
		model.addAttribute("equipos",equipoService.obtenerEquipos());
		
		return "index";
	}
}
