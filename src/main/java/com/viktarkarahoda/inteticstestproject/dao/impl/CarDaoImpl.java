package com.viktarkarahoda.inteticstestproject.dao.impl;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.ListUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.viktarkarahoda.inteticstestproject.dao.CarDao;
import com.viktarkarahoda.inteticstestproject.dao.mapper.CarMapper;
import com.viktarkarahoda.inteticstestproject.entity.Car;

@Repository
public class CarDaoImpl implements CarDao {

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public int insertCar(Car car) {
		String SQL = "INSERT INTO Cars (idCar, make, model, makeYear, vin, idClient) VALUES (CLIENTS_SEQ.nextval, :make, :model, :makeYear, :vin, :idClient)";
		MapSqlParameterSource namedParameters = new MapSqlParameterSource();
		namedParameters.addValue("make", car.getMake());
		namedParameters.addValue("model", car.getModel());
		namedParameters.addValue("makeYear", car.getMakeYear());
		namedParameters.addValue("vin", car.getVin());
		namedParameters.addValue("idClient", car.getIdClient());
		return namedParameterJdbcTemplate.update(SQL, namedParameters);
	}

	@Override
	public int updateCar(Car car) {
		String SQL = "UPDATE Cars SET make = :make, model=:model, makeYear=:makeYear, vin=:vin WHERE idCar=:idCar";
		MapSqlParameterSource namedParameters = new MapSqlParameterSource();
		namedParameters.addValue("idCar", car.getIdCar());
		namedParameters.addValue("make", car.getMake());
		namedParameters.addValue("model", car.getModel());
		namedParameters.addValue("makeYear", car.getMakeYear());
		namedParameters.addValue("vin", car.getVin());
		return namedParameterJdbcTemplate.update(SQL, namedParameters);

	}

	@Override
	public int deleteCar(int idCar) {
		String SQL = "DELETE FROM Cars WHERE idCar = :idCar";
		MapSqlParameterSource namedParameters = new MapSqlParameterSource();
		namedParameters.addValue("idCar", idCar);
		return namedParameterJdbcTemplate.update(SQL, namedParameters);
	}

	@Override
	public Car getCar(int idCar) {
		String SQL = "SELECT * FROM Cars WHERE idCar = :idCar";
		MapSqlParameterSource namedParameters = new MapSqlParameterSource();
		namedParameters.addValue("idCar", idCar);

		List<Car> carList = namedParameterJdbcTemplate.query(SQL,
				namedParameters, new CarMapper());
		if (CollectionUtils.isNotEmpty(carList)) {
			return carList.get(0);
		}
		return null;
	}

	@Override
	public List<Car> getCarListByIdClient(int idClient) {
		String SQL = "SELECT * FROM Cars WHERE idClient = :idClient";
		MapSqlParameterSource namedParameters = new MapSqlParameterSource();
		namedParameters.addValue("idClient", idClient);

		List<Car> carList = namedParameterJdbcTemplate.query(SQL,
				namedParameters, new CarMapper());
		return ListUtils.emptyIfNull(carList);
	}

	@Override
	public List<Car> getCarList() {
		String SQL = "SELECT * FROM Cars";
		List<Car> carList = namedParameterJdbcTemplate.query(SQL,
				new CarMapper());
		return ListUtils.emptyIfNull(carList);
	}

}