package com.eduesqui.model.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduesqui.model.dao.ITaskDao;
import com.eduesqui.model.entitys.People;
import com.eduesqui.model.entitys.Planets;


@Service
public class TaskService implements ITaskService {
	
	 @Autowired
	private ITaskDao taskDao;
	
	public List<People> getTask() {
		return (List<People>) taskDao.findAll();
	}
	
	public Optional<People> personById(Long id){
		return taskDao.findById(id);
	}

	@Override
	public People addTask(People People) {
		People.setCreationDate(new Date());
		//task.setStatus(0);	
		return taskDao.save(People);
	}

	@Override
	public void removeTask(Long id) {
		taskDao.deleteById(id);
	}
	
	public Optional<People> peopleById(Long id){
	return taskDao.findById(id);
	}
	

	@Override
	public People updateTask(People People) {	
		return taskDao.save(People);
	}
}
