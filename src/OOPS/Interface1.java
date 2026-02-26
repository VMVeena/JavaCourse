package OOPS;

public interface Interface1 {
	int add(int a, int b);
	int sub(int x, int y);
    float pi=3.14f;
    default void show() {
    	System.out.println("Interface1's default method");
    	}
}
