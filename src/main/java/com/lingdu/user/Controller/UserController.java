package com.lingdu.user.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lingdu.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService service;
	
	@RequestMapping("/index")
	public String getUser(ModelMap map){
		map.addAttribute("user", service.getUser(1));
		return "index";
		//访问地址：http://localhost:8080/ssm/user/index.action
	}
}
