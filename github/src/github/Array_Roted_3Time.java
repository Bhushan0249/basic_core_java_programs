package github;

public class Array_Roted_3Time {

	// create the program and rated the array 'N' times.
	public static void main(String[] args) {

		int arr[] = { 45, 765, 86, 35, 678, 35, 678, 35, 87, 478, 676 };

		int n = 3;

		for (int i = 0; i < n; i++) {
			int temp = arr[arr.length - 1];
			for (int j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
