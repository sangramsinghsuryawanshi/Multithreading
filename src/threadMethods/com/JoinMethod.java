package threadMethods.com;
class PrimeSeries extends Thread
{
	public void run() 
	{
		int n=1,n1=50;
		System.out.println("Prime series: ");
		for(int i=n;i<=n1;i++)
		{
			int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println(i);
			}
		}
	}
}
public class JoinMethod extends Thread
{
	public void run() 
	{
		int n=1,n1=100;
		System.out.println("Palindrome series:");
		for(int i=n;i<=n1;i++)
		{
			int rem=0,rev=0;
			for(int j=i;j!=0;j=j/10)
			{
				rem=j%10;
				rev=(rev*10)+rem;
			}
			if(rev==i)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) 
	{
		PrimeSeries p = new PrimeSeries();
		JoinMethod j = new JoinMethod();
		try 
		{
			p.start();
			p.join();
			
			j.start();
			j.join();
		} catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}
