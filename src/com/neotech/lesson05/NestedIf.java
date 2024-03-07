package com.neotech.lesson05;

public class NestedIf {
	
	//if it is morning --> say good morning    			<-- outer if
		//if is a school day --> you are at school   <-- inner if 
		//else you at home							<-- inner else
	//else (not morning) --> good afternoon				<-- outer else
	
	public static void main(String[] args) {
		boolean isMorning = false;
		boolean isSchoolDay = false;
		
		if(isMorning) {
			System.out.println("Good morning");
			if(isSchoolDay) {
				System.out.println("You are at school");
			}
			else {
				System.out.println("You are at home");
			}
		}
		else {
			System.out.println("Good afternoon");
		}

	}

}
