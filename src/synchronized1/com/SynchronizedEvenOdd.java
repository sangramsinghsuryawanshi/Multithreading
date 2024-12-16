package synchronized1.com;
class EvenOdd
{
	int cnt=0;
	public synchronized void iss(int a[])
	{
		if(cnt<=0)
		{
			System.out.println(Thread.currentThread().getName()+":Even:");
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
			System.out.println("\n"+Thread.currentThread().getName()+":Odd:");
			for(int i=0;i<a.length;i++)
			{
				if(a[i]%2!=0)
				{
					System.out.print(a[i]+" ");
				}
			}
		}
	}
}
public class SynchronizedEvenOdd extends Thread
{
	static EvenOdd ed;
	int a[];
	public void run()
	{
		ed.iss(a);
	}
	public static void main(String[] args) 
	{
		ed = new EvenOdd();
		SynchronizedEvenOdd s1 = new SynchronizedEvenOdd();
		SynchronizedEvenOdd s2 = new SynchronizedEvenOdd();
		s1.a =new int[]{1,2,3,4,5};
		s2.a =new int[]{1,2,3,4,5};
		s1.start();
		s2.start();
	}
}
