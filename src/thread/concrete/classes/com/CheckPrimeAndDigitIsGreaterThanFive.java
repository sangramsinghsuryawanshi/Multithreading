package thread.concrete.classes.com;

import java.util.Scanner;

public class CheckPrimeAndDigitIsGreaterThanFive extends Thread
{
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input series of prime number: ");
		int n =sc.nextInt();
		int n1 = sc.nextInt();
		for(int i=n;i<=n1;i++)
		{
			int c=1;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
					int rem=i%10;
					if(rem>5)
					{
						System.out.println(i);
					}
			}
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CheckPrimeAndDigitIsGreaterThanFive c = new CheckPrimeAndDigitIsGreaterThanFive();
		c.start();
	}

}
