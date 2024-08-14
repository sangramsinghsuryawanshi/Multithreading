/*
 * WAP to design the traffic light system: 

It should be like this: 

1st thread will print: 

       It's red please wait for 30 sec

2nd thread will print: 
       
       It's yellow, be read for go!!!!

3rd thread will print afte 5 second: 

       It's green, go hurrreyy!!!!!!!!!!!
 */
package threadMethods.com;
class TraficLightFirst1Thread extends Thread
{
	public void run() 
	{
		try 
		{
			System.out.println( "It's red please wait for 30 sec");
			Thread.sleep(5000);
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}
class TraficLightSecondThread extends Thread
{
	public void run() 
	{
		System.out.println("It's yellow, be read for go!!!!");
	}
}
public class TraficLightDesgin extends Thread
{
	public void run() 
	{
		try 
		{
			Thread.sleep(3000);
			System.out.println("It's green, go hurrreyy!!!!!!!!!!!");
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) 
	{
		TraficLightFirst1Thread t = new TraficLightFirst1Thread();
		TraficLightSecondThread t1 = new TraficLightSecondThread();
		TraficLightDesgin t3 = new TraficLightDesgin();
		try 
		{
			t.start();
			t.join();
			t1.start();
			t1.join();
			t3.start();
			t3.join();
		} 
		catch (Exception e) 
		{
			
		}
	}

}
