 package github;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramProgram {
	public static void main(String[] args) {

//		String str1 = "BHUshan";
//		String str2 = "usbanhh";

		Scanner s = new Scanner(System.in);
		System.out.println("enter 1st String");
		String str1 = s.next();

		System.out.println("enter 2nd String");
		String str2 = s.next();
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		boolean a = Arrays.equals(arr1, arr2);

		if (a) {
			System.out.println(str1 + " and " + str2 + " are valid anagram");
		} else {
			System.out.println(str1 + " and " + str2 + " are NOT anagram");
		}


	}
}
//}
