package com.viktarkarahoda.photohelper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SevicesController {

	@RequestMapping("/services")
	public ModelAndView init() {
		return new ModelAndView("services");
	}
	
}
