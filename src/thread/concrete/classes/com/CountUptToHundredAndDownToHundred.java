package thread.concrete.classes.com;

class CountUp extends Thread
{
	public void run()
	{
		int n=100;
		System.out.print("Count up: ");
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+" ");
		}
	}
}
class CountDown extends Thread
{
	public void run()
	{
		int n=100;
		System.out.print("\nCount down: ");
		for(int i=n;i>=1;i--)
		{
			System.out.print(i+" ");
		}
	}
}
public class CountUptToHundredAndDownToHundred 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CountUp c = new CountUp();
		CountDown c1 = new CountDown();
		try 
		{
			c.start();
			c.join();
			c1.start();
			c1.join();
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		System.out.println("Main method completed...");
	}
}
