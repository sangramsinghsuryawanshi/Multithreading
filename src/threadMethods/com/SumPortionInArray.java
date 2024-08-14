/*
 * 2.Write a program that uses multiple threads to calculate the sum of an array of numbers. 
 * Each thread should sum a portion of the array, 
 * and then the main thread should add up the individual sums to get the total sum.
 */
package threadMethods.com;

import java.util.Scanner;

public class SumPortionInArray extends Thread
{
	static int a[];
	static int sum;
	SumPortionInArray(int a[], int sum)
	{
		this.a=a;
		this.sum=sum;
	}
	public void run()
	{
		int sum=0;
		if(this.sum<=0)
		{
			for(int i=0;i<this.a.length/2;i++)
			{
				sum+=a[i];
			}
			System.out.println(Thread.currentThread()+"----> "+sum);
		}
		else
		{
			
			for(int i=this.a.length/2;i<this.a.length;i++)
			{
				sum+=a[i];
			}
			System.out.println(Thread.currentThread()+"----> "+sum);
		}
		this.sum+=sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		int sum=0;
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		SumPortionInArray s = new SumPortionInArray(a,sum);
		SumPortionInArray s1 = new SumPortionInArray(a,sum);
		try 
		{
			s.start();
			s.join();
			s1.start();
			s1.join();
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		System.out.println("Main: "+SumPortionInArray.sum);
	}
}
