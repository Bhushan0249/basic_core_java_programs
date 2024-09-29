package github;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class frequency {
//maximum frequency in array.
	public static List<Entry<Integer, Integer>> frequency_max(int[] arr) {

		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		List<Entry<Integer, Integer>> bhu = map.entrySet().stream().sorted((a, b) -> (b.getValue() - a.getValue()))
				.limit(1).toList();

		return bhu;

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the limit in array");
		int num = s.nextInt();
		int arr[] = new int[num];
		int size = arr.length;
		System.out.println("enter the " + size + " element....");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}

		List<Entry<Integer, Integer>> bhu = frequency.frequency_max(arr);

		System.out.println(bhu);
	}

}
