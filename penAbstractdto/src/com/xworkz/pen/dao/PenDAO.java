package com.xworkz.pen.dao;

import com.xworkz.pen.dto.PenDTO;

public class PenDAO extends PenAbstractDAO{
	
	
	private PenDTO penDTO[]=new PenDTO[2];
	int index=0;
	
	
	
	@Override
	public void save(PenDTO dto) {
		penDTO[index] = dto;
		index++;
		System.out.println("Data is saved");
		
	}


	@Override
	public void type() {
		
		
		System.out.println("we have 3 types of pen : \n1.inkpen,\n2.refilpen,\n3.useAndthrowpen");		
	}

	@Override
	public void color() {
		System.out.println("we have 3 color of pen: \n1.black,\n2.blue,\n3.green");
		
	}

	@Override
	public void nibSize() {
		System.out.println("we have 3 nibsize pen: \n1.0.5,\n2.0.7,\n3.0.8");
		
	}

	@Override
	public void cap() {
		System.out.println("we have 3 caps :\n1.smallcap,\n2.threadcap,\n3.longcap");
		
	}
	public void display()
	{
		for(int i=0;i<penDTO.length;i++)
		{
			
			
			System.out.println("brand Name :"+penDTO[i].getBrandName());
			System.out.println("pen Name :"+penDTO[i].getName());
			
			
			
			
		}
	}


	
	
}
