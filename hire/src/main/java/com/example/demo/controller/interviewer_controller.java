package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Interviewer;
import com.example.demo.services.Interviewer_Service;



@RestController
public class interviewer_controller {
	 @Autowired
	 private Interviewer_Service is;
	 
	
	 
	@GetMapping("/interviewer/{id}")
	public  Interviewer getbyid(@PathVariable("id")String id)
	{
		
		return is.getbyid(id);
	}
	
	
	@DeleteMapping("/interviewer/{id}")
	public  void deletebyid(@PathVariable("id")String id)
	{
		
		 is.deletebyid(id);
		 System.out.print("deleted successfully");
	}
	
	@PutMapping("/interviewer/{id}")
	public  Interviewer updatebyid(@RequestBody Interviewer int1,@PathVariable("id")String id)
	{
		
		 
		 System.out.print("updated successfully");
		 return is.updatebyid(int1,id);
	}
	
	
	
	
	
	
	
	

}
