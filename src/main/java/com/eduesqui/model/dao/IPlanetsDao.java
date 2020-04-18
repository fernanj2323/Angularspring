package com.eduesqui.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.eduesqui.model.entitys.Planets;

public interface IPlanetsDao extends CrudRepository<Planets, Long> {

}
