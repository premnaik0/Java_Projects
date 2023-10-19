package Java;

public class ScopeDemo 
{
	public static void main(String args[])
	{
		int a=10;
		System.out.println("Value of a: "+a);
		
		{
			System.out.println("Value of a: "+a);
			int b=20;
			System.out.println("Value of b: "+b);
		}
		System.out.println("Value of a: "+ a);
		//System.out.println("Value of b: "+b); ERROR BECAUSE OUT OF SCOPE
	}
}
