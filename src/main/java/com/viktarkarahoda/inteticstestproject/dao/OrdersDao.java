package com.viktarkarahoda.inteticstestproject.dao;

import java.util.List;

import com.viktarkarahoda.inteticstestproject.entity.Order;

public interface OrdersDao {
	
	int insertOrder(Order order);
	
	int updateOrder(Order order);
	
	int deleteOrder(int idOrder);
	
	Order getOrderByIdCar(int idCar);
	
	Order getOrderByIdOrder(int idOrder);
	
	List<Order> getOrderListByIdClient(int idClient);
	
	List<Order> getOrderList();	

}
