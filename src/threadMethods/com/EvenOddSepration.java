package threadMethods.com;
public class EvenOddSepration extends Thread
{
	int arr[];
	static int even[]= new int[5];
	static int odd[]=new int[5];
	static int x=0,y=0,cnt=0;
	EvenOddSepration(int a[])
	{
		this.arr=a;
	}
	@Override
	public void run() 
	{
		if(x<=0)
		{
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]%2==0)
				{
					even[x++]=arr[i];
					cnt++;
				}
			}
			System.out.println("Even: ");
			for(int i=0;i<even.length;i++)
			{
				if(even[i]!=0)
				System.out.print(even[i]+" ");
			}
		}
		else
		{
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]%2!=0)
				{
					odd[y++]=arr[i];
				}
			}
			System.out.println("\nOdd: ");
			for(int i=0;i<odd.length;i++)
			{
				System.out.print(odd[i]+" ");
			}
		}
		
		
	}
	public static void main(String[] args) throws InterruptedException
	{
		int arr[]= {1,5,3,7,8,5};
		EvenOddSepration e = new EvenOddSepration(arr);
		EvenOddSepration e1 = new EvenOddSepration(arr);
		e.start();
		e.join();
		e1.start();
		e1.join();
	}

}
