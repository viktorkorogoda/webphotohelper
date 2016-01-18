package com.viktarkarahoda.photohelper.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.viktarkarahoda.photohelper.entity.Order;

public class OrderMapper implements RowMapper<Order> {

	@Override
	public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
		Order order = new Order();
		order.setDescription("description");
		order.setIdOrder(rs.getInt("idOrder"));
		order.setIdUser(rs.getInt("idUser"));
		order.setOrderDate("orderdate");
		order.setEmailNotify("emailnotify");
		return order;
	}

}
