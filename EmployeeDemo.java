package Java;

class employee
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
public class EmployeeDemo 
{
	public static void main(String args[])
	{
		employee e1=new employee();
		e1.set("Prem", "Panaji", 1, "Sales", 20000.0);
		
		employee e2=new employee();
		e2.set("Ramesh", "Mapusa", 2, "Manager", 50000.0);
		
		e1.get();
		e2.get();
	}

}
