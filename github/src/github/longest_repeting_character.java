package github;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class longest_repeting_character {
// java program find the longest repeting sequence in a String

	private static Entry<Character, Integer> longestRC(String str) {

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

		char arr[] = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);

			}
		}
		Entry<Character, Integer> result = map.entrySet().stream().max((a, b) -> (a.getValue() - b.getValue())).get();
		return result;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Entet the String.....");
		String str = s.next();
		Entry<Character, Integer> map = longest_repeting_character.longestRC(str);

		System.out.println(map);
	}
}
