package threadMethods.com;

public class GetNameAndSetName extends Thread
{
	GetNameAndSetName(String s)
	{
		super(s);
	}
	public void  run() {
		System.out.println("Running..."+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		GetNameAndSetName obj=new GetNameAndSetName("Thread 1");
		GetNameAndSetName obj1=new GetNameAndSetName("Thread 2");
		GetNameAndSetName obj2=new GetNameAndSetName("Thread 3");

		System.out.println("Thread 1:"+obj.getName());
		System.out.println("Thread 2:"+obj1.getName());
		System.out.println("Thread 3:"+obj2.getName());
		obj.setName("t1");
		obj1.setName("t2");
		obj2.setName("t3");
		System.out.println("Thread 1:"+obj.getName());
		System.out.println("Thread 2:"+obj1.getName());
		System.out.println("Thread 3:"+obj2.getName());
		System.out.println("Main calling: "+currentThread().currentThread().getName());
		obj.start();
		obj1.start();
		obj2.start();

	}

}