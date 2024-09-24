package Array_2d;

public class majorDiagonal_plus_2dArray {
// print all elements belew the mahor diagonal.
	public static void main(String[] args) {
		
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(i>=j) {
					System.out.print(arr[i][j]+" ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}
