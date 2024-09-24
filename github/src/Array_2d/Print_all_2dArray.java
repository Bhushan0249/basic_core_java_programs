package Array_2d;

import java.util.Scanner;

public class Print_all_2dArray {
	// print all element as us.
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of  rows ");

		int rows = s.nextInt();
		System.out.println("Enter size of column");
		int collum = s.nextInt();

		int[][] array = new int[rows][collum];

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < collum; j++) {
				array[i][j] = s.nextInt();
			}

		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < collum; j++) {

				System.out.print(array[i][j] + " ");
			}

			System.out.println();
		}
	}
}
