package com.neotech.lesson02;

public class VariableDeclaration {

	public static void main(String[] args) {

	//Data Type    name/identifier   operator (=)		value
		
	//1st way:
	int number1 = 5; //declaring a new variable and assigning a value
	
	//2nd way: 
		//Java allows us to declare but not initialize right away
	int number2; //declaration - I want to create an identifier, but I dont have a value yet
	number2 = 10; //assigning a value
	

	char var1, var2, var3; //declaring multiple variable of the same type
	//exactly the statement as below:
	/*
	 * char var1; 
	 * char var2; 
	 * char var3;
	 */
	
	var1 = '@';
	var2 = '#';
	var3 = '&';
	
	System.out.println(number2);
	System.out.println(var1);
	
	
	//value reassignment
	
	System.out.println(number1); //this will print the current value so far (5)
	
	number1 = 55; //this is value reassignment. 
				 // From now on, I want java to know that number1 means 55
	
	System.out.println(number1); //this will print the new value of number1
	
	
	//lets check the value again
	System.out.println(number1);
	
	
	//can I reassign the number1 this way:
	
	//number1 = "Atif";	
	//We cannot do that!! We told Java that number1 is an int, so we have to put int values on it.
	
	
	//we can still change it again
	
	number1 = 150;
	
	
	System.out.println(number1);
	
	
	
	}

}
