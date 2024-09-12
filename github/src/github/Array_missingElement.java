package github;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_missingElement {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		Integer arr[] = { 1, 2, 3, 6 ,15};
		Integer bhu = Arrays.asList(arr).stream().max((a, b) -> (a - b)).get();

		int copy[] = new int[bhu + 1];

		for (int i : arr) {
			copy[i] = 1;
		}
		for (int i = 1; i < copy.length; i++) {
			if (copy[i] == 0) {
				list.add(i);
			}
		}

		System.out.println(list);
	}
}
