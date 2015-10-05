package com.viktarkarahoda.inteticstestproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.viktarkarahoda.inteticstestproject.entity.Order;
import com.viktarkarahoda.inteticstestproject.service.OrdersService;

@Controller
public class OrdersController { 
	
	@Autowired
	private OrdersService orderService;
	
	@RequestMapping("/orders")
	public ModelAndView intit() {
		List<Order> orderList = orderService.getOrderList();
		ModelAndView clients = new ModelAndView("orders");
		clients.addObject("orders", new ArrayList<Order>(orderList));
		return clients;
		
	}
	
	
}
