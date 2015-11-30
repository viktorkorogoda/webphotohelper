package com.viktarkarahoda.photohelper.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.viktarkarahoda.photohelper.entity.User;

public class UserMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setIdUser(rs.getInt("idUser"));
		user.setNameandsurname(rs.getString("nameandsurname"));
		user.setRole(rs.getString("role"));
		user.setNote(rs.getString("note"));
		user.setAddress(rs.getString("address"));
		user.setPhone(rs.getString("phone"));
		user.setEmail(rs.getString("email"));
		user.setCityIndex(Integer.parseInt(rs.getString("cityindex")));
		user.setCity(rs.getString("city"));
		user.setRegion(rs.getString("region"));
		user.setCountry(rs.getString("country"));
		user.setLogin(rs.getString("login"));
		user.setPassword(rs.getString("password"));	
		return user;
	}

}
