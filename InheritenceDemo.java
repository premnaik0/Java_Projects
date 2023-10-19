package Java;

class EmployeeID
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
class PerEmployee extends EmployeeID
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

public class InheritenceDemo 
{
	public static void main(String args[])
	{
		EmployeeID obj=new EmployeeID();
		obj.set(10, "abc", "xyz");
		obj.get();
		//obj.calculate(40000); ERROR AS PARENT OBJECT CANNOT ACCESS CHILD'S METHOD
		
		PerEmployee emp=new PerEmployee();
		emp.set(1, "Prem", "Merp");
		emp.get();
		emp.calculate(40000);
	}
}
