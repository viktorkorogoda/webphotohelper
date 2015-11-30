package com.viktarkarahoda.photohelper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactsController { 
	@RequestMapping("/contacts")
	public ModelAndView init() {
		return new ModelAndView("contacts");
	}
}
