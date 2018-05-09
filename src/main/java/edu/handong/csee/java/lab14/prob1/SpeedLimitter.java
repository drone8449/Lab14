package edu.handong.csee.java.lab14.prob1;   // package name

public class SpeedLimitter {   // class name
	private int speed = 0;   // declare integer speed
	private int limit = 0;   // declare integer limit
	
	public SpeedLimitter(int limit, int speed) {   // constructor 
		this.limit = limit;   // parameter limit is limit
		this.speed = speed;   // parameter speed is speed
	}
	
	public void warnSpeedLimit() {    // method name
		try {  // try code
			if(this.speed > this.limit) {   // if speed is bigger tan limit
				throw new Exception("Speed Limit " + this.limit + "km exceeded!");   // set error code
			}
			System.out.println("You are a Law abiding citizen!");   // print message
	      	} catch (Exception e) {   // catch error
	      		System.out.println(e.getMessage());   // print error message
	      		System.out.println("You are being fined. ");   // print message
	    }
		System.out.println("Your current speed is " + this.speed);   // print speed
	}
}
