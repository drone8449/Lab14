package edu.handong.csee.java.lab14.prob1;   // package name
import java.util.Scanner;   // import Scanner Class
import java.util.Random;   // import Random Class

public class SpeedLim_main {    // class name
	
public static void main(String[] args) {    // main method
	Scanner keyboard = new Scanner(System.in);    // declare object 'keyboard' to use Scanner Class
	Random rand = new Random();  // declare object 'rand' to use Random Class
	int limit = 0, speed = 0;   // declare integer limit, speed
	
	System.out.println("Set the speed limit, officer: ");   // print message
	limit = keyboard.nextInt();   // next input is limit
	speed = rand.nextInt(101);   // random number(1~101) is speed
	
	SpeedLimitter lim = new SpeedLimitter(limit, speed);   // declare object 'lim' to use SpeedLimitter Class
	
	lim.warnSpeedLimit();   // run warnSpeedLimit method
	
	keyboard.close();   // close keyboard
   }
}
