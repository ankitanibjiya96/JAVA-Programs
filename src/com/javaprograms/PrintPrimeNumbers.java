package com.javaprograms;

public class PrintPrimeNumbers {
	
public static void main(String[] args) {
		//PrimeNumbersForLoop();
		//PrimeNumbersWhileLoop();
		PrimeNumbersDoWhileLoop();
}

static void PrimeNumbersForLoop()
{
	int count; //declaring local variable
	for(int i=1; i<=100; i++) //for loop for looping till 100th number
	{
		count=0; //initially count is set to 0
		for(int j=1; j<=i; j++) //for loop for checking numbers between 1 to 100
		{
			if(i%j == 0) //checking divisibilty
				count++; //if divisible increment by 1
		}
		if(count == 2) //prime numbers can be divided by 1 and itself
		{
			System.out.print(i + " ");
		}
	}
}
static void PrimeNumbersWhileLoop()
{
	int count;//declaring local variable
	int i=1;
	while(i<=100)//while loop for looping till 100th number
	{
		count=0; //initially count is set to 0
		int j=1;
		while(j<=i) //while loop for checking numbers between 1 to 100
		{
			if(i%j == 0) //checking divisibilty
			{ 
				count++; //if divisible increment by 1
		    }
			j++; //increment j by 1
		}
		if(count == 2) //prime numbers can be divided by 1 and itself
		{
			System.out.print(i + " ");
		}
		i++; //increment i by 1
	}
}

static void PrimeNumbersDoWhileLoop()
{
	int count;//declaring local variable
	int i=1;
	do{
		count=0; //initially count is set to 0
		for(int j=1; j<=i; j++) //for loop for checking numbers between 1 to 100
		{
			if(i%j == 0) //checking divisibilty
				count++; //if divisible increment by 1
		}
		if(count == 2) //prime numbers can be divided by 1 and itself
		{
			System.out.print(i + " ");
		}
		i++;
	}while(i<=100);//while loop for looping till 100th number
}
}
