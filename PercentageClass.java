package Java;

import java.util.Scanner;

class Per
{
	public void Percentage1(double p)
	{
		if((p<=100) & (p>=70))
		{
			System.out.println("Distingsion");
		}
		else if((p<70) & (p>=60))
		{
			System.out.println("First class");
		}
		else if((p<60) & (p>=50))
		{
			System.out.println("Second class");
		}
		else if((p<50) & (p>=40))
		{
			System.out.println("Pass class");
		}
		else if((p<40) & (p>=0))
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Enter a valid percentage");
		}
	}
	
}

public class PercentageClass 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double p=sc.nextDouble();
		
		Per pe=new Per();
		pe.Percentage1(p);
		sc.close();
	}
}
