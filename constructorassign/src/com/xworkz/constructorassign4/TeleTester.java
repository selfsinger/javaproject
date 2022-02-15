package com.xworkz.constructorassign4;

public class TeleTester {
	public static void main(String[] args) {
		Television tel=new Television(true,"Japan");
		tel.display();
		System.out.println("We can see the availability of television everywhere:"+tel.available);
		System.out.println("Sony is made in:"+tel.countryOfOrigin);
		
		
	}

}
