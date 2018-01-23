package com.furquan.pharmeasy_assign1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 */

/**
 * @author Furquan
 *
 */
@Controller
public class LoginController {

	@RequestMapping(method = RequestMethod.GET, path = "/login")
	private ModelAndView login() {
		ModelAndView model = new ModelAndView();
		model.setViewName("login");
		return model;
	}

	@RequestMapping(method = RequestMethod.POST, path = "/login")
	private ModelAndView login(@RequestParam("username") String username, @RequestParam("password") String password) {
		System.out.println("username : " + username + " :: password: " + password);
		ModelAndView model = new ModelAndView();
		model.addObject("error", "username/password is invalid");
		model.setViewName("login");
		return model;
	}

	@RequestMapping(method = RequestMethod.GET, path = "/registration")
	private ModelAndView user() {
		ModelAndView model = new ModelAndView();
		model.setViewName("registration");
		return model;
	}

}
