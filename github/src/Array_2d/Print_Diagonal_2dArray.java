package Array_2d;

public class Print_Adi_Diagonal_2dArray {
	// print  only diagonal elements, and other element print 0 of an array.

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i == j || i + j == arr.length - 1) {
					System.out.print(arr[i][j] + " ");
				} else {
					System.out.print("0"+" ");
				}
			}
			System.out.println();
		}

	}

}
