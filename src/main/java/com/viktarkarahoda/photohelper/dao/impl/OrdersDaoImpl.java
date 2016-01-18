package com.viktarkarahoda.photohelper.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.viktarkarahoda.photohelper.dao.OrdersDao;
import com.viktarkarahoda.photohelper.entity.Order;

@Repository
public class OrdersDaoImpl implements OrdersDao {
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Override
	public int insertOrder(Order order) {
		String SQL = "INSERT INTO Orders (idOrder, idUser, status, description, orderdate, orderDateComplete, emailnotify, idWorker) "
				+ "VALUES (ORDERS_SEQ.nextval, :idUser, :status, :description, :orderdate, :orderDateComplete, :emailnotify, :idWorker)";
		MapSqlParameterSource namedParameters = new MapSqlParameterSource();
		namedParameters.addValue("idUser", order.getIdUser()); //not null
		namedParameters.addValue("status", order.getStatus()); //not null
		namedParameters.addValue("description", order.getDescription());
		namedParameters.addValue("orderdate", order.getOrderDate()); //not null
		namedParameters.addValue("orderDateComplete", order.getOrderDateComplete());
		namedParameters.addValue("emailnotify", order.getEmailNotify());
		namedParameters.addValue("idWorker", order.getIdWorker());
		return namedParameterJdbcTemplate.update(SQL, namedParameters);
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

	@Override
	public void addNewOrder() {
		// TODO Auto-generated method stub

	}

}
