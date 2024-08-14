package threadMethods.com;

public class DaemonThreadMethod extends Thread 
{
	public void run() 
	{
		System.out.println("Run method is running");
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("It is a daemon: ");
		}
		else
		{
			System.out.println("It is not daemon: ");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Main completed");
		DaemonThreadMethod d  = new DaemonThreadMethod();
		d.setDaemon(true);
		d.start();
	}
}
