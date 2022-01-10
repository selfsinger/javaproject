package com.xworkz.pen.tester;

import com.xworkz.pen.dao.PenDAO;
import com.xworkz.pen.dto.PenDTO;

public class Tester {
	
	public static void main(String[] args) {
		PenDTO penDTO=new PenDTO("grip","cello");
		PenDTO penDTO1=new PenDTO("flow","nataraj");
		
		PenDAO dao=new PenDAO();
		dao.save(penDTO);
		dao.save(penDTO1);
		System.out.println();
		System.out.println(penDTO.toString());
		System.out.println(penDTO1.toString());
		System.out.println();
		dao.type();
		dao.color();
		dao.nibSize();
		dao.cap();
		
		dao.display();
		
		
	}

}
