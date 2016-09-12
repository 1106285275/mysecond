package com.people.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableAutoConfiguration
@EnableWebMvc
public class ZeroController {

	@RequestMapping("/exception")
	public int exception(){
		return 100/0;
	}

}
