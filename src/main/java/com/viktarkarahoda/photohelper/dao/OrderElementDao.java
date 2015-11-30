package com.viktarkarahoda.photohelper.dao;

import java.util.List;

import com.viktarkarahoda.photohelper.entity.OrderElement;

public interface OrderElementDao {
	
	public void addOrderElement();
	public void deleteOrderElement();
	public void updateOrderElement();
	public List<OrderElement> getOrderElementsByOrder(int orderElement);
	
}
