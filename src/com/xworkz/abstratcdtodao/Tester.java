package com.xworkz.abstratcdtodao;

import com.xworkz.abstratcdtodao.dao.CameraImplementationDAO;
import com.xworkz.abstratcdtodao.dto.CameraDTO;

public class Tester {

	public static void main(String[] args) {
		CameraDTO dto1=new CameraDTO();
		dto1.setId(3452);
		dto1.setBrand("Sony");
		dto1.setPixel("61.0 MP ");
		dto1.setType("DSLR");
		dto1.setPrice(53590.00);
		CameraImplementationDAO dao=new CameraImplementationDAO();
		dao.save(dto1);
		
		CameraDTO dto2=new CameraDTO();
		dto2.setId(6786);
		dto2.setBrand("Canon");
		dto2.setPixel("50.6 MP ");
		dto2.setType("mirrorless");
		dto2.setPrice(264999.00);
		dao.save(dto2);
		
		
		CameraDTO dto3=new CameraDTO();
		dto3.setId(9876);
		dto3.setBrand("Nikon");
		dto3.setPixel("24.2 MP ");
		dto3.setType("compact");
		dto3.setPrice(30000.00);
		dao.save(dto3);
		
		CameraDTO dto4=new CameraDTO();
		dto4.setId(6787);
		dto4.setBrand("Canon");
		dto4.setPixel("18.91 MP ");
		dto4.setType("bridge");
		dto4.setPrice(55000.00);
		dao.save(dto4);
		
		System.out.println();
		System.out.println(dao.findById(3452));
		
		System.out.println();
		System.out.println(dao.findByMaxPrice());
		
		System.out.println();
		System.out.println(dao.findMinPrice());
		
		System.out.println();
		System.out.println("here i am printing all values:\n"+dto1.toString()+" \n"+dto2.toString()+" \n"+dto3.toString()+" \n"+dto4.toString());
		
		
		
	}
}
