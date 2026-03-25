package multipleThread;
//If only one resource is ther and we want to restrict one thread need to use that resouse at a time then we will lock that resource by sychronised key.
// In Synchronised thread even if ther is a delay at a time only one thread will execute.
class MyCar implements Runnable
{
	@Override
	synchronized public void run()
	{
		try
		{
			System.out.println(Thread.currentThread().getName()+"  Has entered Parking lot");
			Thread.sleep(6000);
			System.out.println(Thread.currentThread().getName()+"  Has entered into driving seat");
			Thread.sleep(6000);
			System.out.println(Thread.currentThread().getName()+"  Started  driving car");
			Thread.sleep(6000);
			System.out.println(Thread.currentThread().getName()+"  has came back and parked car ");
		}
		catch(Exception e)
		{
			e.printStackTrace();
					}
		
	}
}

public class SychronizationThread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyCar car=new MyCar();
		Thread t1=new Thread(car);
		Thread t2=new Thread(car);
		Thread t3=new Thread(car);
		t1.setName("RAMESH");
		t2.setName("SURESH");
		t3.setName("UMESH");
		
		t1.start();
		t2.start();
		t3.start();
		 

	}

}
