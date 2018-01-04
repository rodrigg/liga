package com.alvaro.proyectoLiga3.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.alvaro.proyectoLiga3.domain.Equipo;
import com.alvaro.proyectoLiga3.repository.EquipoRepository;

@Component
public class Bootstrap  implements ApplicationListener<ContextRefreshedEvent> { 

private EquipoRepository equipoRepository;

public Bootstrap(EquipoRepository equipoRepository) {
		this.equipoRepository=equipoRepository;
	}

@Override
@Transactional
public void onApplicationEvent(ContextRefreshedEvent arg0) {
	Equipo equipo = new Equipo();
	equipo.setNombre("Athletic");
	equipoRepository.save(equipo);
	System.out.println("master");
	
}
}
