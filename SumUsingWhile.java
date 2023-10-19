package Java;
class sum1
{
	public void Sum()
	{
		int sum=0,i=1;
		while(i<=10)
		{
			sum=sum+i;
			i++;
		}
		System.out.print("Sum: "+sum);
	}
}
public class SumUsingWhile 
{
	public static void main(String args[])
	{
		Sum su=new Sum();
		su.sum();
	}
}
