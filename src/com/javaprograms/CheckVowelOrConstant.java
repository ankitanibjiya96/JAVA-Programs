package com.javaprograms;

import java.util.Scanner;

public class CheckVowelOrConstant {
	
public static void main(String[] args) {
		CheckVowel();
}

static void CheckVowel()
{
	char c; //local variable of type char
	Scanner s = new Scanner(System.in); //For taking input from user
	System.out.println("Enter alphabet: ");
	c = s.next().charAt(0); //returns the value at index number 0 from string
	if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') //if character is any of the given values
		System.out.println(c + " is a Vowel");
	else
		System.out.println(c + " is a Constant");
}
}
