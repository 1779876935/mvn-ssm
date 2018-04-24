package com.sun.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/login")
public class loginAdminController {
	@RequestMapping(value = "/comUser")
	public String loginUser(HttpServletRequest request,Model model){
		
		return null;
	}
}
