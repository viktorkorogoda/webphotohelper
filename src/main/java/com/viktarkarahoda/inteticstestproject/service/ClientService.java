package com.viktarkarahoda.inteticstestproject.service;

import java.util.List;

import com.viktarkarahoda.inteticstestproject.entity.Client;

public interface ClientService {

	boolean addNewClient(Client client);

	Client findClientByNameSurname(Client client);

	Client findClientByIdClient(int idClient);

	List<Client> getClientList();
}
