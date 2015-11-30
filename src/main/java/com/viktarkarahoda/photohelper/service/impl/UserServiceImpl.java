package com.viktarkarahoda.photohelper.service.impl;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viktarkarahoda.photohelper.dao.UserDao;
import com.viktarkarahoda.photohelper.entity.User;
import com.viktarkarahoda.photohelper.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public UserDao getUserDao() {
		return this.userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean addNewUser(User user) {
		int result = userDao.insertUser(user);
		return result > 0;
	}

	@Override
	public boolean isValidUser(String username, String password) throws SQLException {
		return userDao.isValidUser(username, password);
	}

	@Override
	public User getUser(String username, String password) {
		return userDao.getUserByLoginPass(username, password);
	}
}
