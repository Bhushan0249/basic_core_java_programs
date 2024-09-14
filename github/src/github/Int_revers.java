package github;

import java.util.Scanner;

public class Int_revers {
// create the progrma and print the revers Integer numbers.

	private static int revers(int num) {

		int temp = 0, copy = 0;

		while (num != 0) {
			temp = num % 10;
			copy = copy * 10 + temp;
			num = num / 10;
		}
		return copy;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number..");
		int num = s.nextInt();

		int result = Int_revers.revers(num);
		System.out.println(result);
	}
}
