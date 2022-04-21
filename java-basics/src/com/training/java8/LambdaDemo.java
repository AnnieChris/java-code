package com.training.java8;

public class LambdaDemo {

	public static void main(String[] args) {
		
		FuncInterface method = () -> System.out.println("Demostrating lambda expression");
		
		method.getValue();

	}

}
