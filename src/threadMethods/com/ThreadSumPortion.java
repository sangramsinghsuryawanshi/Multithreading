package threadMethods.com;

public class ThreadSumPortion extends Thread 
{
	static int a[];
	static int sum;
	public ThreadSumPortion(int a[],int sum) 
	{
		this.a=a;
		this.sum=sum;
	}
	public void run()
	{
		int sum=0;
		if(this.sum<=0)
		{
			for(int i=0;i<a.length/2;i++)
			{
				sum+=a[i];
			}
			System.out.println(Thread.currentThread().getName()+"---> "+sum);
		}
		else
		{
			for(int i=a.length/2;i<a.length;i++)
			{
				sum+=a[i];
			}
			System.out.println(Thread.currentThread().getName()+"---> "+sum);
		}
		this.sum+=sum;
	}
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6};
		int sum=0;
		ThreadSumPortion t1 = new ThreadSumPortion(a,sum);
		ThreadSumPortion t2 = new ThreadSumPortion(a,sum);
		try 
		{
			t1.start();
			t1.join();
			t2.start();
			t2.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("All Elements sum: "+ThreadSumPortion.sum);
	}
}
