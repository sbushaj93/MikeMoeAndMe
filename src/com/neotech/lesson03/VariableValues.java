package com.neotech.lesson03;

public class VariableValues {
//	Create a Java program and name it VariableValues
//	In your program create variables to store all different types of primitive data.
//	Print the value of each variable.
//	Update value of each variable.
//	Print the value of each variable after updating.

	public static void main(String[] args) {
		//datatype 			name			assignment 			value
		//					(identifier)	operator 			
		byte				a				=					127;
		short				b				=					4594;
		int					c				=					-40000;
		long				d				=					1275868973789236L;
		float				e				=					35.46f;
		double				f				=					2567.9983465;
		boolean				g				=					true;
		char				h				=					'$';
		
		// display the variables
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		a = 10;
		b = 15;
		c = 60;
		d = 120L;
		e = 15.555523879644654645465589f;
		f = 15.555523879644654645465589;
		g = false;
		h = '#';
		
		// display the variables after re-assigning 
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);

	}

}
