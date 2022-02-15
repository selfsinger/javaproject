package com.xworkz.constructorassign4;

public class Television {
	String type="LED";
	String manufacture="Sony Bravia";
	double price=70000;
	boolean available;
	String countryOfOrigin;
	
	
	Television(boolean available,String countryOfOrigin)
	{
	System.out.println("This is a parameterized constructor");
	this.available=available;
	this.countryOfOrigin=countryOfOrigin;
	
	
}
	public void display()
	{
		System.out.println("Type of television is:"+type+"\nManufacture :"+manufacture+"\nPrice of Tv  is:"+price);
	}
	

}
