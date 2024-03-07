package com.neotech.lesson04;

public class Homework {

	public static void main(String[] args) {


		/*
		 * 2. Write a java program that converts mile to km 
		 * and km to miles. 
		 * Use scale 1 mile = 1.609344. 
		 * Print the conversion on the console. 
		 * For example: 10 miles is 16.09344 kilometers
		 */
		
		
		double scale = 1.609344;
		double km, mile, km2, mile2;
		
		mile = 2;
		km = mile*scale;
		System.out.println(mile + " miles is " + km + "kilometers.");
		
		System.out.println("=====================");
		km2 = 60;
		
		mile2 = km2/scale;
		System.out.println(km2 + " kilometers is"  + mile2 + " miles!");

	}

}
