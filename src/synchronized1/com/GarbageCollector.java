package synchronized1.com;

public class GarbageCollector 
{
	public void finalize()
	{
		System.out.println("Garbage collected..");
	}
	public static void main(String[] args) {
		System.out.println("Main completed..");
		GarbageCollector g = new GarbageCollector();
		GarbageCollector g1 = new GarbageCollector();
		g=g1;
		System.gc();
	}
}
