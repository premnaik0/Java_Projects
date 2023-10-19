package Java;

import java.util.Scanner;

class return1
{
	public int add(int a, int b)
	{
		return (a+b);
	}
	
	public int sub(int a, int b)
	{
		return (a-b);
	}
	
	public int mul(int a, int b)
	{
		return (a*b);
	}
	
	public int div(int a, int b)
	{
		return (a/b);
	}
	
	public int mod(int a, int b)
	{
		return (a%b);
	}
}

public class ReturnOperator 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a: ");
		int a=sc.nextInt();
		
		System.out.println("Enter value of b: ");
		int b=sc.nextInt();
		
		return1 r1=new return1();
		System.out.println(r1.add(a, b));
		System.out.println(r1.sub(a, b));
		System.out.println(r1.mul(a, b));
		System.out.println(r1.div(a, b));
		System.out.println(r1.mod(a, b));
		
		sc.close();
	}
}
