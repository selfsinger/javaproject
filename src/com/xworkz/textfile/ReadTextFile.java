package com.xworkz.textfile;


import java.io.*;
import java.util.Scanner;

public class ReadTextFile {

	public static void main(String[] args) throws IOException {
		
//		try {
			FileReader read = new FileReader("C:\\Users\\acer\\Desktop\\JavaCoding.txt");
			Scanner s=new Scanner(read);
			
			//String insideFile = "";
			System.out.println(s.nextLine()); //to read first line only
			while(s.hasNextLine()) { //if scanner has a next line ,ll print
				//insideFile = insideFile.concat(s.nextLine() + "\n"); //concatinatng privious line with new line
				System.out.println(s.nextLine());
				//System.out.println(insideFile); //to print concatinating string
			}
//			
			//to copy the text from one file to another
//			FileWriter file = new FileWriter("C:\\Users\\acer\\Desktop\\NewJavaCoding.txt");
//			file.write(insideFile);
//			file.close();
			
			
}
}
