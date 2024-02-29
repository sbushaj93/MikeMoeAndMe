package com.neotech.lesson02;

public class PrintLine {

	public static void main(String[] args) {

		//sysout and CTRL + SPACE
		System.out.println("Whats up Scott!!");
		//println --> prints the whole statement and then moves the cursor to the new line
		//print --> prints the whole statement but it DOES NOT move the cursor to the new line
		System.out.println("How are you doing??");

		
		System.out.print("1"); //after printing 1, then cursor stays on the same line
		System.out.print("2"); //this line start printing where the cursor is
		System.out.print("3"); //we are still on the same line
		
		System.out.println("4"); //will be printed on the same line as 3 and then it moves the 
								//cursor to the new line
		System.out.println("5"); //print in a new line and send the cursor to the new line
		System.out.println("6");
		
		
		// \n --> it is same as hitting Enter key (newline shortcode)
		System.out.println("Do you like Java?\nYes, I do!");
		
		//this will print an empty line
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		//we can also print multiple newlines in a single statement
		System.out.println("\n\n\n");
		System.out.println("Something");
		
		
	}

}
