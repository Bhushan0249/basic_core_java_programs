package github;

import java.util.Arrays;
import java.util.List;

public class Min_Max {
	// Create the program and print the (Min AND Max) element in List.

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(37, 45, 76, 98, 55, 87, 34, 90);

		Integer min = list.stream().min((a, b) -> (a - b)).get();
		
		Integer max = list.stream().max((a, b) -> (a - b)).get();


		System.out.println(min);
		System.out.println(max);

	}

}
