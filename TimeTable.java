package Java;

import java.util.Scanner;

class sc2
{
	public void Switch(String s)
	{
		switch(s)
		{
			case "Monday":
			{
				System.out.print("Monday: 1.DBMS 2.OOC");
				break;
			}
			case "Tuesday":
			{
				System.out.print("Tuesday: 1.DAST 2.OOL");
				break;
			}
			case "Wednesday":
			{
				System.out.print("Wednesday: 1.AM 2.DS");
				break;
			}
			case "Thursday":
			{
				System.out.print("Thursday: 1.OOC 2. AM");
				break;
			}
			case "Friday":
			{
				System.out.print("Friday: 1.DS 2. DAST");
				break;
			}
			case "Saturday":
			{
				System.out.print("Saturday: 1.DBMS");
				break;
			}
			default:
			{
				System.out.print("Enter a valid entry");
				break;
			}
		}
	}
}

public class TimeTable 
{
	public static void main(String args[])
	{
		System.out.print("Enter day: ");
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		sc2 s1=new sc2();
		s1.Switch(s);
		
		sc.close();
	}
}