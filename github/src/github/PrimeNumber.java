package github;

import java.util.ArrayList;
import java.util.Scanner;

class PrimeNumber {
// Q1.  Write a program to find prime number 0 to N.

	private static ArrayList<Integer> Prime(int N) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 3; i < N; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				list.add(i);
			}
		}

		return list;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value....");
		int num = s.nextInt();
		ArrayList<Integer> list = PrimeNumber.Prime(num);

		System.out.println(list);
	}
}
