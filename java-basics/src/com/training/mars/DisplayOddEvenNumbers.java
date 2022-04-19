package com.training.mars;

public class DisplayOddEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] odd = new int[5];
		System.out.println("odd numbers are: ");
		for(int i=0;i<odd.length;i++) {
			odd[i] = 2*i+1;
		}
		for(int i=0;i<odd.length;i++) {
			System.out.println(odd[i]);
	}
		
		int[] even = new int[5];
		System.out.println("Even numbers are: ");
		for(int i=0;i<even.length;i++) {
			even[i] = 2*i+2;
		}
		for(int i=0;i<even.length;i++) {
			System.out.println(even[i]);
	}
	}

}
