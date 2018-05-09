package edu.handong.csee.java.lab14.prob3;   // package name

public class Powercalc {   // class name
	public long power(int n, int p) throws Exception {   // method having n, p parameter and throwing Exception
		long result = 0;    // declare long result
		
		result = (long)Math.pow(n, p);   // result is n^p
		if(n < 0 || p < 0) {   // if n is lower than 0 or p is lower than 0
			throw new Exception("n or p should not be negative.");   // set error code
		}
		if(n == 0 && p == 0) {   // if n is 0 and p is 0
			throw new Exception("n and p should not be zero.");   // set error code
		}
		return result;   // return result value
	}
}
