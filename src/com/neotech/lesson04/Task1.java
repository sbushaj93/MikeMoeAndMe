package com.neotech.lesson04;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Create an int variable named number1, assign the value of 500.
		 * 
		 * Store/assign number1 into a byte variable named number2.
		 * 
		 * Re-assign the number1 into number2. Print the value of number2. 
		 * Check if it is 500. What if the initial value was 50?
		 */

		int number1 = 150;	//int - can fit +- 2 billion
							//byte - can fit from -128 to 127
		byte number2 = (byte) number1; //narrowing

		System.out.println(number2);
		
	}

}
