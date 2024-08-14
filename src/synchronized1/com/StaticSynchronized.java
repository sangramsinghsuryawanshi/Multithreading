package synchronized1.com;
class BookingEx
{
	static int Booking_Seat=20;
	int seat;
	public static synchronized void bookingCheck(int seat)
	{
		if(Booking_Seat<seat)
		{
			System.out.println(seat+" seats are availble..");
			System.out.println("There are only: "+Booking_Seat);
		}
		else
		{
			System.out.println(seat+" seats booking confirmed..");
			Booking_Seat=Booking_Seat-seat;
			System.out.println("Total seats: "+seat);
		}
	}
}
class CallBooking extends Thread
{
	BookingEx obj;
	int seat;
	public CallBooking(int seat,BookingEx obj)
	{
		this.seat=seat;
		this.obj=obj;
	}
	public void run() 
	{
		obj.bookingCheck(seat);
	}
}

public class StaticSynchronized 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookingEx b = new BookingEx();
		CallBooking c = new CallBooking(8,b);
		CallBooking c1 = new CallBooking(8,b);
		CallBooking c2 = new CallBooking(5,b);
		c.start();
		c1.start();
		c2.start();
		System.out.println("Main method completed..");
		
	}

}
