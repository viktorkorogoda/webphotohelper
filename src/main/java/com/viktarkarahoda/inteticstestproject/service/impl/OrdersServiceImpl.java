package com.viktarkarahoda.inteticstestproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viktarkarahoda.inteticstestproject.dao.OrdersDao;
import com.viktarkarahoda.inteticstestproject.entity.Order;
import com.viktarkarahoda.inteticstestproject.service.OrdersService;

@Service
public class OrdersServiceImpl implements OrdersService {

	@Autowired
	private OrdersDao ordersDao;

	@Override
	public boolean addOrder(Order order) {
		int result = ordersDao.insertOrder(order);
		return result > 0;
	}

	@Override
	public boolean editOrder(Order order) {
		int result = ordersDao.updateOrder(order);
		return result > 0;
	}

	@Override
	public boolean removeOrder(int idOrder) {
		int result = ordersDao.deleteOrder(idOrder);
		return result > 0;
	}

	@Override
	public Order getOrderByIdCar(int idCar) {
		return ordersDao.getOrderByIdCar(idCar);
	}

	@Override
	public List<Order> getOrderListByIdClient(int idClient) {
		return ordersDao.getOrderListByIdClient(idClient);
	}

	@Override
	public List<Order> getOrderList() {
		return ordersDao.getOrderList();
	}

	@Override
	public Order getOrderByIdOrder(int idOrder) {
		return ordersDao.getOrderByIdOrder(idOrder);
	}

}
