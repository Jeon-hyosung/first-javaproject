package com.kh.practice.rewind;

public class Animal {

	private String name;
	private String date;
	private char gender;
	private String species;
	
	private char vaccination;
	private String medicalDate;
	private int healthState;
	
	public Animal() {
		
	}
	public Animal(String name) {
		this.name = name;
	}
	public Animal(String name, String date) {
		this.name = name;
		this.date = date;
	}
	public Animal(String name, String date, char gender) {
		this.name = name;
		this.date = date;
		this.gender = gender;
	}
	public Animal(String name, String date, char gender, String species) {
		this.name = name;
		this.date = date;
		this.gender = gender;
		this.species = species;
	}

	public String getName() {
		return this.name;
	}
	public String getDate() {
		return this.date;
	}
	public char getGender() {
		return this.gender;
	}
	public String getSpecies() {
		return this.species;
	}
	public char getvaccination() {
		return this.vaccination;
	}
	public String getmedicalDate() {
		return this.medicalDate;
	}
	public int gethealthState() {
		return this.healthState;
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public void setvaccination(char vaccination) {
		this.vaccination = vaccination;
	}
	public void setmedicalDate(String medicalDate) {
		this.medicalDate = medicalDate;
	}
	public void sethealthState(int healthState) {
		this.healthState = healthState;
	}
















}
