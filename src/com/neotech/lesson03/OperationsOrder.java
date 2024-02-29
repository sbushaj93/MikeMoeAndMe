package com.neotech.lesson03;

public class OperationsOrder {

	public static void main(String[] args) {
		// PEMDAS - Parenthesis, Exp, Mul, Div, Add, Sub
		
		int num1, num2, num3;
		
		num1 = 10 + 10 * 2; //-> 1) 10*2=20 ->2) 10+20=30
		System.out.println(num1);
		
		num2 = (10 + 10) * 2;
		System.out.println(num2);
		
		num3 = 2 * 5 + 20 / 5 - 3; // 2*5=10, next 20/5=4, next 10+4=14, next 14-3=11
		System.out.println(num3);
	}

}
