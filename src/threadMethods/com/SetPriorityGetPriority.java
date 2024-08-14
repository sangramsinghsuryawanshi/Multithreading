package threadMethods.com;

public class SetPriorityGetPriority extends Thread
{
	SetPriorityGetPriority(String s)
	{
		super(s);
	}
	public void  run() {
		System.out.println("Running..."+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		SetPriorityGetPriority obj=new SetPriorityGetPriority("Thread 1");
		SetPriorityGetPriority obj1=new SetPriorityGetPriority("Thread 2");
		SetPriorityGetPriority obj2=new SetPriorityGetPriority("Thread 3");

//		System.out.println("Thread 1:"+obj.getName());
//		System.out.println("Thread 2:"+obj1.getName());
//		System.out.println("Thread 3:"+obj2.getName());
//		obj.setName("t1");
//		obj1.setName("t2");
//		obj2.setName("t3");
//		System.out.println("Thread 1:"+obj.getName());
//		System.out.println("Thread 2:"+obj1.getName());
//		System.out.println("Thread 3:"+obj2.getName());
		obj.setPriority(MAX_PRIORITY);
		obj1.setPriority(MIN_PRIORITY);
		obj2.setPriority(NORM_PRIORITY);
		System.out.println("Thread 1:"+obj.getPriority());
		System.out.println("Thread 2:"+obj1.getPriority());
		System.out.println("Thread 3:"+obj2.getPriority());
		System.out.println("Main calling: "+currentThread().currentThread().getName());
		obj.start();
		obj1.start();
		obj2.start();

	}

}