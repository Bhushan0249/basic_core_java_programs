package github;

import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class check_prime_or_not {
	// create the program and input the value of array size and value
	// than check the number prime or not / remove duplicate element
	public static void main(String[] args) {

		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

		Exception e = new Exception();
		Scanner s = new Scanner(System.in);
		System.out.println("Please NOTE [duplicate not allow]...");
		System.out.println("------------------------------------------------");
		System.out.println("Enter the size of array....");
		try {
			int size = s.nextInt();

			int arr[] = new int[size];
			System.out.println("Enter the " + size + " element .");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = s.nextInt();
				if (arr[i] == 0 || arr[i] == 1) {
					System.out.println("default number : " + arr[i]);
					throw e;
				}

			}
			for (int i = 0; i < arr.length; i++) {
				boolean isPrime = true;
				for (int j = 2; j < arr[i]; j++) {
					if (arr[i] % j == 0) {
						isPrime = false;
						break;

					}
				}
				if (isPrime) {
					map.put(arr[i], "isPrime");
				} else {
					map.put(arr[i], "NOTprime");
				}
			}
			System.out.println(map);
		} catch (InputMismatchException a) {
			System.out.println(a.getStackTrace());

		} catch (Exception a) {
			System.out.println(a.getStackTrace());
		}
	}

}