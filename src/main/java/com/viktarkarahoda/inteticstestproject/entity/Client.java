package com.viktarkarahoda.inteticstestproject.entity;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private String name;
	private String surname;
	private String birthday;
	private String address;
	private String phone;
	private String email;
	private int idClient;
	private List<Car> carList = new ArrayList<Car>();
	private List<Order> orderList = new ArrayList<Order>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public List<Car> getCarList() {
		return carList;
	}

	public List<Order> getOrderList() {
		return orderList;
	}
}
