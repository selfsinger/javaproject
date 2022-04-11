package com.xworkz.abstratcdtodao.dao;

import com.xworkz.abstratcdtodao.dto.CameraDTO;

public abstract class CameraDAO {
	//CameraDAO--> abstract save(CameraDTO), abstract CameraDTO findById(int id), abstract CameraDTO findByMaxCost(), abstract CameraDTO findMinCost();

	
	public abstract  void save(CameraDTO dto);
	
	public abstract  CameraDTO findById(int id);
	
	public abstract  CameraDTO findByMaxPrice();
	
	public abstract  CameraDTO findMinPrice();
	
	
}
