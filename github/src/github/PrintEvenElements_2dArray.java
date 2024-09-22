package github;

public class PrintEvenElements_2dArray {
// print the all even elements of an arrays.
	public static void main(String[] args) {
		
	int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[0].length; j++) {
			if(arr[i][j]%2==0) {
				System.out.print(arr[i][j]+" ");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
		
		
		
		
		
	}
}
