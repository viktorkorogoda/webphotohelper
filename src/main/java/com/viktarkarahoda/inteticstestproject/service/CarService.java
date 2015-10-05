package com.viktarkarahoda.inteticstestproject.service;

import java.util.List;

import com.viktarkarahoda.inteticstestproject.entity.Car;

public interface CarService {

	boolean addCar(Car car);

	boolean editCar(Car car);

	boolean removeCar(int idCar);

	Car getCar(int idCar);

	List<Car> getCarListByIdClient(int idClient);

	List<Car> getCarList();

}
