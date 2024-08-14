package threadMethods.com;

public class HelloProgramUsingSleep extends Thread
{
	@Override
	public void run() 
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Hello Word..");
			try 
			{
				Thread.sleep(1000);
			} 
			catch (Exception e) 
			{
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) 
	{
		HelloProgramUsingSleep h = new HelloProgramUsingSleep();
		h.start();
	}
}
