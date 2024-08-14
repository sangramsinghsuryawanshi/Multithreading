package synchronized1.com;

import java.util.Scanner;

class TicketBook
{
	static int ticket=15;
	public static void book(Scanner sc)
	{
		System.out.println("Enter your name: ");
		String name=sc.next();
		System.out.println("Enter tickets: ");
		int t=sc.nextInt();
		if(ticket<t)
		{
			System.out.println(ticket+" are avilable");
			System.out.println(t+" you want ticket");
		}
		else
		{
			System.out.println("Your name is: "+name);
			System.out.println("You bought ticket succesfully: "+t);
			ticket-=t;
			System.out.println("Tickets remening: "+ticket);
		}
	}
}
public class TicketBooking extends Thread
{
	static int t;
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: 1 and 2 \n(1->booking ticket)(2->exite)");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1: TicketBook.book(sc);
				break;
			case 2:
				break;
		}
	}

	public static void main(String[] args) 
	{
		TicketBooking t = new TicketBooking();
		TicketBooking t1 = new TicketBooking();
		try {
			t.start();
			t.join();
			t1.start();
			t1.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
