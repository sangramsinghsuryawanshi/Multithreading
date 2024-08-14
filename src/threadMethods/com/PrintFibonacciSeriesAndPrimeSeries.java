package threadMethods.com;
class FibonacciSeries extends Thread
{
	int a;
	int b;
	FibonacciSeries(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void run()
	{
		int n=1,n1=10,a=0,b=1,sum=0;
		System.out.print("\nfibonacii series: ");
		for(int i=this.a;i<=this.b;i++)
		{
			System.out.print(a+" ");
			sum=a+b;
			a=b;
			b=sum;
		}
	}
}
class PrimeSeries1 extends Thread
{
	public void run()
	{
		int n=1,n1=50;
		System.out.print("\nprime series: ");
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
				System.out.print(i+" ");
			}
		}
	}
}
public class PrintFibonacciSeriesAndPrimeSeries 
{

	public static void main(String[] args) 
	{
		int a=1,b=10;
		FibonacciSeries f = new FibonacciSeries(a,b);
		PrimeSeries1 p = new PrimeSeries1();
		try 
		{
			f.start();
			f.join();
			p.start();
			p.join();
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}

}
