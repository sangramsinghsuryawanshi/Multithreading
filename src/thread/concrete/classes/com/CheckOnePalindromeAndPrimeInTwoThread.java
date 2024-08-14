package thread.concrete.classes.com;

import java.util.Scanner;

class Palindrome extends Thread
{
	int n;
	Palindrome(int n)
	{
		this.n=n;
	}
	public void run() 
	{
		
		int rem=0,rev=0;
		for(int i=this.n;i!=0;i=i/10)
		{
			rem=i%10;
			rev=(rev*10)+rem;
		}
		if(rev==this.n)
		{
			System.out.println("Given number is palindrome..");
		}
		else
		{
			System.out.println("Given number is not palindrome..");
		}
	}
}
public class CheckOnePalindromeAndPrimeInTwoThread extends Thread
{
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter prime number to check: ");
		int n=sc.nextInt();
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.println("Given number is prime");
		}
		else
		{
			System.out.println("Given number is not prime");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n number: ");
		int n=sc.nextInt();
		Palindrome p = new Palindrome(n);
		CheckOnePalindromeAndPrimeInTwoThread c = new CheckOnePalindromeAndPrimeInTwoThread();
		try 
		{
			p.start();
			p.join();
			c.start();
			c.join();
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
	}

}
