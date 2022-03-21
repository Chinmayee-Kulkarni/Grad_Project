package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.background_Repository;
import com.example.demo.entities.background_sync;

@Component
public class background_service {
	
	@Autowired
	private background_Repository b;

	public void create(background_sync int1) {
		// TODO Auto-generated method stub
		
		b.save(int1);
		
		
	}

}
