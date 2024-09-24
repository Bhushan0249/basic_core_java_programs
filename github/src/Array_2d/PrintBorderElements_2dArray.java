package Array_2d;

public class PrintBorderElements_2dArray {
// print first and last row of an array.

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {

				if (j == 0 || j == arr[0].length - 1 || i == 0 || i == arr.length-1) {
					System.out.print(arr[i][j]+" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
}
