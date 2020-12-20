package com.sahana.Primenumbers;

public class PrimeNumbers {
	public static void main(String args)
	{
		int number=5;
		int count=0;
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
	}

}
