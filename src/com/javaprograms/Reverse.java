package com.javaprograms;

import java.util.Scanner;

public class Reverse {
	
public static void main(String[] args) {
	int ch;
	System.out.println("1.Reverse a String\n2.Reverse a Number");
	System.out.println("Enter Choice:");
	Scanner s =  new Scanner(System.in);
	ch = s.nextInt();
	switch(ch)
	{
	case 1: ReverseString();
			break;
	
	case 2: ReverseNumber();
			break;
	
	default: System.out.println("Invalid Choice");
	}			
}

static void ReverseString()
{
	String str , rstr= " ";
	Scanner s = new Scanner(System.in);
	System.out.println("Enter String: ");  //Take value from user
	str = s.next();
	char ch;
	for(int i=0; i< str.length(); i++) //for loop for iterating till the string length
	{
		ch = str.charAt(i);  //to get the value at ith index
		rstr = ch + rstr;	 //logic for reversing string
	}
	System.out.println("Reverse String is: " + rstr);
}
static void ReverseNumber()
{
	int n, rev=0, rem; 
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Number:");
	n = s.nextInt();
	while(n>0)
	{
		rem = n%10;  //to get last digit of number
		rev = rev*10+rem; //for getting reverse value
		n= n/10; //to eliminate last digit from n
	}
	System.out.println("Reverse Number is: " + rev);
}
}
