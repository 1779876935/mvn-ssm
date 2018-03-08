package com.sun.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import com.alibaba.fastjson.JSON;
import com.mysql.fabric.xmlrpc.base.Value;
import com.sun.entity.User;
import com.sun.services.userService;
import com.sun.utils.UtilsOfStr;

@Controller
@RequestMapping(value = "/user")
public class userController {
	@Resource
	private userService userService;
	
	@RequestMapping(value = "/test",method = RequestMethod.POST)
	@ResponseBody
	public String test(@RequestParam("uid") int uid,HttpServletRequest request,Model model){
		User user = userService.getUserById(uid);
		String userString = JSON.toJSONString(user);
		if (user == null) {
			return "error";
		}
		request.setAttribute("name", user.getUserName());
		model.addAttribute("name",user.getUserName());
		return userString;
	}
	
	@RequestMapping(value = "/users")
	@ResponseBody
	public String users(HttpServletRequest request,Model model){
		List<User> users = userService.getusers();
		String userString = JSON.toJSONString(users);
		return userString;
	}
	
	@RequestMapping(value = "/getUserLikeName")
	@ResponseBody
	public String getUserLikeName(@RequestParam("likeName") String likeName,HttpServletRequest request,Model model){
		List<User> userByLikeName = userService.getUserByLikeName(likeName);
		return UtilsOfStr.getJsonStr4obj(userByLikeName);
	}
	
	@RequestMapping(value = "/saveUser")
	@ResponseBody
	public String saveUser(HttpRequestHandlerServlet request,Model model){
		User user = new User();
		user.setAge(12);
		user.setId(1);
		System.out.println(user.toString());
		int i = userService.updateByPrimaryKeySelective(user);
		return String.valueOf(i);
		}
}
