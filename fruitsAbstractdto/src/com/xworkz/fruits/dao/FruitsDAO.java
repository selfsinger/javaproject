package com.xworkz.fruits.dao;

import com.xworkz.fruits.dto.FruitsDTO;

public class FruitsDAO extends FruitsAbstractDAO{
	
	private FruitsDTO fruits[]=new FruitsDTO[4];
	int index=0;

	@Override
	public void save(FruitsDTO dto) {
		fruits[index]=dto;
		index++;
		System.out.println("Data is saved");
		
		
	}


	@Override
	public void taste() {
		System.out.println("Fruits taste are always better");
		
	}

	@Override
	public void type() {
		System.out.println("Almost all kinds of fruits are very healthy");
		
	}
	public void display()
	{
		for(int i=0;i<fruits.length;i++)
		{
			System.out.println("Name of the fruit is:"+fruits[i].getName()+" "+"\nCost :"+fruits[i].getCost());
		}
	}

}
