package Java;

class operator
{
	public void AO(int a, int b)
	{
		System.out.println("Arithmatic: ");
		System.out.println("a+b: "+(a+b));
		System.out.println("a-b: "+(a-b));
		System.out.println("a*b: "+(a*b));
		System.out.println("a/b: "+(a/b));
		System.out.println("a%b: "+(a%b));
		System.out.println("\n");
	}
	public void RO(int a, int b)
	{
		System.out.println("Relational: ");
		System.out.println("a<b: "+(a<b));
		System.out.println("a>b: "+(a>b));
		System.out.println("a<=b: "+(a<=b));
		System.out.println("a>=b: "+(a>=b));
		System.out.println("a==b: "+(a==b));
		System.out.println("a!=b: "+(a!=b));
		System.out.println("\n");
	}
	public void Bool(boolean a, boolean b)
	{
		System.out.println("Boolean: ");
		System.out.println("a&b: "+(a&b));
		System.out.println("a|b: "+(a|b));
		System.out.println("!a: "+(!a));
		System.out.println("a^b: "+(a^b));
		System.out.println("\n");
	}
	public void Inc(int a, int b)
	{
		System.out.println("Increment: ");
		int x=a++;
		System.out.println("X: "+x);
		System.out.println("A: "+a);
		
		int y=++b;
		System.out.println("Y: "+y);
		System.out.println("B: "+b);
		System.out.println("\n");
	}
	public void Dec(int a, int b)
	{
		System.out.println("Decrement: ");
		int x=a--;
		System.out.println("X: "+x);
		System.out.println("A: "+a);
		
		int y=--b;
		System.out.println("Y: "+y);
		System.out.println("B: "+b);
		System.out.println("\n");
	}
}

public class OperatorDemo 
{
	public static void main(String args[])
	{
		operator o1=new operator();
		o1.AO(10,20);
		o1.RO(10,20);
		o1.Bool(true,false);
		o1.Inc(1,3);
		o1.Dec(10,5);
	}
}
