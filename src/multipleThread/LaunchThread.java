package multipleThread;

public class LaunchThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Hi");
		Thread.sleep(6000);
		
		Thread t1=Thread.currentThread();
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println("Hello");
	}

}
