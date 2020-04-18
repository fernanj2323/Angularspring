package com.eduesqui.model.entitys;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;

@Entity
@Table(name="people")
public class People implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String height;
	private String mass;
	private String hair_color;
	private String skin_color;
	private String eye_color;
	private String birth_year;
	private String gender;
	private String homeworld;
	//private String films; //relacionado
	//private String species; //relacionado
	//private String vehicles; //relacionados
	//private String starships; //relacionado
	@Column(name="created")
	private Date created;
	private String click_count; 
	
	//relacion muchos a uno con planets 
	//ManyToOne
	@ManyToOne(cascade = CascadeType.ALL) //todos los cambios que se hagan en la tabla padre afectan a la talba hijo 
    @JoinColumn(name = "PLANETS_ID") //llave foranea que hace referencia al id de la tabla planets 
	private Planets planets;
	
	
	public Planets getPlanets() {
		return planets;
	}

	public void setPlanets(Planets planets) {
		this.planets = planets;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return name;
	}

	public void setDescription(String name) {
		this.name = name;
	}

	public String getStatus() {
		return height;
	}

	public void setStatus(String height) {
		this.height = height;
	}

	public Date getCreationDate() {
		return created;
	}

	public void setCreationDate(Date created) {
		this.created = created;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getMass() {
		return mass;
	}

	public void setMass(String mass) {
		this.mass = mass;
	}

	public String getHair_color() {
		return hair_color;
	}

	public void setHair_color(String hair_color) {
		this.hair_color = hair_color;
	}

	public String getSkin_color() {
		return skin_color;
	}

	public void setSkin_color(String skin_color) {
		this.skin_color = skin_color;
	}

	public String getEye_color() {
		return eye_color;
	}

	public void setEye_color(String eye_color) {
		this.eye_color = eye_color;
	}

	public String getBirth_year() {
		return birth_year;
	}

	public void setBirth_year(String birth_year) {
		this.birth_year = birth_year;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHomeworld() {
		return homeworld;
	}

	public void setHomeworld(String homeworld) {
		this.homeworld = homeworld;
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

	public String getClick_count() {
		return click_count;
	}

	public void setClick_count(String click_count) {
		this.click_count = click_count;
	}
	
	
	
}
