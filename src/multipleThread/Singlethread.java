package multipleThread;
//Here we have only onew thread by default thats y cpu time will waste 
import java.util.Scanner;

class Alpha
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
}

class Beta
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

	}
	

class Gamma
{
public void printStars()
{
	System.out.println(" *");
	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

public class Singlethread {
	
	public static void main(String[] args) {
	
Alpha a=new Alpha();
Beta b=new Beta();
Gamma g=new Gamma();

a.register();
b.courseInfo();
g.printStars();
}
}
