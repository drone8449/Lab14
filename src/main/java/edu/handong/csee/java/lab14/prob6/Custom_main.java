package edu.handong.csee.java.lab14.prob6;   // package name
import java.util.Scanner;   // import Scanner class

public class Custom_main {   // class name 
	public static void main(String[] args) {   // main method
		String name, race;   // declare strings
		int age = 0;   // declare integer
		Scanner keyboard = new Scanner(System.in);   // declare object 'keyboard' to use Scanner Class
		CustomID obj = new CustomID();   // declare object 'obj' to use CustomID Class
		boolean repeat = true;   // declare boolean 

	while(repeat) {    // repeat until repeat is false
	   try {   // try code
		   if(obj.getState() == 0) {   // if state is 0
			   System.out.print("Enter your name: ");   // print message
			   name = keyboard.nextLine();   // input is name
			   obj.set_name(name);   // set name value
	       }
	       else if(obj.getState() == 1) {   // if state is 1
		       System.out.print("Enter your age: ");   // print message
		       age = keyboard.nextInt();   // input is age
		       keyboard.nextLine();   // get enter value 
		       obj.set_age(age);   // set age value
	        }
	       else if(obj.getState() == 2) {   // if state is 2
	    	       System.out.print("Enter your race: ");   // print message
	    	       race = keyboard.nextLine();   // input is race
	    	       obj.set_race(race);   // set race value
	    	   }
         }
	   catch(Exception e){   // catch exception
		   System.out.println(e.getMessage());   // print error message
		   continue;   // continue
		 }
	  }
   }
}