package com.viktarkarahoda.photohelper.dao;

import java.util.List;

import com.viktarkarahoda.photohelper.entity.Order;


public interface OrdersDao {
	

	int insertOrder(Order order);
	public void changeOrder();
	public void deleteOrder();
	public void updateOrder();
	public Order getOrder();
	public List<Order> getAllOrders();
	public List<Order> getOrdersByClient();
	public List<Order> getOrdersByWorker();
	public List<Order> getOrdersByType();
	public List<Order> getOrdersByTotalCost();
	public List<Order> getOrdersByCount();
	public List<Order> getOrdersByPaperType();
	public List<Order> getOrdersByPhotoSize();
	public List<Order> getOrdersByDateOrderStart();
	public List<Order> getOrdersByDateOrderFinished();
	public List<Order> getOrdersByEmailNotify();
	public List<Order> getOrdersByStatus();
	void addNewOrder();
}
