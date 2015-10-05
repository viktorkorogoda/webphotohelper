package com.viktarkarahoda.inteticstestproject.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.viktarkarahoda.inteticstestproject.entity.Order;
import com.viktarkarahoda.inteticstestproject.enums.OrderStatus;

public class OrderMapper implements RowMapper<Order> {
	@Override
	public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
		Order order = new Order();
		order.setIdOrder(rs.getInt("idOrder"));
		order.setIdCar(rs.getInt("idCar"));
		order.setIdClient(rs.getInt("idClient"));
		order.setDateOrder(rs.getString("dateOrder"));
		order.setCost(rs.getInt("orderCost"));
		order.setOrderStatus(OrderStatus.fromString(rs.getString("orderStatus")));
		return order;
	}

}
