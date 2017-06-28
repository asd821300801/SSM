package com.mashen.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lingdu.user.service.UserService;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	private UserService service;
	
	@RequestMapping("/getUser")
	public String getUser(ModelMap map){
		map.addAttribute("user", service.getUser(72));
		return "index";
	}
}
