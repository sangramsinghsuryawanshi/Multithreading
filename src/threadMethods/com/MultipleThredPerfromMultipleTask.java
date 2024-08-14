package threadMethods.com;
class FirstThread extends Thread
{
	public void run() 
	{
		int n=10;
		System.out.println("Even number first thread: ");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i+" running "+currentThread().getId());
			}
		}
	}
}
class SecondThread extends Thread
{
	public void run() 
	{
		int n=10;
		System.out.println("Odd number second thread: ");
		for(int i=1;i<=n;i++)
		{
			if(n%i!=0)
			{
				System.out.println(i+" running "+currentThread().getId());
			}
		}
	}
}
public class MultipleThredPerfromMultipleTask extends Thread
{
	public void run() 
	{
		int n=7,c=0;
		System.out.println("check given number is prime or not third thread: ");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.println(n+" is prime number: running "+currentThread().getId());
		}
		else
		{
			System.out.println(n+" is not prime number");
		}
	}
	public static void main(String[] args) 
	{
		FirstThread f = new FirstThread();
		try {
			f.start();
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		SecondThread s = new SecondThread();
		try {
			s.start();
			Thread.sleep(100);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		MultipleThredPerfromMultipleTask m = new MultipleThredPerfromMultipleTask();
		try {
			m.start();
			Thread.sleep(10);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
