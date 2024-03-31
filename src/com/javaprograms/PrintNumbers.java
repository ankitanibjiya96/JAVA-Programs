package com.javaprograms;

public class PrintNumbers {

public static void main(String[] args) {
	//PrintNumbersForLoop();
	//PrintNumbersWhileLoop();
	PrintNumbersDoWhileLoop();
}

static void PrintNumbersForLoop()
{
	for(int i=1; i<=50; i++) //for loop for iterating from 1 to 50
	{
		if(i%3 == 0 && i%4 == 0) //number should be divisible by 3 and 4
		{
			System.out.print(i + " ");
		}
	}
}

static void PrintNumbersWhileLoop()
{
	int i=1; //initialization for while loop
	while(i<=50) //while loop for iterating from 1 to 50
	{
		if(i%3 == 0 && i%4 ==0) //checking divisibility with 3 and 4
		{
			System.out.print(i + " "); 
		}
		i++; //incrementing by 1 to go to next number
	}
}

static void PrintNumbersDoWhileLoop()
{
	int i=1; //initialization for do while loop
	do {
		if(i%3 == 0 && i%4 == 0) // checking divisibility with 3 and 4
		{
			System.out.print(i + " ");
		}
		i++;
	}while(i<=50); //while condition for iterating from 1 to 50
}
}
