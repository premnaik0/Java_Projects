package Java;

import java.util.Scanner;

class EmployeeUI
{
	String Name;
	String Address;
	int E_ID;
	String Department;
	Double Salary;
	
	public void set(String n, String a, int i, String d, Double s)
	{
		Name=n;
		Address=a;
		E_ID=i;
		Department=d;
		Salary=s;
	}
	
	public void get()
	{
		System.out.print("\nE_ID:"+ E_ID +"\nName: "+ Name +"\nAddress: "+ Address +"\nDepartment: "+ Department+"\nSalary: "+ Salary);
		System.out.print("\n");
	}
	
}
public class EmployeeDemoUI
{
	public static void main(String args[])
	{
		System.out.print("Enter Name , Address, E_ID, Department and Salary: ");
		Scanner s1=new Scanner(System.in);
		
		String n=s1.next();
		String a=s1.next();
		int i=s1.nextInt();
		String d=s1.next();
		Double s=s1.nextDouble();
		
		EmployeeUI e1=new EmployeeUI();
		e1.set(n, a, i, d, s);
		e1.get();
		s1.close();
	}
}