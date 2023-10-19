package Java;

public class TypeCasting 
{
	public static void main(String args[])
	{
		int i;
		float f;
		double d;
		
		i=10;
		System.out.println("Integer value of i: "+i);
		
		f=i; //Auto type convert
		System.out.println("Integer value of f: "+f);
		
		d=22.5946371865;
		System.out.println("Integer value of d: "+d);
		
		//f=d; Cannot be done because of memory allocation size
		
		f=(float)d;
		System.out.println("Integer value of f: "+f);
	}
}
