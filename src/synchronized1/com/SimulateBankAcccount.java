package synchronized1.com;

import java.util.Scanner;

class BNK
{
	static int amount=6000;
	public static synchronized void deposite(int amt)
	{
		amount+=amt;
		System.out.println("Amount deposited successfully...\nTotal amount: "+amount);
		
	}
	public static synchronized void withdrawal(int amt)
	{
		if(amount<amt)
		{
			amount+=amt;
			System.out.println("Insuffucient balance: "+amount);
		}
		else
		{
			amount-=amt;
			System.out.println("Amount withdrawal successfully...\nTotal amount: "+amount);
		}
	}
}
public class SimulateBankAcccount extends Thread
{
	int amt;
	SimulateBankAcccount(int amt)
	{
		this.amt=amt;
	}
	public void run()
	{
		BNK.deposite(amt);
		BNK.withdrawal(amt);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given amount to deposite: ");
		int d=sc.nextInt();
		SimulateBankAcccount s = new SimulateBankAcccount(d);
		System.out.println("Enter given amount to withdrawal: ");
		int w=sc.nextInt();
		SimulateBankAcccount s1 = new SimulateBankAcccount(w);
		s.start();
		s1.start();
	}

}
