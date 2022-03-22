package com.example.demo.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Interviewer;

public interface Interviewer_Repository extends CrudRepository<Interviewer,String> {
	//@Query(value="select * from interviewer u where u.username=:n1",nativeQuery=true)
	//public Interviewer findbyusername(@Param("n1")String username);

}
