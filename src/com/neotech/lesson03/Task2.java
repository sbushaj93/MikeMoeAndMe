package com.neotech.lesson03;

public class Task2 {
//	Create a new class named Task2
//
//	a) Write a program to print the area and perimeter of a rectangle with 
//	width = 5 and height = 8. Your program should say. “The perimeter of a 
//	rectangle with width ___ and height ___ is equal to ___ and the area is ___”
//
//	Area = width * height
//	Perimeter = 2 * (width + height)

	public static void main(String[] args) {
		
		// declare and initialize the variables
		int w = 5, h = 8;
		
		int a, p;
		
		p = 2 * (w + h);
		a = w * h;
		
		
		System.out.println("The perimeter of a rectangle with width " + w +  
							" and height " + h + " is equal to " + p + 
							" and the area is " + a);
	
	}

}
