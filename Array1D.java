package Java;

class array
{
	public void get()
	{
		int[] Age= {12,4,5,2,5};
		for(int i=0; i<=Age.length-1;i++)
		{
			System.out.println(Age[i]);
		}
	}
}

public class Array1D
{
	public static void main(String args[])
	{
		array a1= new array();
		a1.get();
	}
}