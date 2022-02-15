package com.xworkz.constructorassign2;

public class Tubelight {
	String type,color,company;
	double price;
	
	Tubelight(String type,String color,String company,double price)
	{
		this.type=type;
		this.color=color;
		this.company=company;
		this.price=price;
	}
	public void show()
	{
		System.out.println("The type of the tubelight is:"+type+"\nThe color of the LED type tubelight is:"+color
				+ "\nThe company of the tubelight is: "+company+"\n The price of the LED tubelight is: "+price);
	}

}
