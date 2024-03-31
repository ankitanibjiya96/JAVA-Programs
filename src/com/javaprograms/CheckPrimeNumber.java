package com.javaprograms;

import java.util.Scanner;

public class CheckPrimeNumber {
	
public static void main(String[] args) {
	CheckPrime();	
}
static void CheckPrime()
{
	int n; //local variable of type integer
	Scanner s = new Scanner(System.in); //For taking input from user
	System.out.println("Enter number: ");
	n = s.nextInt();
	if(n <= 1)  //0 and 1 are not prime numbers
		System.out.println(n + " is not a prime number");
	else if(n == 2 || n == 3 || n == 5 || n == 7 || n == 11) //2,3,5,7,11 are prime numbers
		System.out.println(n + " is a prime number");
	//If number is divisible by any from following number i.e. 2,3,5,7,11 then it is not prime
	else if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0 || n % 11 == 0)
		System.out.println(n + " is not a prime number");
	else //else prime
		System.out.println(n + " is a prime number");
}
}
