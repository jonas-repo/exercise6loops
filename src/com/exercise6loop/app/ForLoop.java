package com.exercise6loop.app;

public class ForLoop {

	public static void main(String[] args) {
		//constants declaration
		
		//variable declaration
		
		//objects construction
		
		//create a series from 1 to 100
		for(int i=0; i<=100; i++)
		{
			System.out.println(i);
		}
		for(int i=100; i>=1; i--)
		{
			System.out.println(i);
		}		
		for(int i=0; i<=100; i+=2)
		{
			System.out.println(i);
		}
		
		System.out.println("Display odd numbers from 100 to 200");
		for(int i=100; i<200;i++)
		{
			if(i%2 == 0)
			{
				continue; //breaks the cycle and start from the beginning
			}
			System.out.println(i);
		}
		System.out.println("Display just the half of the numbers in the cycle");
		for(int i=100; i<200;i++)
		{
			if(i == 150)
			{
				break;
			}
			System.out.println(i);
		}
	}

}
