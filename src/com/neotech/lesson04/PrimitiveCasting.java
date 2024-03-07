package com.neotech.lesson04;

public class PrimitiveCasting {

	public static void main(String[] args) {

		//type casting
		
		
		//byte --> short --> int --> long --> float --> double
		
		double d1 = 3.7;// no casting happened 
						//--> 3.7 is a double as is assigned to a double
		System.out.println(d1);
		
		double d2 = 6; //casting happened (widening)
					// 6 is casted as a double --> 6.0
		System.out.println(d2);
		
		//widening, implicit casting, automatic casting
		int num = 5;
		double d3 = num;
		System.out.println(d3);
		
		
		//compilation error: Type mismatch: cannot convert from double to int
	//	int num2 = 6.5;
		
//		narrowing, explicit casting, manual casting
		
		// I tell Java, I am sure, I want it stored in an int
		int num2 = (int) 6.5; 
		System.out.println(num2);
		
		
		byte b1 = (byte) 4567;
		System.out.println(b1);
		
		
		int i2 = 50; // 00001010101001010100101010 (int has 32 bits)
					// 01010111 (byte has 8 bits)
		byte b2 = (byte) i2;
		System.out.println(b2);
		
		
		//another narrowing example
		long L1 = 17L;
		int number = (int) L1; //am I loosing data?
		System.out.println(number);
		
		
		long L2 = 45654756475456L;
		int number2 = (int) L2;
		System.out.println(number2);

		//another widening example
		int number3 = 250;
		float f1 = (float) number3; //I can add (float), but it is not necessary
									//it does not change anything, still widening
		float f2 = number3;
		
		System.out.println(f1);
		System.out.println(f2);
		
		
	}

}
