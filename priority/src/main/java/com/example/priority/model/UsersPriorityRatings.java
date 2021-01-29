package com.example.priority.model;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  

@Entity
@Table

public class UsersPriorityRatings {
	@Id
	private int userId;
	@Column
	private String userName;
	@Column
	private int connections;
	@Column
	private int relationships;
	@Column
	private int career;
	@Column
	private int wealth;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getConnections() {
		return connections;
	}
	public void setConnections(int connections) {
		this.connections = connections;
	}
	public int getRelationships() {
		return relationships;
	}
	public void setRelationships(int relationships) {
		this.relationships = relationships;
	}
	public int getCareer() {
		return career;
	}
	public void setCareer(int career) {
		this.career = career;
	}
	public int getWealth() {
		return wealth;
	}
	public void setWealth(int wealth) {
		this.wealth = wealth;
	}
	
	

}
