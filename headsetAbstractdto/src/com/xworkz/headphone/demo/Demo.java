package com.xworkz.headphone.demo;

import com.xworkz.headphone.dao.HeadPhoneDAO;
import com.xworkz.headphone.dto.HeadPhoneDTO;

public class Demo {
	public static void main(String[] args) {
		HeadPhoneDTO phone = new HeadPhoneDTO("Boat","Black",1500);
		HeadPhoneDTO phone1 = new HeadPhoneDTO("Philips","red",500);
		HeadPhoneDAO dao=new HeadPhoneDAO();
		dao.save(phone);
		dao.save(phone1);
		System.out.println();
		System.out.println(phone.toString());
		System.out.println(dao.toString());
		System.out.println(phone1.toString());
		System.out.println();
		dao.use(); dao.best();
		System.out.println();
		
		
		dao.display();
		
		
	}

}
