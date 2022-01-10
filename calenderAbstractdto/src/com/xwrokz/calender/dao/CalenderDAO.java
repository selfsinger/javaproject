package com.xwrokz.calender.dao;

import com.xwrokz.calender.dto.CalenderDTO;

public class CalenderDAO extends CalenderAbstractDAO{
	
	private CalenderDTO cal[]=new CalenderDTO[2];
	int index=0;
	
	@Override
	public void save(CalenderDTO dto) {
		cal[index]=dto;
		index++;
		System.out.println("Data is saved");
		
	}

	@Override
	public void app() {
		System.out.println("There is a free calender app for personal use");
		
	}

	@Override
	public void use() {
		System.out.println("Calender is the most important and useful thing in our life");
		
	}
	public void display()
	{
		for(int i=0;i<cal.length;i++)
		{
			System.out.println("Weeks:"+cal[i].getWeeks()+" "+"Date:"+cal[i].getDate()+" "+"Festivals:"+cal[i].getFestivals()+" "+"Cost:"+cal[i].getCost());
		}
	}



}
