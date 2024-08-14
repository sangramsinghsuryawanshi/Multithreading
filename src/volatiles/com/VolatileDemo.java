package volatiles.com;

public class VolatileDemo 
{
	static volatile int counter=0;
	public static void main(String[] args) 
	{
		Thread t1 = new Thread(()->{
			
			int lcnt=counter;
			while(lcnt<10)
			{
				if(lcnt!=counter)
				{
					System.out.println("counter is changed..");
					lcnt=counter;
				}
			}
		});
		
		Thread t2 = new Thread(()->{
			
			int lcnt=counter;
			while(lcnt<10)
			{
				System.out.println("Thred 2 incrementing by 1: "+(lcnt++));
				counter=lcnt;
			}
		});
		System.out.println(counter);
		t1.start();
		t2.start();
	}
}
