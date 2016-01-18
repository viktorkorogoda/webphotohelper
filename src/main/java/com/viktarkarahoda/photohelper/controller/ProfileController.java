package com.viktarkarahoda.photohelper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.viktarkarahoda.photohelper.entity.Order;
import com.viktarkarahoda.photohelper.entity.User;
import com.viktarkarahoda.photohelper.service.OrdersService;
import com.viktarkarahoda.photohelper.service.UserService;

@Controller
public class ProfileController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	OrdersService orderService;
	
	@RequestMapping(value = {"/profile"}, method = RequestMethod.GET)
	public ModelAndView getUser(@ModelAttribute("user") User user, BindingResult result) {
		

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userName = authentication.getName();

        User userDb = userService.getUser(userName);
		ModelAndView clientCard = new ModelAndView("profile");

		clientCard.addObject("nameAndSurname", userDb.getNameandsurname());
		clientCard.addObject("phone", userDb.getPhone());
		clientCard.addObject("e-mail", userDb.getEmail());
		clientCard.addObject("note", userDb.getNote());
		clientCard.addObject("country", userDb.getPhone());
		clientCard.addObject("region", userDb.getEmail());
		clientCard.addObject("city", userDb.getCity());
		clientCard.addObject("index", userDb.getCityIndex());
		clientCard.addObject("address", userDb.getAddress());
        
        clientCard.addObject("name", userName);
    
        return clientCard;
    }
	
	@RequestMapping(value = "/addOrder", method = RequestMethod.GET)
	public ModelAndView addOrder(@ModelAttribute("order") Order order, BindingResult result) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userName = authentication.getName();

        User userDb = userService.getUser(userName);
        order.setIdUser(userDb.getIdUser());
		orderService.addOrder(order);

		ModelAndView clientCard = new ModelAndView("profile");
		
	return 	clientCard;
	}
	
	
}
