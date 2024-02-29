package com.neotech.lesson03;

public class StringConcatenation {

	public static void main(String[] args) {
		
		System.out.println("Hello" + " " + "NeoTech!");
		
		String language = "Python";
		
		System.out.println("I love " + language);
		
		String s1 = "I love";
		String s2 = "Porgamming";
		
		// let's get back to Java
		language = "Java";
		
		System.out.println(s1 + " " + language + " " + s2);
		// I love-> I love -> I love Java-> I love Java -> I love Java Programming 
		
		System.out.println("I have " + 2 + " cats.");
		System.out.println("I have " + 2 + 2 + " cats.");
		System.out.println("I have " + (2 + 2) + " cats.");
		//1) 2+2 = 4 <- first
		//2)I have 4
		//3) I have 4 cats.
		


	}

}
