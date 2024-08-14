package synchronized1.com;
class Wait1 extends Thread
{
	int price=0;
	public void run() 
	{
		synchronized (this) 
		{

			for(int i=1;i<=5;i++)
			{
				price=i*5000;
			}
			this.notify();
		}
	}
}
public class WaitMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Wait1 w = new Wait1();
		w.start();
		synchronized (w) 
		{
			w.wait();
		}
		System.out.println("price is: "+w.price);
		System.out.println("Main completed..");
	}
}
