package com.viktarkarahoda.photohelper.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.viktarkarahoda.photohelper.entity.Worker;

public class WorkerMapper implements RowMapper<Worker>{

	@Override
	public Worker mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
