package Array_2d;

import java.util.Scanner;

public class PrintTheIndices_2dArray {
// Q. Take amatrixas input from the user search for a geven 
	// number x and print the indeces at witch it occurs.

	public static void main(String[] args) {
		int x = 11;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter rows");
		int rows = s.nextInt();

		System.out.println("Enter collum");
		int collum = s.nextInt();

		int[][] arr = new int[rows][collum];

		// this is a rows loops.
		for (int i = 0; i < rows; i++) {

			// this is a collum loops.
			for (int j = 0; j < collum; j++) {
				arr[i][j] = s.nextInt();
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < collum; j++) {
				if (arr[i][j] == x) {
					System.out.println("X location is (" + i + "," + j + ") index.");
				}
			}
		}

	}

}
