package com.xworkz.pen.dao;

import com.xworkz.pen.dto.PenDTO;

public abstract class PenAbstractDAO {
	
	abstract public void type();
	abstract public void color();
	abstract public void nibSize();
	abstract public void cap();
	abstract public void save(PenDTO dto);
	

}
