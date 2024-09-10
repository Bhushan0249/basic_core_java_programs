package github;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value");
		String input = s.next();

		// give the input value.

		int num = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (!(ch >= '0' && ch <= '9')) {
				num = i;
			}

		}

		String b = input.substring(0, num);
		String c = input.substring(num + 1);

		int d = Integer.parseInt(b);
		int e = Integer.parseInt(c);

		// convert String to int value.

		switch (input.charAt(num)) {

		case '+':
			System.out.println(d += e);
			break;
		case '-':
			System.out.println(d -= e);
			break;
		case '*':
			System.out.println(d *= e);
			break;
		case '/':
			System.out.println(d /= e);
			break;
		case '%':
			System.out.println(d %= e);
			break;

		default:
			System.out.println("defult value");

		}

	}

}
