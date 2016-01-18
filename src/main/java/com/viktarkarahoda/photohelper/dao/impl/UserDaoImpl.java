package com.viktarkarahoda.photohelper.dao.impl;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.viktarkarahoda.photohelper.dao.UserDao;
import com.viktarkarahoda.photohelper.dao.mapper.UserMapper;
import com.viktarkarahoda.photohelper.entity.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	DataSource dataSource;

	public DataSource getDataSource() {
		return this.dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public int insertUser(User user) {
		String SQL = "INSERT INTO USERS (iduser, nameandsurname, role, note,  address, phone, email, cityindex, city, region, country, login, userpassword)"
				+ "VALUES (USERS_SEQ.nextval, :nameandsurname, :role, :note, :address, :phone, :email, :cityindex, :city, :region, :country, :login, :password)";
		MapSqlParameterSource namedParameters = new MapSqlParameterSource();
		namedParameters.addValue("nameandsurname", user.getNameandsurname());
		namedParameters.addValue("role", "ROLE_USER"/* user.getRole() */);
		namedParameters.addValue("note", user.getNote());
		namedParameters.addValue("address", user.getAddress());
		namedParameters.addValue("phone", user.getPhone());
		namedParameters.addValue("email", user.getEmail());
		namedParameters.addValue("cityindex", user.getCityIndex());
		namedParameters.addValue("city", user.getCity());
		namedParameters.addValue("region", user.getRegion());
		namedParameters.addValue("country", user.getCountry());
		namedParameters.addValue("login", user.getLogin());
		namedParameters.addValue("password", user.getPassword());
		return namedParameterJdbcTemplate.update(SQL, namedParameters);

	}

	@Override
	public boolean isValidUser(String username, String password) throws SQLException {

		String SQL = "Select count(login) from users where login=:login and userpassword=:password";
		MapSqlParameterSource namedParameters = new MapSqlParameterSource();
		namedParameters.addValue("login", username);
		namedParameters.addValue("password", password);
		if (namedParameterJdbcTemplate.queryForInt(SQL, namedParameters) > 0) {
			return true;
		} else
			return false;
	}

	@Override
	public User getUserByLoginPass(String username, String password) {
		String SQL = "Select * from USERS where LOGIN=:login and USERPASSWORD=:password";
		MapSqlParameterSource namedParameters = new MapSqlParameterSource();
		namedParameters.addValue("login", username);
		namedParameters.addValue("password", password);

		List<User> userList = namedParameterJdbcTemplate.query(SQL, namedParameters, new UserMapper());
		if (CollectionUtils.isNotEmpty(userList)) {
			return userList.get(0);
		}

		return null;
	}

	@Override
	public User getUserByLogin(String username) {
		String SQL = "Select * from USERS where LOGIN=:login";
		MapSqlParameterSource namedParameters = new MapSqlParameterSource();
		namedParameters.addValue("login", username);

		List<User> userList = namedParameterJdbcTemplate.query(SQL, namedParameters, new UserMapper());
		if (CollectionUtils.isNotEmpty(userList)) {
			return userList.get(0);
		}

		return null;
	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<User> getUserByOrderType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUserByOrderCost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUserByOrderAmount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUserByOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllWorker() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getWorkerNoOrder() {
		// TODO Auto-generated method stub
		return null;
	}

}
