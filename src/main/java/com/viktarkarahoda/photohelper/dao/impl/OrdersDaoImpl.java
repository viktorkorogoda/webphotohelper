package com.viktarkarahoda.photohelper.dao.impl;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.ListUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.viktarkarahoda.photohelper.dao.OrdersDao;
import com.viktarkarahoda.photohelper.dao.mapper.OrderMapper;
import com.viktarkarahoda.photohelper.entity.Order;

@Repository
public class OrdersDaoImpl implements OrdersDao {

	@Override
	public void addNewOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateOrder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Order getOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getOrdersByClient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getOrdersByWorker() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getOrdersByType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getOrdersByTotalCost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getOrdersByCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getOrdersByPaperType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getOrdersByPhotoSize() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getOrdersByDateOrderStart() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getOrdersByDateOrderFinished() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getOrdersByEmailNotify() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getOrdersByStatus() {
		// TODO Auto-generated method stub
		return null;
	}


}
