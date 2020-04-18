package com.eduesqui.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.eduesqui.model.entitys.People;


public interface ITaskDao extends CrudRepository<People, Long> {
 public People findByName(String people);
 
}
	