package com.xworkz.tester;

import com.xworkz.exceptionemaill.exception.*;
import com.xworkz.exceptionemaill.EmailService;


public class EmailServiceTester {
	
	public static void main(String[] args) {
		EmailService service=new EmailService();
			try {
				service.add("meghasv1234@gmail.com");     		
				service.add("citizenl@live.com");
				service.add("bahwi@icloud.com");
				service.add("seasweb@att.net");
				service.add("plover@comcast.net");
				service.add("dleconte@msn.com");
				service.add("cgreuter@att.net");
				service.add("pontipak@att.net");
				service.add("firstpr@yahoo.com");
				service.add("syncnine@me.com");
				service.add("fwitness@verizon.net");
				service.add("cosimo@hotmail.com");
				service.add("rgarton@msn.org");
				service.add("satyabrata642@gmail.com");
				service.add("saurabh.negi99@gmail.edu");
				service.add("shailendra.ipec@gmail.com");
				service.add("sharad.sy@gmail.com");
				service.add("sharikcss@gmail.com");
				service.add("tapash19@gmail.com");
				service.add("thessojha@gmail.com");
			} catch (InvalidEmailException e) {
				System.out.println("caught exception");
				e.printStackTrace();
			} catch (CannotAddMoreEmailException e) {
				System.out.println(e);
				e.printStackTrace();
			}
		} 
		
	}


