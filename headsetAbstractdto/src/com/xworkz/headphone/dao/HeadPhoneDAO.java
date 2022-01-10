package com.xworkz.headphone.dao;

import com.xworkz.headphone.dto.HeadPhoneDTO;

public class HeadPhoneDAO extends HeadAbstractDAO{
	
	private HeadPhoneDTO head[]=new HeadPhoneDTO[2];
	int index=0;
	
	@Override
	public void save(HeadPhoneDTO dto) {
		head[index]=dto;
		index++;
		System.out.println("Data is saved");
		
	}

	@Override
	public void use() {
		System.out.println("HeadPhones are very useful while listening anything bcs we can clearly listen all the things");
		
	}

	@Override
	public void best() {
		System.out.println("In this time we can get the best headphones out there");
		
	}
	public void display()
	{
		for(int i=0;i<head.length;i++)
		{
			System.out.println("Brand Name of headphone is:"+head[i].getBrand());
			System.out.println("Color of headphone is:"+head[i].getColor());
			System.out.println("Cost of headphone is:"+head[i].getCost());
			
		}
	}

	

}
