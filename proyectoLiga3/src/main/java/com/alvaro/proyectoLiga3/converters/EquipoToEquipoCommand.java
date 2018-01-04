package com.alvaro.proyectoLiga3.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.alvaro.proyectoLiga3.command.EquipoCommand;
import com.alvaro.proyectoLiga3.domain.Equipo;

import lombok.Synchronized;

/**
 * Created by jt on 6/21/17.
 */
@Component
public class EquipoToEquipoCommand implements Converter<Equipo, EquipoCommand> {

   

   

    @Synchronized
    @Override
    public EquipoCommand convert(Equipo equipo) {
        if (equipo == null) {
            return null;
        }

        EquipoCommand equipoCommand = new EquipoCommand();
        equipoCommand.setId(equipo.getId());
        
        equipoCommand.setNombre(equipo.getNombre());
   
        return equipoCommand;
    }
}
