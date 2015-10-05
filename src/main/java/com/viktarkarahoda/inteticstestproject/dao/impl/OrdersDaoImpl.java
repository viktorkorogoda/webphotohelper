package com.viktarkarahoda.inteticstestproject.dao.impl;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.ListUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.viktarkarahoda.inteticstestproject.dao.OrdersDao;
import com.viktarkarahoda.inteticstestproject.dao.mapper.OrderMapper;
import com.viktarkarahoda.inteticstestproject.entity.Order;

@Repository
public class OrdersDaoImpl implements OrdersDao {

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public int insertOrder(Order order) {
		String SQL = "INSERT INTO Orders (idOrder, idCar, dateOrder, orderCost, orderStatus, idClient) VALUES (CLIENTS_SEQ.nextval, :idCar, :dateOrder, :orderCost, :orderStatus, :idClient)";
		MapSqlParameterSource namedParameters = new MapSqlParameterSource();
		namedParameters.addValue("idCar", order.getIdCar());
		namedParameters.addValue("dateOrder", order.getDateOrder());
		namedParameters.addValue("orderCost", order.getCost());
		namedParameters.addValue("orderStatus", order.getOrderStatus().toString());
		namedParameters.addValue("idClient", order.getIdClient());
		return namedParameterJdbcTemplate.update(SQL, namedParameters);
	}

	@Override
	public int updateOrder(Order order) {
		String SQL = "UPDATE Orders SET dateOrder = :dateOrder, orderCost=:orderCost, orderStatus=:orderStatus WHERE idOrder=:idOrder";
		MapSqlParameterSource namedParameters = new MapSqlParameterSource();
		namedParameters.addValue("idOrder", order.getIdOrder());
		namedParameters.addValue("dateOrder", order.getDateOrder());
		namedParameters.addValue("orderCost", order.getCost());
		namedParameters.addValue("orderStatus", order.getOrderStatus().toString());
		return namedParameterJdbcTemplate.update(SQL, namedParameters);
	}

	@Override
	public int deleteOrder(int idOrder) {
		String SQL = "DELETE FROM Orders WHERE idOrder = :idOrder";
		MapSqlParameterSource namedParameters = new MapSqlParameterSource();
		namedParameters.addValue("idOrder", idOrder);
		return namedParameterJdbcTemplate.update(SQL, namedParameters);
		
	}

	@Override
	public Order getOrderByIdCar(int idCar) {
		String SQL = "SELECT * FROM Orders WHERE idCar = :idCar";
		MapSqlParameterSource namedParameters = new MapSqlParameterSource();
		namedParameters.addValue("idCar", idCar);

		List<Order> orderList = namedParameterJdbcTemplate.query(SQL, namedParameters, new OrderMapper());
		if (CollectionUtils.isNotEmpty(orderList)) {
			return orderList.get(0);
		}
		return null;
	}

	@Override
	public List<Order> getOrderListByIdClient(int idClient) {
		String SQL = "SELECT * FROM Orders WHERE idClient = :idClient";
		MapSqlParameterSource namedParameters = new MapSqlParameterSource();
		namedParameters.addValue("idClient", idClient);

		List<Order> orderList = namedParameterJdbcTemplate.query(SQL, namedParameters, new OrderMapper());
		return ListUtils.emptyIfNull(orderList);
	}

	@Override
	public List<Order> getOrderList() {
		String SQL = "SELECT * FROM Orders";
		List<Order> orderList = namedParameterJdbcTemplate.query(SQL, new OrderMapper());
		return ListUtils.emptyIfNull(orderList);
	}

	@Override
	public Order getOrderByIdOrder(int idOrder) {
		String SQL = "SELECT * FROM Orders WHERE idOrder = :idOrder";
		MapSqlParameterSource namedParameters = new MapSqlParameterSource();
		namedParameters.addValue("idOrder", idOrder);

		List<Order> orderList = namedParameterJdbcTemplate.query(SQL, namedParameters, new OrderMapper());
		if (CollectionUtils.isNotEmpty(orderList)) {
			return orderList.get(0);
		}
		return null;
	}

}
