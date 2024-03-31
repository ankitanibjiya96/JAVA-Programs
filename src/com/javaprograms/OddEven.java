package com.javaprograms;

import java.util.Scanner;

public class OddEven {
	
public static void main(String[] args) {
	
	OddEvenNumber(); //calling the method
	}

static void OddEvenNumber()
{
	int n; //local variable of type integer
	Scanner s = new Scanner(System.in); //for taking input from user we use scanner class
	System.out.println("Enter number: ");
	n = s.nextInt(); //used to scan, read and parse next token of input as int
	if(n%2 == 0) //if number is divisible by 2 and remainder is 0 it is even
		System.out.println("The number " + n + " is an even number");
	else
		System.out.println("The number " + n + " is an odd number");
}
}
