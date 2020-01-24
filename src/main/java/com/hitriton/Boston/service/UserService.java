package com.hitriton.Boston.service;

import java.util.List;

import com.hitriton.Boston.model.User;

public interface UserService {

	
	    User save(User user);

	    User findByUsername(String username);

	    List<String> findUsers(List<Long> idList);

	    List<User> findAllUsers();
	
}
