package threadMethods.com;

import java.util.Scanner;

public class CalaculateSumOfTheDigitsOfLargeNum extends Thread
{
	static int n;
	int l;
	static int sum=0;
	CalaculateSumOfTheDigitsOfLargeNum(int n,int l)
	{
		this.n = n;
		this.l = l;
	}
	public void run()
	{
		int sum=0;
		int num = this.n;
		int rem = 0;
		int c=0;
		while(num!=0)
		{
			if(c>=l/2)
			{
				break;
			}
			else
			{
				c++;
				rem = num%10;
				sum +=rem;
				num/=10;
			}
		}
		n = num;
		System.out.println(currentThread().getName()+" sum = "+sum);
		this.sum += sum;		
	}
	void display()
	{
		System.out.println("Final sum : "+this.sum);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		String st = Integer.toString(n);
		int l = st.length();
		
		CalaculateSumOfTheDigitsOfLargeNum t1 = new CalaculateSumOfTheDigitsOfLargeNum(n, l);
		CalaculateSumOfTheDigitsOfLargeNum t2 = new CalaculateSumOfTheDigitsOfLargeNum(n, l);
		
		try
		{
			t1.start();
			t1.join();
			t2.start();
			t2.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		t2.display();

	}

}
