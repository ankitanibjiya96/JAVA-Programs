package com.javaprograms;

import java.util.Scanner;

public class Palindrome {
	
public static void main(String[] args) {
	
		int ch;
		System.out.println("1.Check if String is Palindrome\n2.Check if Number is Palindrome");
		System.out.println("Enter Choice:");
		Scanner s =  new Scanner(System.in);
		ch = s.nextInt();
		switch(ch)
		{
		case 1: PalindromeString();
				break;
		
		case 2: PalindromeNumber();
				break;
		
		default: System.out.println("Invalid Choice");
		}		
}

static void PalindromeString()
{
	String str;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter String: ");
	str = s.next();
	int i = 0, j = str.length()-1;  //length-1 since array index starts from 0
	while(i<j)
	{
		if(str.charAt(i)!= str.charAt(j))  //comparing indexes of string in forward and backward direction
			System.out.println("String is not a Palindrome");
		i++;
		j--;
	}
	System.out.println("String is a Palindrome");
}

static void PalindromeNumber()
{
	int n, rev=0, rem, i; 
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Number:");
	n = s.nextInt();
	i = n;  //Initialize i with value n taken from user
	while(n>0)
	{
		rem = n%10;  //to get last digit of number
		rev = rev*10+rem; //for getting reverse value
		n= n/10; //to eliminate last digit from n
	}
	if(rev == i)  //comparing reverse number with original number
		System.out.println("Number is Palindrome");
	else
		System.out.println("Number is not a Palindrome");
}
}
