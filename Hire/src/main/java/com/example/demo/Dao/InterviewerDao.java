package com.example.demo.Dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Model.BackgroundSync;


public interface InterviewerDao extends CrudRepository<BackgroundSync,String> {
	

}
