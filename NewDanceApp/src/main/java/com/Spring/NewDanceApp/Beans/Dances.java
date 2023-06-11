package com.Spring.NewDanceApp.Beans;

public class Dances {
	
	
	private int id;
	private String name;
	private String state_of_origin;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState_of_origin() {
		return state_of_origin;
	}
	public void setState_of_origin(String state_of_origin) {
		this.state_of_origin = state_of_origin;
	}
	public Dances(int id, String name, String state_of_origin) {
		super();
		this.id = id;
		this.name = name;
		this.state_of_origin = state_of_origin;
	}
	public Dances() {
		super();
		// TODO Auto-generated constructor stub
	}
}