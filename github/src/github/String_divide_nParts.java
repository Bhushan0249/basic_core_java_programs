package github;

import java.util.Scanner;

public class String_divide_nParts {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = s.next();

		int size = str.length();
		System.out.println(size);
		int num = 0;
		System.out.println("enter value 'N'....");
		int n = s.nextInt();
//		String arr[]= new String [n];

		if (size % n != 0) {
			System.out.println("String NOT divisible in 'N' part....");

		} else {

			num = size / n;

			for (int i = 0; i < size; i++) {
				// If the current index is a multiple of 'part_size', start a new line.
				if (i % num == 0)
					System.out.println();
				// Print the character at the current index.
				System.out.print(str.charAt(i));

			}

		}
	}
}
