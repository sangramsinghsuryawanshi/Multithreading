package threadMethods.com;

import java.util.Scanner;

class Ascending extends Thread
{
	public void run() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.print("\nEnter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.print("\nAscending array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
public class SortArrayInAscendingAndDscending extends Thread
{
	public void run() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter array size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.print("\nEnter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.print("\nDescending array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		Ascending a = new Ascending();
		SortArrayInAscendingAndDscending s = new SortArrayInAscendingAndDscending();
		try {
			a.start();
			a.join();
			s.start();
			s.join();
		} catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}
