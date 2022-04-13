package com.training.mars;

import java.util.Scanner;

public class GuessMyLuckyNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		guess(scanner);
		scanner.close();
	}
	//Guess my lucky number
		//1. take input from the user
		//2. if it matches with your lucky number then print “you guesses it right!!”
		//3. else print “Better luck next time”
		private static void guess(Scanner scanner) {
			System.out.println("Enter number");
			int number = scanner.nextInt();
			if(number == 5) {
				System.out.println("you guess it right");
			}
			else
			{
				System.out.println("Better luck next time");
			}
		}


}
