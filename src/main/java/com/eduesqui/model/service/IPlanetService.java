package com.eduesqui.model.service;

import java.util.List;


import com.eduesqui.model.entitys.Planets;

public interface IPlanetService {

	
	public List<Planets> getPlanet();
	public Planets addPlanet(Planets Planets);
	public void removePlanet(Long id);
	public Planets updatePlanet(Planets Planets);
	public Object planetById(Long id);
}
