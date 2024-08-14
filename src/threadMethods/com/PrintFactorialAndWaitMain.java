/*
 * 6. Write a program that creates a thread that calculates the factorial of a number. 
 * The main thread should wait for the thread to finish and then print out the result.
 */
package threadMethods.com;

public class PrintFactorialAndWaitMain extends Thread
{
	public void run() 
	{
		int n=5;
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		System.out.println("Factorial of "+n+" is: "+fact);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PrintFactorialAndWaitMain p = new PrintFactorialAndWaitMain();
		p.start();
		try
		{
			Thread.sleep(1000);
			System.out.println(currentThread().currentThread().getName()+" completed!");
		}
		catch (Exception e) {
		System.out.println(e);
		}
		
	}

}
