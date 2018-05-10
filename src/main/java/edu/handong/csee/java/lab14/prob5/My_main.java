package edu.handong.csee.java.lab14.prob5;   // package name
import java.util.Scanner;   // import Scanner class

public class My_main {   // class name 
	public static void main(String[] args) {   // main method
		try {   // try code
			Scanner keyboard = new Scanner(System.in);   // declare object 'keyboard' to use Scanner Class
			String str = keyboard.nextLine();   // input is str
			My_main.myTest(str);   // run myTest method
		} catch(MyException e) {   // catch error
			System.out.println("Inside catch block: " + e);    // print error message
		}
	}
	
	static void myTest(String str) throws MyException {    // method having parameter str and throwing exception
		if(str.equals("null")) {   // if str = null
			throw new MyException("String val is null");   // set error code
		}
		else   // else 
			System.out.println("String val is: " + str);   // print str
	}
}
