package com.viktarkarahoda.inteticstestproject.dao;

import java.util.List;

import com.viktarkarahoda.inteticstestproject.entity.Car;

public interface CarDao {

	int insertCar(Car car);
	
	int updateCar(Car car);

	int deleteCar(int idCar);
	
	Car getCar(int idCar);  

	List<Car> getCarListByIdClient(int idClient);
	
	List<Car> getCarList(); 
}
