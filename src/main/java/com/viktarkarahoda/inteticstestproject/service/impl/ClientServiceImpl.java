package com.viktarkarahoda.inteticstestproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viktarkarahoda.inteticstestproject.dao.ClientDao;
import com.viktarkarahoda.inteticstestproject.entity.Car;
import com.viktarkarahoda.inteticstestproject.entity.Client;
import com.viktarkarahoda.inteticstestproject.entity.Order;
import com.viktarkarahoda.inteticstestproject.service.CarService;
import com.viktarkarahoda.inteticstestproject.service.ClientService;
import com.viktarkarahoda.inteticstestproject.service.OrdersService;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDao clientDao;

	@Autowired
	private CarService carService;

	@Autowired
	private OrdersService orderService;

	@Override
	public boolean addNewClient(Client client) {
		int result = clientDao.insertClient(client);
		return result > 0;
	}

	@Override
	public Client findClientByNameSurname(Client client) {
		Client clientDb = clientDao.getClientByNameSurname(client);
		if (clientDb == null) {
			return null;
		}
		List<Car> clientCars = carService.getCarListByIdClient(clientDb.getIdClient());
		clientDb.getCarList().addAll(clientCars);

		List<Order> clientOrders = orderService.getOrderListByIdClient(clientDb.getIdClient());
		clientDb.getOrderList().addAll(clientOrders);

		return clientDb;
	}
	@Override
	public Client findClientByIdClient(int idClient) {
		Client clientDb = clientDao.getClient(idClient);
		if (clientDb == null) {
			return null;
		}
		List<Car> clientCars = carService.getCarListByIdClient(clientDb.getIdClient());
		clientDb.getCarList().addAll(clientCars);

		List<Order> clientOrders = orderService.getOrderListByIdClient(clientDb.getIdClient());
		clientDb.getOrderList().addAll(clientOrders);

		return clientDb;
	}

	@Override
	public List<Client> getClientList() {
		return clientDao.getClientList();
	}

}
