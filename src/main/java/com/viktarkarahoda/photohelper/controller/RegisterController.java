package com.viktarkarahoda.photohelper.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.viktarkarahoda.photohelper.entity.User;
import com.viktarkarahoda.photohelper.service.UserService;

@Controller
public class RegisterController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = { "/register"})
	public ModelAndView register(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView model = new ModelAndView();
        model.setViewName("register");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userName = authentication.getName();
        // UserService.getUserInfo(userName)
        model.addObject("name", userName);
    
        return model;
    }

	@RequestMapping(value = "/addNewUser", method = RequestMethod.POST)
	public ModelAndView addNewUser(@ModelAttribute("user") User user, BindingResult result) {
		userService.addNewUser(user);
		ModelAndView model  = new ModelAndView("profile");
		model.setViewName("redirect:profile");
//		ModelAndView userCard = new ModelAndView("register");
//		userCard.addObject("nameandsurname", user.getNameandsurname());
//		userCard.addObject("role", user.getRole());
//		userCard.addObject("note", user.getNote());
//		userCard.addObject("address", user.getAddress());
//		userCard.addObject("phone", user.getPhone());
//		userCard.addObject("email", user.getEmail());
//		userCard.addObject("cityindex", user.getCityIndex());
//		userCard.addObject("city", user.getCity());
//		userCard.addObject("region", user.getRegion());
//		userCard.addObject("country", user.getCountry());
//		userCard.addObject("login", user.getLogin());
//		userCard.addObject("password", user.getPassword());
		
		return model;
	}
}
