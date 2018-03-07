package com.sun.services;

import java.util.List;

import com.sun.entity.User;

public interface userService {
	User getUserById(Integer id);
	List<User> getusers();
}
