package com.viktarkarahoda.inteticstestproject.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.viktarkarahoda.inteticstestproject.entity.Car;
import com.viktarkarahoda.inteticstestproject.entity.Client;
import com.viktarkarahoda.inteticstestproject.entity.Order;
import com.viktarkarahoda.inteticstestproject.service.CarService;
import com.viktarkarahoda.inteticstestproject.service.ClientService;
import com.viktarkarahoda.inteticstestproject.service.OrdersService;

@Controller
public class CreateOrderController {

	 @Autowired
	 private ClientService clientService;
	 
	 @Autowired
	 private CarService carService;
	 
	 @Autowired
	 private OrdersService orderService;

	 
	@RequestMapping("/createorder")
	public ModelAndView init() {
		ModelAndView createOrder = new ModelAndView("createorder");
		createOrder.addObject("clients",new ArrayList<Client>(clientService.getClientList()));
		createOrder.addObject("cars", new ArrayList<Car>(carService.getCarList()));
		return createOrder;
	}
	
	@RequestMapping(value = "/addNewOrder", method = RequestMethod.POST)
	public ModelAndView addNewOrder(@ModelAttribute("order") Order order, BindingResult result) {
		orderService.addOrder(order);

		return init();
	}
	
}
