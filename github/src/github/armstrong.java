package github;

import java.util.Scanner;

public class armstrong {

// 1 to 999 armstrong  number  1,2,3,4,5,6,7,8,9,153,370,371,407

// 1*1*1=   1  
// 5*5*5= 125
// 3*3*3=  27

// total =153 //it's armstrong  number...

	public static boolean armstrongString(int num) {

		int n = 0, temp = 0, digit = 0, copy = 0;

		n = num;
		while (n != 0) {
			n = n / 10;
			digit++;
		}
		n = num;
		while (n != 0) {
			temp = n % 10;
			copy += (Math.pow(temp, digit));
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
		System.out.println("enter value...");
		int num = s.nextInt();
		for (int i = 1; i < num; i++) {
			if (armstrong.armstrongString(i)) {
				System.out.print(i + " ");
			}

		}

	}

}
