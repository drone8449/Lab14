package edu.handong.csee.java.lab14.prob5;   // package name

public class MyException extends Exception {   // inheritance from Exception
	private String message = null;   // declare string
	
	public MyException() {   // constructor
		super();   // upcasting to Exception
	}
	
	public MyException(String message) {    // constructor
		super(message);   // upcasting message to Exception
		this.message = message;   // parameter message is message
	}
	
	public MyException(Throwable cause) {   // constructor
		super(cause);   // upcasting message to Exception
	}
	
	public String toString() {   // method name 
		return message;   // return message
	}
}
