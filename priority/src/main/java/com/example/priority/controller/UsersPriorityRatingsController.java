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
import com.example.priority.model.UsersPriorityRatings;
import com.example.priority.service.PriorityAreasService;
import com.example.priority.service.UsersPriorityRatingsService;

@RestController

public class UsersPriorityRatingsController {
	
	@Autowired
	UsersPriorityRatingsService usersPriorityRatingsService;
	@RequestMapping(value = "/usersPriorityRatings",produces = "application/json",method=RequestMethod.GET)
	
	//@GetMapping("/usersPriorityRatings")  
	private List<UsersPriorityRatings> getAllUsersPriorityRatings()   
	{  
	return usersPriorityRatingsService.getAllUsersPriorityRatings();  
	}  

	
	  //creating post mapping that post the user priority ratings in the database
	@RequestMapping(value = "/usersPriorityRatings",produces = "application/json",method=RequestMethod.POST)
	//  @PostMapping("/usersPriorityRatings") 
	  private int saveUsersPriorityRatings(@RequestBody UsersPriorityRatings usersPriorityRatings) {
		
		usersPriorityRatingsService.saveOrUpdate(usersPriorityRatings); 
	  
	  //return UsersPriorityRatings.; }
	return usersPriorityRatings.getUserId();
	 

}
	  
}
