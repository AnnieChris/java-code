package com.training.mars;

public class MyClass {
	
	static int age;
	public static void main(String args[]) {
		System.out.println("This is my First Java file");
		System.out.println("New Change");
		
		//Access Specifiers : public => anyone can use this	
		byte number = 12;
		
		System.out.println("Byte value is" +number);
		
		short shortValue = 48;
		
		int intValue = 89;
		
		byte newByte = (byte)intValue;	// Explicit typecasting
		
		int newInt = shortValue; // Impplicit typecasting
		
		//int charValue = 'A';
		int charValue = 'a';
		
		System.out.println("Character value is : "+charValue);
		
		//int age = 27;	//local variable needs to be intialised
		
		System.out.println("Age of the person is"+age);
		
		Person p1 = new Person();
		p1.setHeight(170);	//using setter method
		p1.setWeight(80);	//using setter method
		System.out.println(p1.getPersonInfo());	//displays the values using getter method
		
		Person p2 = new Person();
		p2.setHeight(180);
		p2.setWeight(75);
		System.out.println(p2.getPersonInfo());
		
		Person p3 = new Person(190, 95);
		System.out.println(p3.getPersonInfo());
		
	}
}


