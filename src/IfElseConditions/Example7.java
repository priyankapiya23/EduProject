package IfElseConditions;

import java.util.Scanner;

public class Example7 
{

	//Nested if-else statement
	public static void main(String[] args) 
	{
		
		/**
		 *  Write a java program to find the given number is positive or negative,
		 *  if the number is positive then verify that number is even or odd. 				
		 */
		
		int number;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any number(except zero(0)): ");
		number = scanner.nextInt();
		
		//outer if-else
		if(number > 0)
		{
			
			//inner if-else
			if(number%2 == 0)
			{
				System.out.println("the number is an even.");
			}
			else
			{
				System.out.println("the number is an odd.");
			}
			
		}
		else
		{
			System.out.println("the number is negative.");
		}
		
		scanner.close();

	}

}
