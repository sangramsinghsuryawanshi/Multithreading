package synchronized1.com;

public class DeadLock 
{
	public static void main(String[] args) throws InterruptedException
	{
		String s="abc";
		String s1="xyz";
		Thread t = new Thread()
		{
			public void run()
			{
				synchronized(s)
				{
					System.out.println("Thread 1 aquires resource 1..");
				}
				try 
				{
					System.out.println("Wating for resource 2..");
					Thread.sleep(2000);
				} 
				catch (Exception e) 
				{
					System.out.println(e);
				}
				synchronized(s1)
				{
					System.out.println("Thread 1 aquires resource 2..");
				}
			}
		};
		Thread t1 = new Thread()
		{
			public void run()
			{
				synchronized(s1)
				{
					System.out.println("Thread 2 aquires resource 1..");
				}
				try 
				{
					System.out.println("Wating for resource 2..");
					Thread.sleep(2000);
				} 
				catch (Exception e) 
				{
					System.out.println(e);
				}
				synchronized(s)
				{
					System.out.println("Thread 2 aquires resource 2..");
				}
			}
		};
		t.start();
		t1.start();
	}
}
