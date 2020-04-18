package com.eduesqui.model.service;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduesqui.model.dao.IPlanetsDao;
import com.eduesqui.model.entitys.People;
import com.eduesqui.model.entitys.Planets;



@Service
public class PlanetsService  implements IPlanetService {

	 @Autowired
	private IPlanetsDao planetsDao;
	

	public List<Planets> getPlanet() {
		return (List<Planets>) planetsDao.findAll();
	}
	

	
	@Override
	public Planets addPlanet(Planets Planets) {
		Planets.setCreationDate(new Date());
		return planetsDao.save(Planets);
	}
	
	@Override
	public void removePlanet(Long id) {
		planetsDao.deleteById(id);
	}

	public Optional<Planets> planetById(Long id){
	return planetsDao.findById(id);
	}
	
	
	@Override
	public Planets updatePlanet(Planets Planets) {	
		return planetsDao.save(Planets);
	}
	
	
	
	
	

}
