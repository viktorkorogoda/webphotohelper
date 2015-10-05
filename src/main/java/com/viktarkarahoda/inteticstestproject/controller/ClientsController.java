package com.viktarkarahoda.inteticstestproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.viktarkarahoda.inteticstestproject.entity.Client;
import com.viktarkarahoda.inteticstestproject.service.ClientService;

@Controller
public class ClientsController {

	@Autowired
	private ClientService clientService;

	@RequestMapping(value = "/clients", method = RequestMethod.GET)
	public ModelAndView intit() {
		List<Client> clientList = clientService.getClientList();
		ModelAndView clients = new ModelAndView("clients");
		clients.addObject("clients", new ArrayList<Client>(clientList));
		return clients;
	}

	// @RequestMapping(value = "/clients/getAllClients", method =
	// RequestMethod.POST)
	// @ResponseBody
	// public JsonListResponse<Client> getAllClients(
	// @RequestParam(value = "jtStartIndex") final int jtStartIndex,
	// @RequestParam(value = "jtPageSize") final int jtPageSize,
	// @RequestParam(value = "jtSorting") final String jtSorting
	// ) {
	// List<Client> clientList = clientService.getClientList();
	// return new JsonListResponse<Client>("OK", clientList, clientList.size());
	// }
}
