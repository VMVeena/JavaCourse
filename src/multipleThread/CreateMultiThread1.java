package multipleThread;

import java.util.Scanner;
/* We will create thread in 2 ways. either by extending Thread Method or by implementing  Runnable interface.
Need to create object od thread class.
thread.start(). ->will give life to thread
thread.run(). ->inside this method need to mention what activity need to be done. */
class Alpha1 extends Thread
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

class Beta1 extends Thread
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
	

class Gamma1 extends Thread
{
public void printStars()
{
	System.out.println(" *");
	try {
		
		System.out.println("");
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


public class CreateMultiThread1 {
	
	public static void main(String[] args) {
	
Alpha1 a=new Alpha1(); //new Thread is ceated.Thread has ceated here
Beta1 b=new Beta1();
Gamma1 g=new Gamma1();
a.setName("AlphaThread");
b.setName("BetaThread");
g.setName("GammaThread");
a.start();// Giving life to Thread
b.start();
g.start();
}
}
