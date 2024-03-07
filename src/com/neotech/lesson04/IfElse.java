package com.neotech.lesson04;

public class IfElse {

	public static void main(String[] args) {
		
		//Let us assume that Batu has so far 225$

		int batusAccount = 225;
		
		
		if (batusAccount > 500) 
		{
			System.out.println("Batu will buy gas!");
			System.out.println("Batu will go for dinner!");
		}
		
		System.out.println("------------------------");
		
		
		//You should practice Java 15 hours per week!
		
		//If you are practicing 15 or more, you will love it!
		//Otherwise, you will not!!
		
		int hours = 15;
		
		if (hours >= 15) //if hours are larger than or equal to 15
		{
			System.out.println("You will love Java!!!");
		}
		else //if hours are actually less than 15
		{
			System.out.println("You might find Java difficult!");
		} 
		
		System.out.println("We are done for today!!!");
		
		
	}

}
