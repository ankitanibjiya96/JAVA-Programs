package com.javaprograms;

public class PrimeNumbersInReverseOrder {
	
public static void main(String[] args) {
	//PrimeNumbersReverseForLoop();
	//PrimeNumbersReverseDoWhileLoop();
	PrimeNumbersReverseWhileLoop();
	
}
static void PrimeNumbersReverseForLoop()
{
	int count; //declaring local variable
	for(int i=100; i>=1; i--) //for loop for looping till 100th number
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
static void PrimeNumbersReverseWhileLoop()
{
	int count;//declaring local variable
	int i=100;
	while(i>=1)//while loop for looping till 1st number
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
		i--; //increment i by 1
	}
}

static void PrimeNumbersReverseDoWhileLoop()
{
	int count;//declaring local variable
	int i=100;
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
		i--;
	}while(i>=1);//while loop for looping till 1st number
}

}
