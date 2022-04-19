package com.training.mars;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of Array");
		int count = scanner.nextInt();
		int[] numbers = new int[count];
		System.out.println("Enter " + count + " values in the Array");
		for (int i = 0; i < count; i++) {
			numbers[i] = scanner.nextInt();

		}
		Arrays.sort(numbers);
		System.out.print("Numbers in Ascending Order:");
		for (int i = 0; i < count; i++) {
			System.out.print(String.valueOf(numbers[i]) + ((i!=(count-1))?",":""));
		}
	}
}