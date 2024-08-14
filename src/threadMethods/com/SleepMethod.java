package threadMethods.com;

public class SleepMethod extends Thread
{
	public void run()
	{
		int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int k=n;k>=i;k--)
			{
				System.out.print(" ");
			}
				for(int j=1;j<=i;j++)
				{
					if(j==1 || i==j|| i==n)
					{
						System.out.print("* ");
					try
					{
						Thread.sleep(1000);
					}
					catch (Exception e) 
					{
						System.out.println(e);
					}
					}
					else
					{
						System.out.print("  ");
					}
				}
				System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SleepMethod s = new SleepMethod();
		s.start();
	}

}
