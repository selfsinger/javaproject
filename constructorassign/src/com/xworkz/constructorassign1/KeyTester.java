package com.xworkz.constructorassign1;

public class KeyTester {
public static void main(String[] args) {
	
	Keyboard key1=new Keyboard("5 years","technical work");
	System.out.println("The brand of keyboard is : "+key1.brand);
	System.out.println("The number of keys we can see in keyboard are : "+key1.noOfKeys);
	System.out.println("the lifespan of a keyboared will be depends on us but it might take this much : "+key1.lifeSpan);
	System.out.println("A keyboard contains many mechanical switches or push-buttons called \"keys\". "
			+ "When one of these are pushed, an electrical circuit is closed, and the keyboard sends a signal to the computer that tells it what letter, "
			+ "number or symbol it would like to be shown on the screen.:"+key1.working);
	
}
}
