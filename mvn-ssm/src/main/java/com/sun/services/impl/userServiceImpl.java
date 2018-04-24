package com.sun.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sun.dao.UserMapper;
import com.sun.entity.User;
import com.sun.entity.UserVo;
import com.sun.services.userService;
@Service
@Transactional
public class userServiceImpl implements userService {
	@Resource
	private UserMapper userMapper;
	public User getUserById(Integer id) {
		User user = userMapper.selectByPrimaryKey(id);
		return user;
	}
	@Override
	public List<User> getusers() {
		List<User> users = userMapper.getAllUsers();
		
		return users;
	}
	@Override
	public List<User> getUserByLikeName(String name) {
		List<User> userByLikeName = userMapper.getUserByLikeName(name);
		return userByLikeName;
	}
	@Override
	public int saveUser(User user) {
		int saveInt = userMapper.insert(user);
		return saveInt;
	}
	@Override
	public int updateByPrimaryKeySelective(User user) {
		int i = userMapper.updateByPrimaryKeySelective(user);
		return i;
	}
	@Override
	public List<User> getUsersByPojo(User user) {
		List<User> usersByPojo = userMapper.getUsersByPojo(user);
		
		return usersByPojo;
	}
	@Override
	public List<User> getUserFromIdList(List<Integer> ids) {
		List<User> idsUser = userMapper.getUserFromIdList(ids);
		return idsUser;
	}
	@Override
	public List<User> getUserFromVo(UserVo userVo) {
		List<User> users = userMapper.getUserFromVo(userVo);
		return users;
	}
	
}
