/*
 * 1. Write a Java program to create a basic Java thread 
 * that prints " Hello, World!"  10 times
 */
package thread.concrete.classes.com;

public class PrintHelloWord extends Thread
{
	public void run()
	{
		int n=10;
		for(int i=0;i<=n;i++)
		{
			System.out.println("Hello, World!");
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PrintHelloWord p = new PrintHelloWord();
		p.start();
		System.out.println("Main method completed..");
	}

}
