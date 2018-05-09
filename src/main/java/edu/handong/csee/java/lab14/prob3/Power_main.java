package edu.handong.csee.java.lab14.prob3;   // package name
import java.util.Scanner;   // import Scanner class

public class Power_main {   // class name
	public static void main(String[] args) {   // main method
		Scanner keyboard = new Scanner(System.in);   // declare object 'keyboard' to use Scanner Class
		Powercalc cal = new Powercalc();   // declare object 'cal' to use Powercalc Class
		
		while(keyboard.hasNextInt()) {   // repeat until keyboard has not next value
			int n = keyboard.nextInt();   // input is n
			int p = keyboard.nextInt();   // input is p
			
			try {   // try code
				System.out.println(cal.power(n, p));   // print power value
			} catch (Exception e){   // catch Exception
				System.out.println(e);   // print error message 
			}
		}
	}
}
