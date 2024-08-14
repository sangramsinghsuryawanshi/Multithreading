package thread.concrete.classes.com;
public class UsingThreadClassFindFactorial extends Thread
{
	public void run()
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int fact=1;
			for(int j=1;j<=i;j++)
			{
				fact*=j;
			}
			System.out.println("Factorial of "+i+" is: "+fact);
		}
	}
	int n=25;
	public void disp()
	{
		System.out.print("\nEven number is: ");
		for(int i=10;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		UsingThreadClassFindFactorial u = new UsingThreadClassFindFactorial();
		u.start();
		u.disp();
		System.out.println("\nMain method completed..");
	}

}
