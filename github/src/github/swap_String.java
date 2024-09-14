package github;

import java.util.Scanner;

public class swap_String {
// create the program and swipe the two sting without using third variable.

	private static String swapString(String a, String b) {

		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());

		return a + " " + b;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter 1st string");
		String a = s.next();

		System.out.println("enter 2nd string");
		String b = s.next();

		String result = swap_String.swapString(a, b);

		System.out.println(result);
	}

}
