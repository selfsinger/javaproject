package com.xworkz.exceptionemaill.exception;

public class CannotAddMoreEmailException extends Exception {
	
	public CannotAddMoreEmailException(String content) {
		
		System.out.println(content);
		
	}

}