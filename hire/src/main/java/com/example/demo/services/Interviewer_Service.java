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
		Optional<Interviewer> i2=null;
		Interviewer i3=null;
		try
		{
		 i2=i1.findById(id);
		 i3=i2.get();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return i3;
	
	}
	
	
	public Interviewer deletebyid(String id)
	{
		Optional<Interviewer> i2=null;
		Interviewer i3=null;
		try
		{
		 i2=i1.findById(id);
		 i3=i2.get();
		 i1.deleteById(id);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	  return i3;
	
	}


	


	public Interviewer updatebyid(Interviewer int1, String id) {
		// TODO Auto-generated method stub
		Optional<Interviewer> bb=null;
		Interviewer int2=null;
		try
		{
		bb=i1.findById(id);
		int2=bb.get();
		int2.setPrimary_Skill(int1.getPrimary_Skill());
		int2.setSecondary_Skill(int1.getSecondary_Skill());
		int2.setTertiary_Skill(int1.getTertiary_Skill());
		int2.setProfile_Image(int1.getProfile_Image());
		i1.save(int2);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return int2;
	}


	public java.util.List<Interviewer> getall() {
		// TODO Auto-generated method stub
		java.util.List<Interviewer> list=(java.util.List<Interviewer>) i1.findAll();
		return list;
	}


	//public Interviewer getbyname(String username) {
		// TODO Auto-generated method stub
		
		
		//Interviewer i2=i1.findbyusername(username);
		//return i2;
	//}
	
	

}
