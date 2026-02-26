package OOPS;

public interface Interface2 {
	int mul(int a, int b);
	float div(float a, float b);
	default void show() {
		System.out.println("Interface2's default method");
		}
	

}
