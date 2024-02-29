package com.neotech.lesson03;

public class Task1 {
//	Create a Java program and name the Variables
//	a) In your program create different type of variables to store student’s information 
//  and then print value of those variables:
//		- name
//		- lastName
//		- grade
//		- city
//		- state
//
//	b) Print the following:
//	My name is ______ and my lastname is _____.
//	I live in the city of _____, state of ____.

	public static void main(String[] args) {
		
		String name = "Diana", 
			   lastName = "Karakasidi";
		char grade = 'A';
		String city = "Brooklyn";
		String state = "NY";
		
		System.out.print("My name is " + name + " and my lastname is " + lastName +  ".\n" + 
						 "I live in the city of " + city + ", state of " + state + ".");
		
		

	}

}
