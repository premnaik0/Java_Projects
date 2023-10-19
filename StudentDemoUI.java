package Java;
import java.util.Scanner;

class StudentUI
{
	String name;
	int roll_no;
	String address;
	
	public void get(String n, int r, String a)
	{
		name=n;
		roll_no=r;
		address=a;
		
		System.out.print("\nName: "+ name +"\nRoll No.: "+ roll_no +"\nAddress: "+ address);
	}
}

public class StudentDemoUI 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter name, roll no. and address: ");
		
		String n=sc.next();
		int r=sc.nextInt();
		String a=sc.next();
		
		StudentUI s1=new StudentUI();
		s1.get(n,r,a);
		
		sc.close();
		
	}
}