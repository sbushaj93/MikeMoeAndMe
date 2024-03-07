package com.neotech.lesson05;

public class NestedElseIf {
//	Write a Java program to check if a student has done the
//	Quiz. If the student did the Quiz, then check the score and
//	give the following evaluations:
//	◆ If the score is 90 or greater, print “A, Great job!”.
//	◆ If the score is 80 or greater, print “B, Well done!”.
//	◆ If the score is 70 or greater, print “C, You passed!”.
//	◆ Otherwise, print “F, You failed”

	public static void main(String[] args) {
		
		boolean isDone = true;
		double score = 90.5;
		
		if (isDone) {
			if (score >= 90) {
				System.out.println("A, Great job!");
			}
			else if(score >= 80) {
				System.out.println("B, Well done!");
			}
			else if(score >= 70) {
				System.out.println("C, You passed.");
			}
			else {
				System.out.println("F, you failed!");
			}
			
		}
		else {
			System.out.println("F, you failed!");
		}
		
	}

}
