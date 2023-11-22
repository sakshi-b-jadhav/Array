package com.prowings.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindElement2 {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 5, 4 , 0};
		int key = 5;
		List<int[]> pairOfElements = findElements(nums, key);
		
		for(int[] n : pairOfElements) {
			System.out.println(Arrays.toString(n));
		}
	}

	public static List<int[]> findElements(int[] nums, int key) {
		
		List<int[]> pairOfElements = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == key) {
					int[]sum = {nums[i], nums[j]};
					pairOfElements.add(sum);
				}
			}
		}

		return pairOfElements;
	}
}
