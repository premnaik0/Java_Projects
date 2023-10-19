package Java;

class Polymorphism
{
	public void display(String name)
	{
		System.out.println(name);
	}
	
	public void display(int roll_no, int age )
	{
		System.out.println(roll_no +"\t"+ age);
	}
	public void display(double per)
	{
		System.out.println( per);
	}
}

public class PolymorphismDemo 
{
	public static void main(String args[])
	{
		Polymorphism p1=new Polymorphism();
		p1.display("Prem");
		p1.display(21,21);
		p1.display(75.00);
	}
}
