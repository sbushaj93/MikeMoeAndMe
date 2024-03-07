package com.neotech.lesson04;

public class Recap {

	public static void main(String[] args) {
	
		
		
		//order of the arithmetic operations
		//PEMDAS => Parenthesis, Exp, Multiplication, Division, Addition, Sub
		
		int num1 = 5 + 5 + 5;
		System.out.println(num1);
		
		int num2 = 5 + 5 * 5;
		System.out.println(num2);
		
		int num3 = (5 + 5) * 5;
		System.out.println(num3);
		
		//we could also print directly
		System.out.println(5*5 + 5/5);
		
		System.out.println("======================");
		
		int number1 = 15;
		int number2 = 4;
		
		// 15/4 --> 12/4 + 3/4
		int div = number1/number2; //3.75
		System.out.println("div -> " + div);
		
				//15  	% 	4 --> largest fully divisible number is 12
				// % --> gives us 15 - 12 --> 3
		int rem = number1 % number2;
		System.out.println("rem -> " + rem);
		
		System.out.println("Addition vs Concatenation");
		
		int a = 10;
		int b = 10;
		
		String x = "Java";
		String y = "Tuesday";
		
		System.out.println(x + " " + y);//Java Tuesday
		System.out.println(x + y + a);//JavaTuesday10
		System.out.println(x + a + b);//Java1010
		
		System.out.println(x + (a+b)); //Java20
		// "" --> is an empty string
		System.out.println("" + a + b); //1010
		//first step:
			// "" + 10 ---> 10 (String)
		//second step:
			//10 (String) + 10 ---> 1010
		//if there is not "" in front
		System.out.println(a + b); //20
		
		
		//int + int + String + String --> String				
		System.out.println(a + b + x + y);//20JavaTuesday
		
		//first part: 
			// a + b (both are int) --> 20
			// a + b + x --> 20 + x --> 20Java
			//20Java + y --> 20JavaTuesday
		
		System.out.println(x + y + a * b);//JavaTuesday100
		System.out.println(x + y + a + b);//JavaTuesday1010
	
		//Compilation Error
		//System.out.println(y * b); //Tuesday*10
		
		
		//String + int ---> String
		//int + String ---> String
		//int + int ---> int
		//String * int --> not allowed
		
		//int + int + int + int + String ---> String
		//String + int + int + int + int ---> String 
			//the only difference will be the the result of the ints
		
		
		
		String emptyStr = ""; //It is a String, but it is empty
		String spaceStr = " "; //It is a String, but it only has a space, NOT empty
		
	}

}
