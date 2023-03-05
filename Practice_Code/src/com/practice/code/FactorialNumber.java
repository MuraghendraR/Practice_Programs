package com.practice.code;

public class FactorialNumber {
	
	public static void main(String[] args) {
	
		int value = factorialNumber(3);
		System.out.println("factorial -->"+value);
	}

	private static int factorialNumber(int number) {
		int fact =1; 
		for (int i=1; i<=number;i++){
			fact = fact*i;
		}
		return fact;
	}
}