package com.neotech.lesson05;

public class ElseIfCondition {

	public static void main(String[] args) {

		double d1 = 61;
		int d2 = 61;

		if (d1 > d2) {
			System.out.println("Number " + d1 + " is greater than " + d2);
		} else if (d1 < d2) {
			System.out.println("Number " + d2 + " is greater than " + d1);
		} else { // d1 == d2
			System.out.println("Number " + d1 + " is equal to " + d2);
		}

	}

}
