package threadMethods.com;

public class InterruptMethod extends Thread
{
	public void run() 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("before alter: "+Thread.currentThread().isInterrupted());
			System.out.println(Thread.currentThread().interrupted());
			System.out.println(Thread.currentThread().isInterrupted());
			try 
			{
				System.out.println(i);
				Thread.currentThread().sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) 
	{
		InterruptMethod i = new InterruptMethod();
		i.start();
		i.interrupt();
	}
}
