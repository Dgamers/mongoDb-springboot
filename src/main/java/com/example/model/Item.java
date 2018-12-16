package com.example.model;


public class Item {
	
	private String id;
	
	private String name;
	
	private String number;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Item(String id, String name, String number) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
	}

	
	public Item() {

	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", number=" + number + "]";
	}
	
	

}
