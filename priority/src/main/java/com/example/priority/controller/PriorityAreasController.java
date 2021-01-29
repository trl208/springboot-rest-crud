package com.example.priority.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.priority.model.PriorityAreas;
import com.example.priority.service.PriorityAreasService;

@RestController

public class PriorityAreasController {
	
	@Autowired
	PriorityAreasService priorityAreasService;
	@RequestMapping(value = "/priorityAreas",produces = "application/json",method =RequestMethod.GET)

	//@GetMapping("/priorityAreas")  
	private List<PriorityAreas> getAllPriorityAreas()   
	{
		
	return priorityAreasService.getAllPriorityAreas();  
	}  

	/*
	 * //creating post mapping that post the book detail in the database
	 * 
	 * @PostMapping("/priorityAreas") private int savePriorityAreas(@RequestBody
	 * PriorityAreas priorityAreas) {
	 * priorityAreasService.saveOrUpdate(priorityAreas); //return priorityAreas.; }
	 */
	
}
