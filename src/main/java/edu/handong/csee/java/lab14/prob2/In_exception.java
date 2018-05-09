package edu.handong.csee.java.lab14.prob2;  // package name
import java.util.*;   // import util.* class

public class In_exception {   // class name
	private int x = 0, y = 0;   // declare integer x, y
	
	public In_exception(){   // constructor
	}
	
	public void detectError(){   // method name
		try {   // try code
			Scanner keyboard = new Scanner(System.in);   // declare object 'keyboard' to use Scanner Class
			System.out.print("x: ");   // print message
			x = keyboard.nextInt();   // next input is x
			System.out.print("y: ");   // print message
		    y = keyboard.nextInt();   // next input is y
		    System.out.print(this.x/this.y);   // print x/y
		}
		catch(ArithmeticException e) {   // catch ArithmeticException
			System.out.println("java.Lang.ArithmeticException: " + e.getMessage());   // print error message
		}
		catch(InputMismatchException e) {   // catch InputMismatchException
			System.out.println("java.util.InputMismatchException");   // print error message
		}
		catch(Exception e) {   // catch Exception
			System.out.println("Some other exception has occurred: " + e.getMessage());   // print error message
		}
	}
}
