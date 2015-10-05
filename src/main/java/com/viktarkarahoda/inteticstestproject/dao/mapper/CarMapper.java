package com.viktarkarahoda.inteticstestproject.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.viktarkarahoda.inteticstestproject.entity.Car;

public class CarMapper implements RowMapper<Car> {
	@Override
	public Car mapRow(ResultSet rs, int rowNum) throws SQLException {
		Car car = new Car();
		car.setIdClient(rs.getInt("idClient"));
		car.setIdCar(rs.getInt("idCar"));
		car.setMake(rs.getString("make"));
		car.setModel(rs.getString("model"));
		car.setMakeYear(rs.getString("makeYear"));
		car.setVin(rs.getString("vin"));
		return car;
	}
}
