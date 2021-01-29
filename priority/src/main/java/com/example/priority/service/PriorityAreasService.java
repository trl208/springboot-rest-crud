package com.example.priority.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.priority.model.PriorityAreas;
import com.example.priority.repository.PriorityAreasRepository;

@Service
public class PriorityAreasService {

	@Autowired  
	PriorityAreasRepository priorityAreasRepository;  
	//getting all priority areass record by using the method findaAll() of CrudRepository  
	public List<PriorityAreas> getAllPriorityAreas() {
		
		List<PriorityAreas> priorityAreas = new ArrayList<PriorityAreas>();  
		priorityAreasRepository.findAll().forEach(priorityAreas1 -> priorityAreas.add((PriorityAreas) priorityAreas1));  
		
		return priorityAreas;  
	}

	public void saveOrUpdate(PriorityAreas priorityAreas) {
		// TODO Auto-generated method stub
		
	}

}
