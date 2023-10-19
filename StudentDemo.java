package Java;
class Student
{
	String name;
	int roll_no;
	String address;
	
	public void set(String n, int r, String a)
	{
		name=n;
		roll_no=r;
		address=a;
	}
	public void get()
	{
		System.out.print("\nName: "+ name +"\nRoll no.: "+ roll_no +"\nAddress: "+ address);
	}
}
public class StudentDemo 
{
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.set("Prem", 21, "Goa");
		s1.get();
	}
}
