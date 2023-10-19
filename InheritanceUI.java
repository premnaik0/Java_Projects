package Java;

import java.util.Scanner;

class Employee1
{
	int ID;
	String name;
	String address;
	
	public void set(int i, String n, String a)
	{
		ID=i;
		name=n;
		address=a;
	}
	public void get()
	{
		System.out.print("Name: "+ name +"\nAddress: "+ address +"\nID: "+ ID);
	}
}
class PerEmployeeID extends EmployeeDemo
{
	double salary;
	
	public void calculate(double basic)
	{
		double da= 0.5* basic;
		double hra= 0.5*(basic +da);
		salary=basic +da +hra;
		System.out.println("Salary: "+ salary);
	}
}
public class InheritanceUI
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter Name, Address and Id");
		
		String n=s1.next();
		String a=s1.next();
		int i=s1.nextInt();
		
		Employee1 e1=new Employee1();
		e1.set(i, n, a);
		e1.get();
		
		System.out.print("Enter basic salary: ");
		double s=s1.nextDouble();
		
		PerEmployeeID pe=new PerEmployeeID();
		pe.calculate(s);
		s1.close();
	}
}
