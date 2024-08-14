/*
 * 2. Write a program that uses multiple threads to calculate the sum of an array of numbers. 
 * Each thread should sum a portion of the array, 
 * and then the main thread should add up the individual sums to get the total sum.(using synchronization)
 */
package synchronized1.com;

import java.util.Scanner;


class Sum
{
	static int a[];
	static int sum;
	public synchronized void portionSum(int a[],int sum)
	{
		this.a=a;
		this.sum=sum;
		if(this.sum<=0)
		{
			for(int i=0;i<this.a.length/2;i++)
			{
				sum+=a[i];
			}
			System.out.println(sum);
		}
		else
		{
			for(int i=0;i<this.a.length/2;i++)
			{
				sum+=a[i];
			}
			System.out.println(sum);
		}
		this.sum+=sum;
	}
}
public class SumOfPorationUsingSynchronization extends Thread
{
	static Sum obj;
	int sum=0;
	public void run() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		obj.portionSum(a,sum);
	}
	public static void main(String[] args) 
	{
		obj = new Sum();
		SumOfPorationUsingSynchronization s = new SumOfPorationUsingSynchronization();
		SumOfPorationUsingSynchronization s1 = new SumOfPorationUsingSynchronization();
		
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
		System.out.println("Main: "+Sum.sum);
	}

}
