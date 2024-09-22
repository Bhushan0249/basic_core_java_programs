package github;

public class PrintFirstAndLast_2dArray {
// print first and last row of an array.
	public static void main(String[] args) {

		int arr[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i == 0 || i == arr.length - 1) {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}

	}
}
