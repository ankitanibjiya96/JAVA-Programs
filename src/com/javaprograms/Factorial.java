package com.javaprograms;

import java.util.Scanner;

public class Factorial {
	
public static void main(String[] args) {
	FindFactorial();
}

static void FindFactorial()
{
	int n, fact = 1; //initialize fact as 1
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Number: "); //Input of number to find factorial of
	n = s.nextInt();
	for(int i=1; i<=n; i++) //for loop for iterating from 1 to n
	{
		fact = fact*i;  //logic to find factorial
	}
	System.out.println("The factorial of the number " + n + " is: " + fact);	
}
}
