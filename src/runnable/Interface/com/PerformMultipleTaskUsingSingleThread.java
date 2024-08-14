package runnable.Interface.com;

public class PerformMultipleTaskUsingSingleThread 
{
	public static void isPrint()
	{
		System.out.println("Print: ");
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello java");
		}
	}
	public static void isLoop()
	{
		System.out.println("Print i: ");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
	}
	public static void isTable()
	{
		System.out.println("table i: ");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i*i);
		}
	}
	public static void main(String[] args) 
	{
		Thread t = new Thread(){
			
			@Override
			public void run() 
			{
				isLoop();
				isPrint();
				isTable();
			}
		};
		try 
		{
			t.run();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
