package github;

public class Sort_Array {
// create the progrm and sort the array in ascending order not using in-built mehtod.

	public static void main(String[] args) {
		int a = 0;
		int arr[] = { 23, 65, 76, 34, 23, 65, 76, 34, 76, 87, 23, 98, 111 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
