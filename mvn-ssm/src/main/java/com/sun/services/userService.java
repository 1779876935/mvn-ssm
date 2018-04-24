package com.sun.services;

import java.util.List;

import com.sun.entity.User;
import com.sun.entity.UserVo;

public interface userService {
	User getUserById(Integer id);
	List<User> getusers();
	List<User> getUserByLikeName(String name);
	int saveUser(User user);
	int updateByPrimaryKeySelective(User user);
	List<User> getUsersByPojo(User user);
	List<User> getUserFromIdList(List<Integer> ids);
	List<User> getUserFromVo(UserVo userVo);
}
