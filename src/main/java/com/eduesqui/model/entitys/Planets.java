package com.eduesqui.model.entitys;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;

@Entity
@Table(name="planets")
public class Planets implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name; 
	private String rotation_period;
	private String orbital_period;
	private String diameter;
	private String climate;
	private String gravity; 
	private String terrain;
	private String surface_water;
	private String population;
	@Column(name="created")
	private Date created;
	private String click_count; 
	//relacion 1 a muchos con personas
	//OneToMany

//  @Override
//    public String toString() {
//        return "EmployeeVO [id=" + id + ", firstName=" + firstName + ", 
//                lastName=" + lastName + ", email=" + email  + "]";
//    }
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRotation_period() {
		return rotation_period;
	}
	public void setRotation_period(String rotation_period) {
		this.rotation_period = rotation_period;
	}
	public String getOrbital_period() {
		return orbital_period;
	}
	public void setOrbital_period(String orbital_period) {
		this.orbital_period = orbital_period;
	}
	public String getDiameter() {
		return diameter;
	}
	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}
	public String getClimate() {
		return climate;
	}
	public void setClimate(String climate) {
		this.climate = climate;
	}
	public String getGravity() {
		return gravity;
	}
	public void setGravity(String gravity) {
		this.gravity = gravity;
	}
	public String getTerrain() {
		return terrain;
	}
	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}
	public String getSurface_water() {
		return surface_water;
	}
	public void setSurface_water(String surface_water) {
		this.surface_water = surface_water;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void setCreationDate(Date date) {
		// TODO Auto-generated method stub
		
	}
	public String getClick_count() {
		return click_count;
	}
	public void setClick_count(String click_count) {
		this.click_count = click_count;
	}
	
}
