package com.EnquiryManagement.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.EnquiryManagement.entity.User;
import com.EnquiryManagement.repository.UserRepository;
import com.EnquiryManagement.service.UserService;

@Service
@Component
public class UserServiceImpl implements UserService {


	@Autowired
	private UserRepository urepo;

	
	public User addUser(User user) {
		urepo.save(user);
		return null;
	}


	public User editUser(User user) {
		urepo.save(user);
		return user;
	}

	
	public User deleteUser(int id) {
		urepo.deleteById(id);
		return null;
	}

	
	public List<User> getUserByName(String name) {
		List<User> u = urepo.getUserByName(name);
		return u;
	}


	public User authenticateUser(User user) {

		return urepo.authenticateUser(user);
	}

}
