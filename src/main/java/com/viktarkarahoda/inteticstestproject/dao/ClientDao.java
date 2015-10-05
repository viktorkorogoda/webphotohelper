package com.viktarkarahoda.inteticstestproject.dao;

import java.util.List;

import com.viktarkarahoda.inteticstestproject.entity.Client;

public interface ClientDao {
	
	int insertClient(Client client);
	
	Client getClientByNameSurname(Client client);
	
	Client getClient(int idClient);  
	
	List<Client> getClientList();  
}
