package com.xworkz.fruits.dao;

import com.xworkz.fruits.dto.FruitsDTO;

public abstract class FruitsAbstractDAO {
	abstract public void taste();
	abstract public void type();
	abstract public void save(FruitsDTO dto);

}
