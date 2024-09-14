package github;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class duplicate_element_printArray_streamAPI {
// create the program and print the duplicate element.
	public static void main(String[] args) {

		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		Integer arr[] = { 22, 22, 44, 55, 66, 77, 77, 88, 99, 11, 11 };
		System.out.println(Arrays.toString(arr));
		List<Integer> list = Arrays.asList(arr);
		List<Integer> result = list.stream().filter(a -> !set.add(a)).distinct().toList();
		System.out.println(set);
		System.out.println(result);
	}
}
