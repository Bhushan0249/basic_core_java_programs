package github;

import java.util.Scanner;

public class BhUsHaN {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Nmae");

		String str = s.next();

		StringBuffer sb = new StringBuffer(str);

			for (int i = 0; i <str.length(); i++) {
				
				if (Character.isLowerCase(str.charAt(i))) {
					sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));
				} else if (Character.isUpperCase(str.charAt(i))) {
					sb.setCharAt(i, Character.toLowerCase(str.charAt(i)));
				}
			}
			System.out.println(str);
			System.out.println(sb);
	}
}
