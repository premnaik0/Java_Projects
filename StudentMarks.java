package Java;

import java.util.Scanner;

class Student2
{
	String name;
	int roll_no;
	double dbms;
	double ooc;
	double am;
	double total;
	double per;
	
	public void set(String n, int r, double d, double o, double a)
	{
		name=n;
		roll_no=r;
		dbms=d;
		ooc=o;
		am=a;
	}
	public void get()
	{
		System.out.println("Name:"+ name +"\nRoll no,: "+ roll_no +"\nMarks: \nDBMS: "+ dbms +"\nOOC: "+ ooc +"\nAM: "+ am);
	}
	public void cal()
	{
		total=dbms+ooc+am;
		if((dbms>=40)&(ooc>=40)&(am>=40))
		{
			System.out.println("You have passed all subjects");
		}
		else
		{
			System.out.println("You have failed in a subject");
		}
		per=total/300*100;
		
		System.out.println("Total: "+ total +"\nPercentage: "+ per);
	}
	void passorfail()
	{
		if(per>=40)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}

public class StudentMarks 
{
	public static void main(String args[])
	{
		System.out.println("Enetr name, roll no, and marks of DBMS, OOC and AM: ");
		Scanner sc=new Scanner(System.in);
		
		String n=sc.next();
		int r=sc.nextInt();
		double d=sc.nextDouble();
		double o=sc.nextDouble();
		double a=sc.nextDouble();
		
		Student2 st=new Student2();
		st.set(n,r,d,o,a);
		st.get();
		st.cal();
		st.passorfail();
		
		sc.close();
	}
}
