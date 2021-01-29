package com.example.priority.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.priority.model.UsersPriorityRatings;
import com.example.priority.repository.UsersPriorityRatingsRepository;


@Service
public class UsersPriorityRatingsService {

	@Autowired
 	UsersPriorityRatingsRepository usersPriorityRatingsRepository;  
	
	public void saveOrUpdate(UsersPriorityRatings usersPriorityRatings) {
		// TODO Auto-generated method stub
		
		usersPriorityRatingsRepository.save(usersPriorityRatings);  
	}

	public List<UsersPriorityRatings> getAllUsersPriorityRatings() {
		// TODO Auto-generated method stub
		return null;
	}

}
