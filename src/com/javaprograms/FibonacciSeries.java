package com.javaprograms;

import java.util.Scanner;

public class FibonacciSeries {
	
public static void main(String[] args) {
		Fibonnaci();
	}
static void Fibonnaci()
{
	int n, first = 1, sec = 1, third; //initialize first and second digit of fibonacci series to 1
	Scanner s = new Scanner(System.in);
	System.out.println("Enter n: "); //Input the range of n
	n = s.nextInt();
	System.out.print(first + " "); //print 1st digit
	System.out.print(sec + " "); //print 2nd digit
	for(int i=3; i<=n; i++) //Start from 3rd digit to n 
	{
		third = first + sec; //logic to print third number
		first = sec; //make second number as 1st number
		sec = third; //make third as second number
		System.out.print(third + " ");
	}
	

}
}
