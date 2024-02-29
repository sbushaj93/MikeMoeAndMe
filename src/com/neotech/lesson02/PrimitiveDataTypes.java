package com.neotech.lesson02;

public class PrimitiveDataTypes {

	public static void main(String[] args) {

		
		//Data Type  name/identifier  operator (=)     value;
		
		//byte can be assigned any value -128 to 127
		byte ugur = 10;
		//this gives a compiler error
	//	byte julia = 150;
		byte ozan = -115; 
	
		
		short yu = 1500;
		//3 can also fit in byte, but I would this in case sasha can be assigned 
		//also values larger than 127
		short sasha = 3;
		
		System.out.println(sasha);
		
		int diana = 85000;
		int ali = 5;
		
		//if you know the number will be huge, larger than 2 billion
		long berke = 43459428572498462L;
		long raza = 6L;
		
		//how would I decide between any of these types for a number?
		 //1. what are the possible ranges of your variable?
		
		
		
		//what about storing decimals??
		double ulku = 25.345;
		float adem = 25.345F;
		
		System.out.println(adem);
		
		char rigena = 'R'; //not " but we use '. It can only contain a character
		char dollar = '$';
		char a = '3';
		char s = ' ';
		
		//boolean can only accept true or false
		boolean seniz = true;
				
		System.out.println(ulku);
		System.out.println(rigena);
		System.out.println(dollar);
		System.out.println(seniz);
		
	}

}
