package com.example.myboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.myboard.service.UserService;

@Controller
public class Boardcontroller {
	
	private UserService userService;
	
	public Boardcontroller(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("/")		// localhost:8080/ 로 이동하면 실행하는 함수
	public String boardPage(Model model) {
		model.addAttribute("user",userService.getAllUser());
		return"index";		//index.html 로 이동
	}

	@ GetMapping("/edit/{id}")
	public String editPage(Model model /*,@PathVariable Long id*/) {
		// model.addAttribute("user",userService.getUserById(id));
		return "edit";			// edit.html
	}
	
}
