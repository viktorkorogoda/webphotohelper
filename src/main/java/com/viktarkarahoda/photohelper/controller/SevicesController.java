package com.viktarkarahoda.photohelper.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SevicesController {


	@RequestMapping(value = { "/services"})
	public ModelAndView about(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView model = new ModelAndView();
        model.setViewName("services");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userName = authentication.getName();
        // UserService.getUserInfo(userName)
        model.addObject("name", userName);
    
        return model;
    }
	
}
