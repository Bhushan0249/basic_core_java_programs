package github;

import java.util.Scanner;

public class Int_palindrome {

	private static boolean Palindrome(int num) {

		int n = 0, temp = 0, copy = 0;

		n = num;
		while (n != 0) {
			temp = n % 10;
			copy = copy * 10 + temp;
			n = n / 10;
		}
		if (num == copy) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value..");
		int num = s.nextInt();

		if (Int_palindrome.Palindrome(num)) {
			System.out.println("it's valid Palindrome...");
		} else {
			System.out.println("it's NOT Palindrome...");
		}

	}
}
