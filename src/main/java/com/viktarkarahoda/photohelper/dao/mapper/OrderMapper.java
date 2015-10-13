package com.viktarkarahoda.photohelper.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.viktarkarahoda.photohelper.entity.Order;
import com.viktarkarahoda.photohelper.enums.OrderStatus;

public class OrderMapper implements RowMapper<Order> {

	@Override
	public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
