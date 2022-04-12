package com.xworkz.exceptionemaill;

import com.xworkz.exceptionemaill.exception.*;


public class EmailService {

	
	private String[] email= new String[20];
	private int index=0;

	public EmailService()
	{
		System.out.println("created".concat(this.getClass().getSimpleName()));
	}
	public void add(String email) throws InvalidEmailException, CannotAddMoreEmailException {
		if(email!=null) {
		if(!(email.contains("@") && (email.endsWith(".net") ||email.endsWith(".in") || email.endsWith(".com") || email.endsWith(".edu") || email.endsWith(".org")))){
			
			throw new InvalidEmailException("Not a valid email:"+email);
		}else {
			
			if(index<email.length()) {
				this.email[index]=email;
				System.out.println("email is added :"+email);
				index++;
				
			}
			else {
				System.out.println("Array index is full");
				throw new CannotAddMoreEmailException("we are not able to add email id's more than 20");
			}
		}
		
	}
}
}
