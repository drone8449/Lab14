package edu.handong.csee.java.lab14.prob3;
import java.util.Scanner;

public class Power_main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Powercalc cal = new Powercalc();
		
		while(keyboard.hasNextInt()) {
			int n = keyboard.nextInt();
			int p = keyboard.nextInt();
			
			try {
				System.out.println(cal.power(n, p));
			} catch (Exception e){
				System.out.println(e);
			}
		}
	}
}
