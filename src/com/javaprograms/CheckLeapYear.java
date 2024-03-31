package com.javaprograms;

import java.util.Scanner;

public class CheckLeapYear {
	
public static void main(String[] args) {
	LeapYear();	
}
static void LeapYear()
{
	int y; //local variable of type integer
	Scanner s = new Scanner(System.in); //For taking input from user
	System.out.println("Enter year: ");
	y = s.nextInt();
	/* 1st condition: If it is not a century year and a leap year then it has to
	 be divisible by 4 and not divisible by 100 */
	/* 2nd condition: If it is century year then it has to be divisible by 400 */
	if((y%4 == 0 && y%100!= 0) || y%400 == 0 )
		System.out.println(y + " is a leap year");
	else
		System.out.println(y + " is not a leap year");
}
}
