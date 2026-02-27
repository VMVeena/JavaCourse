package ExceptionHandling;

//Checked exception where compiler will inform about exception and it give suggestion.
public class CheckedException {

	public static void main(String[] args) throws InterruptedException //it will not handle the exption. it will just dump the exception
	{
		// TODO Auto-generated method stub
		
		System.out.println("Hello");
		Thread.sleep(500);
		System.out.println("Hi");
	}

}
