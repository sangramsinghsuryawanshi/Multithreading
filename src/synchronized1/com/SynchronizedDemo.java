package synchronized1.com;
class Booking
{
	int total_Seats=10;
	public synchronized void seatBook(int seat)
	{
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
public class SynchronizedDemo extends Thread
{
	static Booking obj;
	int no;
	public void run() 
	{
		obj.seatBook(no);
	}
	public static void main(String[] args) 
	{
		obj = new Booking();
		SynchronizedDemo s = new SynchronizedDemo();
		SynchronizedDemo s1 = new SynchronizedDemo();
		s.no=14;
		s1.no=3;
		s.start();
		s1.start();
	}
}
