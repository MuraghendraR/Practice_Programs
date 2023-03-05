package com.practice.code;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int number = 13;
		boolean value = primeOrNot(number);
		
		if (value){
				System.out.println("Prime NUmber");
		} else {
			System.out.println("NOt Prime NUmber");
		}
	}

	private static boolean primeOrNot(int number) {
		
		if (number==0 || number==1) return false;
		
		for (int i=2; i<number; i++) {
			if (number%i==0) return false;
		}
		return true;
	}
}