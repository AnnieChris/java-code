package com.training.inheritance;

public class Vehicle 
{
	public Vehicle()
	{
		System.out.println("Vehicle Constructor ");
	}

	String brakeType;
	
	int speed =150;
	
	String color = "white";
	
	String make = "Chevy";
	
	String model ="Impala";
	
	int yearOfManufacture = 1990;
	
	public int getTopSpeed() 
	{
		return 100;
	}

}
