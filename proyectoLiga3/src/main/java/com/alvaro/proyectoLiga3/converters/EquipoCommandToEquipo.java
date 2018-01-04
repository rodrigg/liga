package com.alvaro.proyectoLiga3.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.alvaro.proyectoLiga3.command.EquipoCommand;
import com.alvaro.proyectoLiga3.domain.Equipo;

/**
 * Created by jt on 6/21/17.
 */
@Component
public class EquipoCommandToEquipo implements Converter<EquipoCommand, Equipo> {

   
    
    @Override
    public Equipo convert(EquipoCommand source) {
        if (source == null) {
            return null;
        }

        final Equipo equipo = new Equipo();
        equipo.setId(source.getId());
        equipo.setNombre(source.getNombre());
      
      
        return equipo;
    }
}
