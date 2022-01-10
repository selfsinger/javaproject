package com.xworkz.map.dao;

import com.xworkz.map.dto.MapDTO;

public class MapDAO extends MapAbstractDAO{
	private MapDTO map[]=new MapDTO[1];
	int index=0;
	
	@Override
	public void save(MapDTO dto) {
		map[index]=dto;
		index++;
		System.out.println("Data is saved");
	}

	@Override
	public void search() {
		System.out.println("we can search any direction which we want thrugh map");
		
	}
	public void display()
	{
		for(int i=0;i<map.length;i++)
		{
			System.out.println("Type of maps:"+map[i].getType());
			System.out.println("Price of maps:"+map[i].getPrice());
		}
	}

	
		
	

}
