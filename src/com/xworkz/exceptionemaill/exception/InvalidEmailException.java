package com.xworkz.exceptionemaill.exception;

public class InvalidEmailException extends Exception {

	public InvalidEmailException(String word) {
		System.out.println(word);
	}
}