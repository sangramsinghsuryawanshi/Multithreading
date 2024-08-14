package synchronized1.com;
class Booking1
{
	int total_Seats=10;
	public  void seatBook(int seat)
	{
		synchronized(this)
		{
			System.out.println("Current boking thread: "+Thread.currentThread().getName());
			if(total_Seats<seat)
			{
				System.out.println("Seats are not available...");
				System.out.println("There are only: "+total_Seats);
			}
			else
			{
				System.out.println("Booking confirm...");
				total_Seats = total_Seats-seat;
				System.out.println("Total seats are: "+total_Seats);
			}
		}
	}
}

public class SynchronizationBlockThis extends Thread
{
	static Booking1 obj;
	int no;
	public void run() 
	{
		obj.seatBook(no);
	}
	public static void main(String[] args) 
	{
		obj = new Booking1();
		SynchronizationBlockThis s = new SynchronizationBlockThis();
		SynchronizationBlockThis s1 = new SynchronizationBlockThis();
		s.no=14;
		s1.no=3;
		s.start();
		s1.start();
	}
}
