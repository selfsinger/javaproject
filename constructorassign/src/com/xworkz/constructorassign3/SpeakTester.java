package com.xworkz.constructorassign3;

public class SpeakTester {
	public static void main(String[] args) {
		Speaker speak=new Speaker("wireless speakers for music","71M", "150Hz", 2000);
		System.out.println("The type of the speaker is:"+speak.type);
		System.out.println("The no of wireless speakers :"+speak.noOfSpeakers);
		System.out.println("The bass of speaker is :"+speak.bass);
		System.out.println("The price of wireless speaker is:"+speak.price);
		
	}

}
