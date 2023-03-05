package com.practice.code;

public class FibonacySeries {
	
	public static void main(String[] args) {
		
		fibonacySeries(10);
		
	}

	private static void fibonacySeries(int number) {
		
		int a=0;
		int b=1;
		int c=1;
		
		for (int i=0 ;i<=number; i++) {
			System.out.print(a+",");
			a=b;
			b=c;
			c=a+b;
		}
	}
}