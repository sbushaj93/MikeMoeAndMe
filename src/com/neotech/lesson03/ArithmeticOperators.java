package com.neotech.lesson03;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		int num1 = 24,
			num2 = 5; // declaring and initializing
		
		int sum = num1 + num2; // addition
		int sub = num1 - num2; // subtraction
		int mult = num1 * num2; // multiplication
		int div = num1 / num2; // division
		
		System.out.println("sum -> " + sum);
		System.out.println("sub -> " + sub);
		System.out.println("mult -> " + mult);
		System.out.println("div -> " + div);
		
		double divRes = num1 / num2; // num1 and num2 are both integers 
									// their division result will be also int
		
		System.out.println("divRes -> " + divRes);
		
		double d1 = 24, 
				d2 = 5;
		double doubleResult = d1 / d2; // d1 and d2 are both doubles 
										// their division result will be also double
		
		System.out.println("doubleResult -> " + doubleResult);
		
	}

}
