package com.training.mars;

import java.util.Scanner;

public class BasicsDemo {

	public static void main(String[] args) {
		
		/*
		 * Scanner scanner = new Scanner(System.in); pattern();
		 * 
		 * guess(scanner); System.out.println("Enter age : "); int age =
		 * scanner.nextInt(); //take input from the user by using nextInt() method
		 * 
		 * //int age = 21;
		 * 
		 * if(age < 18) { System.out.println("Not eligible to vote"); } else {
		 * System.out.println("Eligible to vote"); } scanner.close();
		 */
	}
	private static void pattern()
	{
		for(int i = 1;i<=3; i++)
		{
			for(int j = 1;j<=3; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

	/*
	 * private static void guess(Scanner scanner) {
	 * System.out.println("Enter number"); int number = scanner.nextInt(); if(number
	 * == 5) { System.out.println("you guess it right"); } else {
	 * System.out.println("Better luck next time"); } }
	 */
}
