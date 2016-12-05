package com.inter.comp3015project.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController
{
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLoginPage(Map<String, Object> model, @RequestParam(required = false) String error)
	{
	    model.put("error", error);
	    return "login";
	}
}
