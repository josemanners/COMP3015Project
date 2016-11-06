package com.inter.comp3015project.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController 
{
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Map<String, Object> model)
	{
		return "index";
	}
}
