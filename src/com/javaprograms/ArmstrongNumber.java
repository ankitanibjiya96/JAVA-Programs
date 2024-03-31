package com.javaprograms;

import java.util.Scanner;

public class ArmstrongNumber {
	
public static void main(String[] args) {
		CheckArmstrong();
	}
static void CheckArmstrong()
{
	int n, i;
	double armstrong = 0;
	double temp; 
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Number:");
	n = s.nextInt();
	i = n;  //Initialize i with value n taken from user
	while(n>0)
	{
		temp = n%10;  //to get last digit of number n
		temp = Math.pow(temp, 3); //to find cube of last digit stored in temp
		armstrong = armstrong + temp; //addition of cubes of all digits for a given number
		n= n/10; //to eliminate last digit from n
	}
	if(armstrong == i)  //comparing armstrong number with original number
		System.out.println("Number is Armstrong Number");
	else
		System.out.println("Number is not a Armstrong Number");
}
}
