package com.viktarkarahoda.inteticstestproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.viktarkarahoda.inteticstestproject.entity.Car;
import com.viktarkarahoda.inteticstestproject.entity.Client;
import com.viktarkarahoda.inteticstestproject.service.CarService;
import com.viktarkarahoda.inteticstestproject.service.ClientService;

@Controller
public class ClientsCardController {

	@Autowired
	private CarService carService;
	
	@Autowired
	private ClientService clientService;
	
	@RequestMapping("/clientcard")
	public ModelAndView intit() {
		return new ModelAndView("clientcard");
	}
	
	@RequestMapping(value = "/addNewCar", method = RequestMethod.POST)
	public ModelAndView addNewCar(@ModelAttribute("car") Car car, BindingResult result) {
		
		carService.addCar(car);
		
		Client clientDb = clientService.findClientByIdClient(car.getIdClient());
		
		ModelAndView clientCard = new ModelAndView("clientcard");
		clientCard.addObject("idClient", clientDb.getIdClient());
		clientCard.addObject("name", clientDb.getName());
		clientCard.addObject("surname", clientDb.getSurname());
		clientCard.addObject("birthday", clientDb.getBirthday());
		clientCard.addObject("address", clientDb.getAddress());
		clientCard.addObject("phone", clientDb.getPhone());
		clientCard.addObject("email", clientDb.getEmail());
		clientCard.addObject("cars", clientDb.getCarList());
		clientCard.addObject("orders", clientDb.getOrderList());

		return clientCard;
	}
}
