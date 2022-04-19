package com.xworkz.markerinterface.deserialzation;

import java.io.*;

import com.xworkz.markerinterface.Singer;

public class DeserializationClass {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Singer singer=null;
		
		try {
			FileInputStream fileinput = new FileInputStream("C:\\SerializationFile\\Content.txt");
			ObjectInputStream in = new ObjectInputStream(fileinput);
			singer = (Singer) in.readObject();
			in.close(); fileinput.close();
		}
		finally {
			System.out.println("Here,deserialzing singer...");
			System.out.println("Name of Song :"+singer.songName+"\n"+"Name of Singer:"+singer.singerName);
			
		}
	}

}
