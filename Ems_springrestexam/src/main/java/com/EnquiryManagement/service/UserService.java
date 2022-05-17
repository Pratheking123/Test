package com.EnquiryManagement.service;

import java.util.List;

import com.EnquiryManagement.entity.User;

public interface UserService {

	public User addUser(User user);

	public User editUser(User user);

//	public void editUser(User user, int id);

	public User deleteUser(int id);

	public List<User> getUserByName(String name);

	public User authenticateUser(User user) ;

}
