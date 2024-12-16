package threadMethods.com;

public class EvenOddThreadSeperation extends Thread 
{
	static int a[];
	static int cnt=0;
	public EvenOddThreadSeperation(int a[]) 
	{
			this.a=a;
	}
	public void run()
	{
		if(cnt<=0)
		{
			System.out.println(Thread.currentThread().getName()+"");
			for(int i=0;i<a.length;i++)
			{
				if(a[i]%2==0)
				{
					System.out.print(a[i]+" ");
				}
			}
			cnt++;
		}
		else
		{
			System.out.println("\n"+Thread.currentThread().getName()+"");
			for(int i=0;i<a.length;i++)
			{
				if(a[i]%2!=0)
				{
					System.out.print(a[i]+" ");
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		try
		{
			EvenOddThreadSeperation t1 = new EvenOddThreadSeperation(a);
			EvenOddThreadSeperation t2 = new EvenOddThreadSeperation(a);
			t1.start();
			t1.join();
			t2.start();
			t2.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
