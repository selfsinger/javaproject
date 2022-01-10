package com.xworkz.fruits.tester;

import com.xworkz.fruits.dao.FruitsDAO;
import com.xworkz.fruits.dto.FruitsDTO;

public class Tester {
	public static void main(String[] args) {
		FruitsDTO fruit=new FruitsDTO("Apple",100);
		FruitsDTO fruit1=new FruitsDTO("Banana",50);
		FruitsDTO fruit2=new FruitsDTO("kiwi",130);
		FruitsDTO fruit3=new FruitsDTO("grapes",60);
		
		
		FruitsDAO dao=new FruitsDAO();
		dao.save(fruit);
		dao.save(fruit1);
		dao.save(fruit2);
		dao.save(fruit3);
		System.out.println();
		System.out.println(fruit.toString());
		System.out.println(fruit1.toString());
		System.out.println(fruit2.toString());
		System.out.println();
		dao.taste();
		dao.type();
		System.out.println();
		
		
		dao.display();
	}

}
