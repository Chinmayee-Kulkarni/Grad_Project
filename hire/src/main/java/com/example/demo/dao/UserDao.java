package com.example.demo.dao;


import com.example.demo.entities.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.User;

import java.util.List;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {
    @Query(value = "select * from users where is_active=1", nativeQuery = true)
    List<User> getAllUsers();

    @Query(value = " select * from users where user_id = :n and is_active=1",  nativeQuery = true)
    User getUserById(@Param("n") int id);





}
