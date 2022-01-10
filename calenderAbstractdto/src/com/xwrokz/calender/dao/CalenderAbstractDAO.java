package com.xwrokz.calender.dao;

import com.xwrokz.calender.dto.CalenderDTO;

public abstract class CalenderAbstractDAO {
	
	abstract public void app();
	abstract public void use();
	abstract public void save(CalenderDTO dto);

}
