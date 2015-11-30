package com.viktarkarahoda.photohelper.dao;

import java.util.List;

import com.viktarkarahoda.photohelper.entity.Worker;

public interface WorkerDao {

	public List<Worker> viewWorkerList();
	public List<Worker> viewWorkerNoOrder();
}
