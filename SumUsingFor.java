package Java;
class Sum
{
	public void sum()
	{
		int sum=0,i;
		for(i=0; i<=10; i++)
		{
			sum=sum+i;
		}
		System.out.print("Sum: "+sum);
	}
}
public class SumUsingFor 
{
	public static void main(String args[])
	{
		Sum su=new Sum();
		su.sum();
	}
}
