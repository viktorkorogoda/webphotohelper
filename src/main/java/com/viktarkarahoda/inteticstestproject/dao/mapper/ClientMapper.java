package com.viktarkarahoda.inteticstestproject.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.viktarkarahoda.inteticstestproject.entity.Client;

public class ClientMapper implements RowMapper<Client> {

	@Override
	public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
		Client client = new Client();
		client.setIdClient(rs.getInt("idClient"));
		client.setName(rs.getString("name"));
		client.setSurname(rs.getString("surname"));
		client.setBirthday(rs.getString("birthday"));
		client.setAddress(rs.getString("address"));
		client.setPhone(rs.getString("phone"));
		client.setEmail(rs.getString("email"));
		return client;
	}
}
