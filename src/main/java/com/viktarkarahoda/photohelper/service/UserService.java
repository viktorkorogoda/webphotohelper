package com.viktarkarahoda.photohelper.service;

import java.sql.SQLException;

import com.viktarkarahoda.photohelper.entity.User;

public interface UserService {

	boolean addNewUser(User user);

	boolean isValidUser(String username, String password) throws SQLException;

	User getUser(String username, String password);

	User getUser(String username);
}
