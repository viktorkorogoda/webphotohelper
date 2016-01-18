package com.viktarkarahoda.photohelper.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viktarkarahoda.photohelper.dao.OrdersDao;
import com.viktarkarahoda.photohelper.entity.Order;
import com.viktarkarahoda.photohelper.service.OrdersService;

@Service
public class OrdersServiceImpl implements OrdersService {

	@Autowired
	private OrdersDao ordersDao;
	
	@Override
	public boolean addOrder(Order order) {
		int result = ordersDao.insertOrder(order);
		return result > 0;
	}

}
