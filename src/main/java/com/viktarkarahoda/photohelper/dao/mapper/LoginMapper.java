package com.viktarkarahoda.photohelper.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.viktarkarahoda.photohelper.viewBean.LoginBean;

public class LoginMapper implements RowMapper<LoginBean>{

	@Override
	public LoginBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		LoginBean loginBean = new LoginBean();
		loginBean.setUsername(rs.getString("username"));
		loginBean.setPassword(rs.getString("password"));
		return loginBean;
	}

}
