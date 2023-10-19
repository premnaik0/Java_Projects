package Java;

import java.util.Scanner;

class sc
{
	public void Switch(int s)
	{
		switch(s)
		{
			case 1:
			{
				System.out.print("Monday: 1.DBMS 2.OOC");
				break;
			}
			case 2:
			{
				System.out.print("Tuesday: 1.DAST 2.OOL");
				break;
			}
			case 3:
			{
				System.out.print("Wednesday: 1.AM 2.DS");
				break;
			}
			case 4:
			{
				System.out.print("Thursday: 1.OOC 2. AM");
				break;
			}
			case 5:
			{
				System.out.print("Friday: 1.DS 2. DAST");
				break;
			}
			case 6:
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

public class SwitchCaseDemo 
{
	public static void main(String args[])
	{
		System.out.print("Enter day: ");
		Scanner sc=new Scanner(System.in);
		
		int s=sc.nextInt();
		sc s1=new sc();
		s1.Switch(s);
		
		sc.close();
	}
}
