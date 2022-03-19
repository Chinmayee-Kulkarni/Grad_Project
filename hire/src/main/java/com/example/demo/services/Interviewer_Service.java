package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.example.demo.dao.Interviewer_Repository;
import com.example.demo.entities.Interviewer;

@Component
public class Interviewer_Service {
	
	@Autowired
	private Interviewer_Repository i1;
	
	public Interviewer getbyid(String id)
	{
		
		Optional<Interviewer> i2=i1.findById(id);
		return i2.get();
	
	}
	
	
	public void deletebyid(String id)
	{
		
		i1.deleteById(id);
	
	}


	public void updatebyid(String id) {
		// TODO Auto-generated method stub
		
	}


	public Interviewer updatebyid(Interviewer int1, String id) {
		// TODO Auto-generated method stub
		Optional<Interviewer> bb=i1.findById(id);
		Interviewer int2=bb.get();
		
		int2.setPrimary_Skill(int1.getPrimary_Skill());
		int2.setSecondary_Skill(int1.getSecondary_Skill());
		int2.setTertiary_Skill(int1.getTertiary_Skill());
		int2.setProfile_Image(int1.getProfile_Image());
		i1.save(int2);
		return int2;
		
	}
	
	

}
