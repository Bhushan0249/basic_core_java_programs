package github;

public class swipe_2_number {
public static void main(String[] args) {
	
	// swap two numbers without using third variable and arithmetic operator.
	
	
	int a=10;
	int b=20;
	
	a=a^b; // a=30.
	b=a^b; // b=10.
	a=a^b; // a=20.
	System.out.println(a); // 20.
	System.out.println(b); // 10.
}
}
