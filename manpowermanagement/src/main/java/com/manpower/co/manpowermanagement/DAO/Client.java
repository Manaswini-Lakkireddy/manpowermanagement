package com.manpower.co.manpowermanagement.DAO;

import jakarta.persistence.Entity;

@Entity
public class Client {

	private String Id;
	private String Name;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
}