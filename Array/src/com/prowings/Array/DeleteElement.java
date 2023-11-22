package com.prowings.Array;

import java.util.Arrays;

public class DeleteElement {
	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4 };
		int value = 1;
		deleteElement(nums, value);
		int[] res1 = deleteElement(nums, value);
		System.out.println(Arrays.toString(res1));
	}

	public static int[] deleteElement(int[] nums, int value) {
		int[] result = new int[nums.length - 1];
		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != value) {
				result[counter] = nums[i];
				counter++;
			}
		}
		return result;
	}

}
