package com.xworkz.markerinterface;
import java.io.*;

public class SerializationClass {
	
	public static void main(String[] args) {
		Singer singer = new Singer();
		singer.songName = "Akasha Bhoomi";
		singer.singerName = "Shreya Ghoshal";
		
		try {
			FileOutputStream fileout = new FileOutputStream("C:\\SerializationFile\\Content.txt");
			ObjectOutputStream  out = new ObjectOutputStream(fileout);
			out.writeObject(singer);
			out.close(); 
			fileout.close();
			System.out.println("this serailized data is saved in Content.txt file");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
