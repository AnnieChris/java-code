package com.training.mars;

public class NumberPattern {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		pattern();
		patternnew();
		
	}
		//1
		//1	2
		//1	2	3
		private static void pattern() 
		{
			for(int i = 1; i<=3; i++) 
			{
				for(int j = 1; j<=i; j++) 
				{
					System.out.print(j);
				}
				System.out.println();
			}
		

		}
		//1
		//2	3
		//4	5	6
		private static void patternnew() 
		{
			int x=1;
			for(int i = 1; i<=3; i++) 
			{
				for(int j = 1; j<=i; j++) 
				{
					System.out.print(x);
					x++;
				}
				System.out.println();
			}
		

		}

}
