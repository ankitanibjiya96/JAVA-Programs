package com.collectionprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenNumbers {
	
public static void main(String[] args) {
	EvenNumber();
}

static void EvenNumber()
{
	int EvenSum=0, count=1;
	Scanner s = new Scanner(System.in);
	System.out.println("How many values you want to enter:");
	int even = s.nextInt();
	boolean flag = false;
	List<Integer> list = new ArrayList<Integer>();
	do {
		if(count<=even)
		{
			System.out.println("Please enter number");
			int num = s.nextInt();
			list.add(num);
			count++;
		}else {
			System.out.println("Size is already full");
		}
			System.out.println("Do you want to continue?");
			String str = s.next();
			if(str.equalsIgnoreCase("y"))
			{
				flag = true;
			}else {
				flag = false;
			}
	}while(flag);
	//list  10 20 30 40
	for(int i : list) //i will contain the value at every location
	{
		if(i%2 == 0)
		{
			EvenSum = EvenSum + i;
		}
	}
	System.out.println("The sum of even numbers is: " + EvenSum);	
}
}
