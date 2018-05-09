package edu.handong.csee.java.lab14.prob4;   // package name

public class Boundary {   // class name
	private static int [] arr = new int[5];   // declare 'arr' to use 5-size integer array 
	private static int cnt = 0;   // declare integer
	
	public void receive(int num) throws ArrayIndexOutOfBoundsException {   // method having parameter num and throwing ArrayIndexOutOfBoundsException
		int i = cnt;   // cnt is i
		arr[i] = num;   // num is arr[i]
		cnt++;  // cnt increasing by 1
		System.out.printf("arr[%d] <- %d\n", i, num);   // print message
	}
}
