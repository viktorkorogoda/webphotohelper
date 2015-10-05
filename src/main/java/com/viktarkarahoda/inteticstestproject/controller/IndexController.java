package com.viktarkarahoda.inteticstestproject.controller;

import java.text.MessageFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.viktarkarahoda.inteticstestproject.entity.Client;
import com.viktarkarahoda.inteticstestproject.service.ClientService;

@Controller
public class IndexController {

	@Autowired
	private ClientService clientService;

	@RequestMapping("/index")
	public ModelAndView init() {
		return new ModelAndView("index");
	}

	@RequestMapping(value = "/clientcard", method = RequestMethod.POST)
	public ModelAndView searchClient(@ModelAttribute("client") Client client, BindingResult result) {
		Client clientDb = clientService.findClientByNameSurname(client);

		ModelAndView clientCard = new ModelAndView("clientcard");
		if (clientDb != null) {
			clientCard.addObject("idClient", clientDb.getIdClient());
			clientCard.addObject("name", clientDb.getName());
			clientCard.addObject("surname", clientDb.getSurname());
			clientCard.addObject("birthday", clientDb.getBirthday());
			clientCard.addObject("address", clientDb.getAddress());
			clientCard.addObject("phone", clientDb.getPhone());
			clientCard.addObject("email", clientDb.getEmail());
			clientCard.addObject("cars", clientDb.getCarList());
			clientCard.addObject("orders", clientDb.getOrderList());
			
		} else {
			String errorMessage = MessageFormat.format("Client was not found with name={0} and surname={1}. Please, create a new client.", client.getName(), client.getSurname());
			clientCard.addObject("errorMessage", errorMessage);
		}

		return clientCard;
	}
}
