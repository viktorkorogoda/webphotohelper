package com.viktarkarahoda.inteticstestproject.controller;

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
public class NewClientController {

	@Autowired
	private ClientService clientService;

	@RequestMapping("/newclient")
	public ModelAndView intit() {
		return new ModelAndView("newclient");
	}

	@RequestMapping(value = "/addNewClient", method = RequestMethod.POST)
	public ModelAndView addNewClient(@ModelAttribute("client") Client client, BindingResult result) {
		clientService.addNewClient(client);
		ModelAndView clientCard = new ModelAndView("clientcard");
		clientCard.addObject("name", client.getName());
		clientCard.addObject("surname", client.getSurname());
		clientCard.addObject("birthday", client.getBirthday());
		clientCard.addObject("address", client.getAddress());
		clientCard.addObject("phone", client.getPhone());
		clientCard.addObject("email", client.getEmail());

		return clientCard;
	}
}
