package com.eduesqui.model.service;

import java.util.List;

import com.eduesqui.model.entitys.People;


public interface ITaskService {

	
	public List<People> getTask();
	public People addTask(People task);
	public void removeTask(Long id);
	public People updateTask(People task);
	public Object peopleById(Long id);
	
}