/*
 * 8. Write a program that uses threads to calculate the Fibonacci sequence.
 *  Each thread should calculate a portion of the sequence, and 
 * then the main thread should combine the results to get the full sequence.
 */
package threadMethods.com;

import java.util.Scanner;

class Fib1 extends Thread
{
	static int a=0,b=1,c=0;
	static int n,n1;
	Fib1(int n,int n1)
	{
		this.n=n;
		this.n1=n1/2;
	}
	public void run()
	{
		System.out.print("\nfibonacii series: ");
		for(int i=this.n;i<=this.n1;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
}
public class PrintFibonacciSequence 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First and last number: ");
		int n=sc.nextInt();
		int n1=sc.nextInt();
		Fib1 f = new Fib1(n,n1);
		Fib1 f1 = new Fib1(n,n1);
		try 
		{
			f.start();
			f.join();
			f1.start();
			f1.join();
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}
