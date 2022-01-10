package com.xwrokz.calender.tester;

import com.xwrokz.calender.dao.CalenderDAO;
import com.xwrokz.calender.dto.CalenderDTO;

public class Tester {
	public static void main(String[] args) {
		CalenderDTO calender=new CalenderDTO("7weeks","04/09/1998","My Birthday",20);
		CalenderDTO calender2=new CalenderDTO("7weeks","14/11/2022","Childrens Day",20);
		
		CalenderDAO dao=new CalenderDAO();
		dao.save(calender);
		dao.save(calender2);
		System.out.println(calender.toString());
		System.out.println(calender2.toString());
		System.out.println();
		dao.app();
		dao.use();
		System.out.println();
		
		dao.display();
	
	}

}
