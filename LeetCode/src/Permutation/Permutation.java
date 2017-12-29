package Permutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {

	public static void permute(String prefix, String s) {
		int N = s.length();
		if (N == 0) {
			System.out.println(prefix);
		} else {
			for (int i = 0; i < N; i++) {
				permute(prefix + s.charAt(i), s.substring(0, i) + s.substring(i + 1, N));
			}
		}
	}

	public static void main(String[] args) {
		String str = "abc";
		permute("", str);
		int[] nums = { 1, 4, 6, 5 };
		List<List<Integer>> list = subsets(nums);
		for (List<Integer> list2 : list) {
			for (Integer integer : list2) {
				System.out.print(integer + " ");
			}
			System.out.println();
		}

	}

	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		backtrack(list, new ArrayList<>(), nums, 0);
		return list;
	}

	private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
		list.add(new ArrayList<>(tempList));
		for (int i = start; i < nums.length; i++) {
			tempList.add(nums[i]);
			backtrack(list, tempList, nums, i + 1);
			tempList.remove(tempList.size() - 1);
		}
	}
}
