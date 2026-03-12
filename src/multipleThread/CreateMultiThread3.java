package multipleThread;

import java.util.Scanner;

//Single run method can manage multiple thread
//Single class, single run method, 3 threads

class LaunchMultipleThreads1 implements Runnable
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
	
	
	public void run()
	{
		String Threadname=Thread.currentThread().getName();
		if(Threadname=="REG")
		{
			register();
		}
		else if(Threadname=="COURSE") {
			courseInfo();
		}
		else
		{
			printStars();
		}
		
	}
}
public class CreateMultiThread3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LaunchMultipleThreads1 l=new LaunchMultipleThreads1();
		Thread t1=new Thread(l); //create new threads by crating object of Thread class
		Thread t2=new Thread(l);
		Thread t3=new Thread(l);
		t1.setName("REG");
		t2.setName("COURSE");
		t3.setName("STAR");
		System.out.println("Starting of Main Method");
t1.start();
t2.start();
t3.start();
System.out.println("Ending of Main Method");

	}

}
