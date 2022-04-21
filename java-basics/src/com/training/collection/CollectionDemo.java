package com.training.collection;

import java.util.HashSet;
//import java.util.Set;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionDemo 
{

	public static void main(String[] args) 
	{
		
		//Set<Integer> values = new HashSet<>();	//Generic Integer for all integers values
		
		/*List<Integer> values = new ArrayList<>();		
		values.add(2);
		values.add(6);
		values.add(8);
		values.add(3);
		values.add(2);*/
		
		/*List<String> names = new ArrayList<>();		
		names.add("Peter");
		names.add("John");
		names.add("Mike");*/
		
		Student stud1 = new Student("Sara", 12, "B");
		Student stud2 = new Student("Alice", 11, "A");
		Student stud3 = new Student("Julie", 10, "C");
		Student stud4 = new Student("Jeni", 9, "B");
		Student stud5 = new Student("Sara", 12, "B");
		
		Set<Student> studentSet = new HashSet<>();
		
		/*Set<String>names = new TreeSet<>();
		
		names.add("Zak");
		names.add("Gen");
		names.add("Zak");*/
		
				
		
		studentSet.add(stud1);
		studentSet.add(stud2);
		studentSet.add(stud3);
		studentSet.add(stud4);
		studentSet.add(stud5);
		
		for(Student student : studentSet) 
		{
		System.out.println(student.getName());
		}
//-------------------------------------------------------		
		Map<String, Student>studentMap = new HashMap<>();
		
		studentMap.put(1,stud1) studentMap = ;
		
		List<Student> studentList = new ArrayList<>();		
		studentList.add(stud1);
		studentList.add(stud2);
		studentList.add(stud3);
		studentList.add(stud4);
//-------------------------------------------------------------		
		
		/*for(int num : values) 
		{
			System.out.println(num);
		}*/
		/*for(int num : names)
		{
			System.out.println(name);
		}*/
		
//------------------------------------------------------		
		
		
		/*List<Student> studentList = new ArrayList<>();		
		studentList.add(stud1);
		studentList.add(stud2);
		studentList.add(stud3);
		studentList.add(stud4);
		for(Student student : studentList) 
		{
		System.out.println(student.getName());
		}*/
		
//----------------------------------------------------		
		
		List<Student> studentSet = new ArrayList<>();		
		studentSet.add(stud1);
		studentSet.add(stud2);
		studentSet.add(stud3);
		studentSet.add(stud4);
		//studentSet.add(stud5);
		System.out.println("------------------");
		Collections.sort(studentSet, new NameComparator());
		for(Student student : studentSet) 
		{
		System.out.println("Name " + student.getName() + "Roll no"+ student.getRollNo());
		}
		
		
		
	

	}

}
