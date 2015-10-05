package com.viktarkarahoda.inteticstestproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viktarkarahoda.inteticstestproject.dao.CarDao;
import com.viktarkarahoda.inteticstestproject.entity.Car;
import com.viktarkarahoda.inteticstestproject.service.CarService;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private CarDao carDao;

	@Override
	public boolean addCar(Car car) {
		int result = carDao.insertCar(car);
		return result > 0;
	}

	@Override
	public boolean editCar(Car car) {
		int result = carDao.updateCar(car);
		return result > 0;
	}

	@Override
	public boolean removeCar(int idCar) {
		int result = carDao.deleteCar(idCar);
		return result > 0;
	}

	@Override
	public Car getCar(int idCar) {
		return carDao.getCar(idCar);
	}

	@Override
	public List<Car> getCarListByIdClient(int idClient) {
		return carDao.getCarListByIdClient(idClient);
	}

	@Override
	public List<Car> getCarList() {
		return carDao.getCarList();
	}

}
