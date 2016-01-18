package com.viktarkarahoda.photohelper.entity;

import com.viktarkarahoda.photohelper.enums.UserRole;

public class Admin {

	private String login;
	private String password;
	private UserRole role;

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login
	 *            the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the role
	 */
	public UserRole getRole() {
		return role;
	}

	/**
	 * @param role
	 *            the role to set
	 */
	public void setRole(UserRole role) {
		this.role = role;
	}

}
