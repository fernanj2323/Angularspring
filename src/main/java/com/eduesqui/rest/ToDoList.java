package com.eduesqui.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduesqui.model.entitys.People;
import com.eduesqui.model.entitys.Planets;
import com.eduesqui.model.service.IPlanetService;
import com.eduesqui.model.service.ITaskService;
import com.eduesqui.model.service.PlanetsService;

@RestController
@RequestMapping (value="api")
public class ToDoList {
	
	private Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ITaskService taskService;
	@Autowired
	private IPlanetService PlanetsService;

	
	//gets
    @CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping(value="people")
	public List<People> getTasks() {
		return taskService.getTask();
	}
    @CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping(value="planets")
	public List<Planets> getPlanet() {
		return PlanetsService.getPlanet();
	}

	
	//post
    @CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping(value="people")
	public People addTask(@RequestBody People reqPeople)  {
		return taskService.addTask(reqPeople);
	}
    @CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping(value="planet")
	public Planets addPlanet(@RequestBody Planets reqPlanet)  {
		return PlanetsService.addPlanet(reqPlanet);
	}
	
	
	//puts
    @CrossOrigin(origins = "*", allowedHeaders = "*")
	@PutMapping(value="people")
	public People updateTask(@RequestBody People reqPeople)  {
		return taskService.addTask(reqPeople);
	}
    @CrossOrigin(origins = "*", allowedHeaders = "*")
	@PutMapping(value="planet")
	public Planets updatePlanet(@RequestBody Planets reqPlanet)  {
		return PlanetsService.updatePlanet(reqPlanet);
	}
	
	
	//deletes
    @CrossOrigin(origins = "*", allowedHeaders = "*")
	@DeleteMapping(value="people/{id}" )
	public boolean deleteTask(@PathVariable(value="id") Long id) {
		taskService.removeTask(id);
		return true;
	}
	
	//findByid
    @CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping(value="planets/{id}")
	public Object planetById(@PathVariable(value="id") Long id) {
	   return PlanetsService.planetById(id); 
	}
    
    @CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping(value="people/{id}")
	public Object peopleById(@PathVariable(value="id") Long id) {
	   return taskService.peopleById(id); 
	}
	
	
	
	
	
}
