package com.training.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String args[]) {
		
		List<Integer> numbers = Arrays.asList(2,3,5,7,9);	//Creating a list of numbers
		
		//Stream<Integer> numberStream = numbers.stream();	//Creating a stream on numbers collection
		
		//Stream<Integer> squareValue = numberStream.map(a->(a*a)	//call intermediate map method on numberStream
		
		List<Integer> updatedNumbers = squareValue.collect(Collectors.toList())	;
				
				
				
		
		List<Integer> newNumbers = numbers.stream().map(a->a*a).collect(Collectors.toList());
		
		List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());

		List<Integer> sortedSquaredNumbers = numbers.stream().map(a->a*a).sorted().collect(Collectors.toList());
		
		//List<Integer> eventList = numbers.stream().filter(x->(x%2==0))collect(Collectors.toList());
		
		numbers.stream().filter(x-> (x%2==0)).forEach(System.out::println); //method reference
		
		int sumEven = numbers.stream().filter(x->(x%2==0)).reduce(0,(ans,y) -> ans+y);
		
		System.out.println("Sum of even numbers is "+sumEven);
		
		System.out.println(newNumbers);
		
		System.out.println(sortedNumbers);
		
		System.out.println(sortedSquaredNumbers);
		
		//System.out.println(eventList);
	}

}
