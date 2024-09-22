package github;

public class PrintDiagonal_2dArray{
// print only diagonal elements Addition an array.

	public static void main(String[] args) {
		int num = 0;
		int ans = 0;
		int arr[][] = { { 1, 2, 3 },// 1+5+9+15
				        { 4, 5, 6 }, // 7+5+3=15
				        { 7, 8, 9 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i == j) {
//					System.out.println(arr[i][j]);
					num = num + arr[i][j];
				}
				if (i + j == arr.length - 1) {
//					System.out.println(arr[i][j]);
					ans = ans + arr[i][j];
				}

			}
		}
		System.out.println(num);
		System.out.println(ans);
	}

}
