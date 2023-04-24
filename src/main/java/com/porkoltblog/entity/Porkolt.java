package com.porkoltblog.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Porkolt {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "porkolt_neve")
	private String name;
	
	@Column(name = "hozzavalok")
	private String ingredients;
	
	@Column(name = "recept")
	private String recipe;
	
	public Porkolt(long id, String name, String ingredients, String recipe) {
		super();
		this.id = id;
		this.name = name;
		this.ingredients = ingredients;
		this.recipe = recipe;
	}

	public Porkolt(String name, String ingredients, String recipe) {
		super();
		this.name = name;
		this.ingredients = ingredients;
		this.recipe = recipe;
	}

	public Porkolt() {
	
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getRecipe() {
		return recipe;
	}

	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}

	@Override
	public String toString() {
		return "Porkolt [id=" + id + ", name=" + name + ", ingredients=" + ingredients + ", recipe=" + recipe + "]";
	}
	
	

}
