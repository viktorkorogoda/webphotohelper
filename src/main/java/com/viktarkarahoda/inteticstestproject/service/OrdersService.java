package com.viktarkarahoda.inteticstestproject.service;

import java.util.List;

import com.viktarkarahoda.inteticstestproject.entity.Order;

public interface OrdersService {
	
	boolean addOrder(Order order);

	boolean editOrder(Order order);

	boolean removeOrder(int idOrder);

	Order getOrderByIdCar(int idCar);
	
	Order getOrderByIdOrder(int idOrder);	

	List<Order> getOrderListByIdClient(int idClient);

	List<Order> getOrderList();
}
