package synchronized1.com;

public class DeadLock1 
{
	public static void main(String[] args) 
	{
		String str="ABC";
		String str1="XYZ";
		Thread t = new Thread() {
			
			public void run()
			{
				synchronized (str) 
				{
					System.out.println("Thread 1 aquire resources 1..!");
				
					try
					{
						System.out.println("Wating for resource 2..");
						Thread.sleep(2000);
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
				
					synchronized (str1) 
					{
						System.out.println("Thread 1 aquire resources 1..!");
					}
				}
			}
		};
		Thread t1 = new Thread() {
			
			public void run()
			{
				synchronized (str1) 
				{
					System.out.println("Thread 2 aquire resources 1..!");
				
					try
					{
						
						System.out.println("Wating for resource 1..");
						Thread.sleep(2000);
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
					synchronized (str) 
					{
						System.out.println("Thread 2 aquire resources 1..!");
					}
				}
			}
		};
		t.start();
		t1.start();
	}
}
