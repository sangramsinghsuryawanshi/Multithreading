package runnable.Interface.com;

class EvenOdd implements Runnable
{
	public void run() 
	{
		System.out.print("Given even number is: ");
		int n=10;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
		
	}
}
class EvenOdd1 implements Runnable
{
	public void run() 
	{
		System.out.print("\nGiven odd number is: ");
		int n=10;
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
		}
		
	}
}
public class EvenAndOdd 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		EvenOdd e = new EvenOdd();
		EvenOdd1 e1 = new EvenOdd1();
		Thread t = new Thread(e);
		Thread t1 = new Thread(e1);
		try 
		{
			t.start();
			t.join();
			t1.start();
			t1.join();
		} 
		catch (Exception e2) 
		{
			System.out.println(e2);
		}
	}

}
