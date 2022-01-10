package com.xworkz.map.demo;

import com.xworkz.map.dao.MapDAO;
import com.xworkz.map.dto.MapDTO;

public class Demo {
	
	public static void main(String[] args) {
		MapDTO m = new MapDTO("Googlemaps and Papermaps",50);
		MapDAO dao=new MapDAO();
		dao.save(m);
		System.out.println();
		System.out.println(m.toString());
		System.out.println();
		dao.search();
		System.out.println();
		dao.display();
		
	}

}
