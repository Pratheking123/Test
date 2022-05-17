package com.EnquiryManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.EnquiryManagement.entity.User;

public interface UserRepository {

	public void save(User user);

	public void deleteById(int id);

	@Query("select u FROM user u WHERE u.name = :n")
	public List<User> getUserByName(@Param("n") String name);

	public User authenticateUser(User user) ;

	}
