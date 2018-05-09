package edu.handong.csee.java.lab14.prob4;   // package name
import java.util.Scanner;   // import Scanner class

public class Bound_main {   // class name
	public static void main(String[] args) {   // main method
		Scanner keyboard = new Scanner(System.in);   // declare object 'keyboard' to use Scanner Class
		int num = 0;   // declare num
		Boundary arr = new Boundary();   // declare object 'arr' to use Boundary Class
		boolean repeat = true;   // declare boolean repeat
		while(repeat) {   // repeat until repeat is false
			try {   // try code
				System.out.print("Enter an integer: ");   // print message
				num = keyboard.nextInt();   // input is num
				arr.receive(num);   // run receive method
			}
			catch(ArrayIndexOutOfBoundsException e) {   // catch ArrayIndexOutOfBoundsException
				System.out.println("Invalid array index access!");   // print message
				repeat = false;   // repeat is false 
			}
		}
	}
}
