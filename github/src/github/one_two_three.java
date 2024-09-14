package github;

import java.util.Scanner;

public class one_two_three {
// create the program input 123 than output is one_two_three.
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Ente the number");
		String str = s.next();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			switch (ch) {

			case '0':
				System.out.print(" zero ");
				break;
			case '1':
				System.out.print(" one ");
				break;
			case '2':
				System.out.print(" two ");
				break;
			case '3':
				System.out.print(" three ");
				break;
			case '4':
				System.out.print(" four ");
				break;
			case '5':
				System.out.print(" five ");
				break;
			case '6':
				System.out.print(" six ");
				break;
			case '7':
				System.out.print(" seven ");
				break;
			case '8':
				System.out.print(" eight ");
				break;
			case '9':
				System.out.print(" nine ");
				break;

			default: {
				System.out.println("default value.......");
			}
			}

		}

	}
}
