package com.sun.dao;

import java.util.List;

import com.sun.entity.User;
import com.sun.entity.UserVo;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<User> getAllUsers();
    
    List<User> getUserByLikeName(String name);
    
    
    List<User> getUsersByPojo(User user);
    
    List<User> getUserFromIdList(List<Integer> ids);
    
    List<User> getUserFromVo(UserVo	userVo);
}