package com.viktarkarahoda.photohelper.dao;

import java.sql.SQLException;
import java.util.List;

import com.viktarkarahoda.photohelper.entity.User;

public interface UserDao {

	public int insertUser(User user);

	public void deleteUser();

	public void updateUser();

	public User getUserByLoginPass(String login, String password);

	public List<User> getUserByOrderType();

	public List<User> getUserByOrderCost();

	public List<User> getUserByOrderAmount();

	public List<User> getUserByOrder();

	public List<User> getAllWorker();

	public List<User> getWorkerNoOrder();

	public boolean isValidUser(String username, String password) throws SQLException;

	User getUserByLogin(String username);

}
