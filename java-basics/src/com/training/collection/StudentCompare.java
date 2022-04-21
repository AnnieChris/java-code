package com.training.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class StudentCompare {

	public static void main(String[] args) {
		
		Student studentA = new Student ("Shalini", 14,"A");
		Student studentB = new Student ("Indhu", 18,"B");
		Student studentC = new Student ("Geeta", 16,"C");
		Student studentD = new Student ("Sharmi", 10,"D");
		Student studentE = new Student ("Geeta", 14,"E");
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(studentA);
		studentList.add(studentB);
		studentList.add(studentC);
		studentList.add(studentD);
		studentList.add(studentE);
		
		Collections.sort(studentList);
		System.out.println("------------");
		System.out.println("Sorted List");
		System.out.println("------------");
		//Prints all students in the sorted by Name since compareto() method compares Student name
		for(Student student:studentList) {
			System.out.println(student.getName());
		}

		//TreeSet ignores studentE as duplicate and sorts by name since compareto() method compares Student name
		TreeSet<Student> studentUniqueRoll = new TreeSet<Student>();
		studentUniqueRoll.add(studentA);
		studentUniqueRoll.add(studentB);
		studentUniqueRoll.add(studentC);
		studentUniqueRoll.add(studentD);
		studentUniqueRoll.add(studentE);

		System.out.println("------------");
		System.out.println("Sorted Set");
		System.out.println("------------");
		for(Student student:studentUniqueRoll) {
			System.out.println(student.getName());
		}

		System.out.println("------------");
		//Prints false since we are comparing by student name in equals()
		System.out.println(studentA.equals(studentB));
		System.out.println("------------");
		//Prints true since we are comparing by student name in equals()
		System.out.println(studentC.equals(studentE));
	}

}
