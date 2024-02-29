package com.neotech.lesson03;

public class ShorthandOperators {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 10;
		
		// display before update
		System.out.println("num1 before update -> " + num1);

		//num1 = num1 + 5; //->shorthanded by num1 += 5
		num1 += 5;
		
		// display after update
		System.out.println("num1 after update -> " + num1);
		
		// display before update
		System.out.println("num2 before update -> " + num2);

		// display before update
		num2 *= 2;
		System.out.println("num2 after update -> " + num2);

		
		
	}

}
