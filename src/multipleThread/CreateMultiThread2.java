package multipleThread;

import java.util.Scanner;
/* We will create thread in 2 ways. either by extending Thread Method or by implementing  Runnable interface.
Need to create object of thread class.
thread.start(). ->will give life to thread
thread.run(). ->inside this method need to mention what activity need to be done. */
class Alpha2 implements Runnable
{
	public void register()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your id");
		int id=scan.nextInt();
		System.out.println("Enter your age");
		int age=scan.nextInt();
		System.out.println("id="+id+"  age="+age);
		
	}
	@Override
	public void run()
	{
		System.out.println("Thread name="+Thread.currentThread().getName());
		register();
	}
	
}

class Beta2 implements Runnable
{
	public void courseInfo()
	{	
for(int i=0;i<5;i++)
{
	System.out.println(" visit website fot more course info");
	
	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	}
	@Override
	public void run()
	{
		System.out.println("Thread name="+Thread.currentThread().getName());
		courseInfo();
	}

	}
	

class Gamma2 implements Runnable
{
public void printStars()
{
	
	for (int i=0;i<5;i++)
		
		try {
		
			System.out.println(" *");
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

@Override
public void run()
{
	System.out.println("Thread name="+Thread.currentThread().getName());
	printStars();
}
}


public class CreateMultiThread2 {

	public static void main(String[] args) {
	
Alpha2 a=new Alpha2(); 
Beta2 b=new Beta2();
Gamma2 g=new Gamma2();
Thread t1=new Thread(a);//new Thread is ceated here
Thread t2=new Thread(b);
Thread t3=new Thread(g);
t1.setName("AlphaThread");
t2.setName("BetaThread");
t3.setName("GammaThread");
t1.start();// Giving life to Thread
t2.start();
t3.start();
}
}
