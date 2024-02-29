package com.neotech.lesson07;

import java.util.Scanner;

public class HW {
	public static void main(String[] args) {

//	Allow user to enter grade and then provide explanation: 
//	A-Excellent, B-Good, C-Average, D-Bad, any other grade --> 
//	Not Acceptable. 
//	At the end your program should print which 
//	grade was entered by the user with explanation.

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your grade: ");
		
		String grade;
		grade = scanner.next();
		grade = grade.toUpperCase();
		
		String result="";
		
		switch (grade){
		case "A":
			result = "Excellent";
			break;
		case "B":
			result = "Good";
			break;
		case "C":
			result = "Average";
			break;
		case "D":
			result = "Bad";
			break;
		default :
			result = "NOT Acceptable";
			break;
		}
		System.out.printf( "Your grade is %s. It is %s!!", grade, result);
		scanner.close();
	}
}
