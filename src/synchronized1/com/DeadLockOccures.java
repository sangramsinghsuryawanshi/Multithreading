package synchronized1.com;

public class DeadLockOccures {

	public static void main(String[] args) throws InterruptedException
	{
		String str1="JAVA";
		String str2="C#";
		Thread t1 = new Thread()
		{
			public void run()
			{
				System.out.println("Thread 1..");
				synchronized(str1)
				{
					System.out.println("Thread 1 aquires the lock of str1..");
					try
					{
						System.out.println("Thread 1 Waiting for str2..");
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					synchronized(str2)
					{
						System.out.println("Thread 1 aquires the lock of str2..");
						try
						{
							System.out.println("Thread 1 Waiting for str1..");
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}
					}
				}
			}
		};
		
		Thread t2 = new Thread()
		{
			public void run()
			{
				System.out.println("Thread 2..");
				synchronized(str1)
				{
					System.out.println("Thread 2 aquires the lock of str2..");
					try
					{
						System.out.println("Thread 2 Waiting for str1..");
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					synchronized(str2)
					{
						System.out.println("Thread 2 aquires the lock of str1..");
						try
						{
							System.out.println("Thread 2 Waiting for str2..");
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}
					}
				}
			}
		};
		t1.start();
		//t1.join();
		t2.start();
		//t2.join();//resolved dedlock and donot use nested lock(sysnchronized()) and follows sequence of(t1(str1))(t2(str1))
	}

}
