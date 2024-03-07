package com.neotech.lesson04;

public class CompoundOperator {

	public static void main(String[] args) {
		
		//aka shorthand operator
		
		int num = 100; //store 100 in this container
		System.out.println(num);
		
//		num = 150; // this will only change the value of the num
		
		num = num + 150; // this means to the existing value of num, add 150
		System.out.println(num);
		
		
		//we can do that shorly:
		
		//this is the exact same operation
		//we cal lthis as compound/shorthand operator
		num += 50;	// num = num + 50  --> +=
		
		System.out.println(num);

		
		//num = num - 10 --> how can I do this with shorthand ops?
		
		num -= 10;
		
		System.out.println(num);
		
		//num = num / 5
		num /= 5;
		
		System.out.println(num);
		
		// num = num * 6
		
		num *= 6;
		System.out.println(num);

		//num = num % 5
		
		num %= 5;
		System.out.println(num);
		
	}

}
