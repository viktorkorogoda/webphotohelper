package com.viktarkarahoda.inteticstestproject.dao.impl;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.ListUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.viktarkarahoda.inteticstestproject.dao.ClientDao;
import com.viktarkarahoda.inteticstestproject.dao.mapper.ClientMapper;
import com.viktarkarahoda.inteticstestproject.entity.Client;

@Repository
public class ClientDaoImpl implements ClientDao {

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public int insertClient(Client client) {
		String SQL = "INSERT INTO CLIENTS (idClient, name, surname, birthday, address, phone, email) VALUES (CLIENTS_SEQ.nextval, :name, :surname, :birthday, :address, :phone, :email)";
		MapSqlParameterSource namedParameters = new MapSqlParameterSource();
		namedParameters.addValue("name", client.getName());
		namedParameters.addValue("surname", client.getSurname());
		namedParameters.addValue("birthday", client.getBirthday());
		namedParameters.addValue("address", client.getAddress());
		namedParameters.addValue("phone", client.getPhone());
		namedParameters.addValue("email", client.getEmail());
		return namedParameterJdbcTemplate.update(SQL, namedParameters);
	}

	@Override
	public Client getClientByNameSurname(Client client) {
		String SQL = "SELECT * FROM CLIENTS WHERE NAME=:name AND SURNAME=:surname";
		MapSqlParameterSource namedParameters = new MapSqlParameterSource();
		namedParameters.addValue("name", client.getName());
		namedParameters.addValue("surname", client.getSurname());

		List<Client> clientList = namedParameterJdbcTemplate.query(SQL, namedParameters, new ClientMapper());
		if (CollectionUtils.isNotEmpty(clientList)) {
			return clientList.get(0);
		}

		return null;
	}

	@Override
	public Client getClient(int idClient) {
		String SQL = "SELECT * FROM Clients WHERE idClient = :idClient";
		MapSqlParameterSource namedParameters = new MapSqlParameterSource();
		namedParameters.addValue("idClient", idClient);

		List<Client> clientList = namedParameterJdbcTemplate.query(SQL, namedParameters, new ClientMapper());
		if (CollectionUtils.isNotEmpty(clientList)) {
			return clientList.get(0);
		}

		return null;
	}

	@Override
	public List<Client> getClientList() {
		String SQL = "SELECT * FROM Clients";
		List<Client> clientList = namedParameterJdbcTemplate.query(SQL, new ClientMapper());
		return ListUtils.emptyIfNull(clientList);
	}
}
