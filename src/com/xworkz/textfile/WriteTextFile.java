package com.xworkz.textfile;



import java.io.*;
import java.util.Scanner;

public class WriteTextFile{
	
	public static void main(String[] args) {
		
		
		try {
			FileWriter file = new FileWriter("C:\\Users\\acer\\Desktop\\JavaCoding.txt");
			try {
				file.write("Programming isn't about what you know; it's about what you can figure out"+"\n"
			+"and java programming is the best language....!");
			}
			finally {
				file.close();
			}
			System.out.println("Successfully file is created");
		}
		catch(IOException m){
			System.out.println(m);
		}
	}
		}




