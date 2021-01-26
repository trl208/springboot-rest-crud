package com.example.priority.model;
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  

@Entity
@Table

public class PriorityAreas {
	
	@Id
	private int priorityId;
	@Column
	private String priorityArea;
	public int getPriorityId() {
		return priorityId;
	}
	public void setPriorityId(int priorityId) {
		this.priorityId = priorityId;
	}
	public String getPriorityArea() {
		return priorityArea;
	}
	public void setPriorityArea(String priorityArea) {
		this.priorityArea = priorityArea;
	}
	
		

}
