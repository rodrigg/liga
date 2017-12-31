package com.alvaro.proyectoLiga3.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Equipo {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
 private long id;
 private String nombre;
}
