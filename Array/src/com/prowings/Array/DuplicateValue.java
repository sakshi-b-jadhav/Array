package com.prowings.Array;

import java.util.Arrays;

public class DuplicateValue {
	public static void main(String[] args) {

		int[] nums = { 2, 5, 1, 2, 1, 9 };

		int[] res = findDuplicate(nums);
		System.out.println(Arrays.toString(res));
	}

	public static int[] findDuplicate(int[] nums) {
		int[] duplicate = new int[nums.length / 2];
		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					duplicate[counter] = nums[i];
					counter++;
				}
			}
      }
	    int[] result = new int[counter];
		System.arraycopy(duplicate, 0, result, 0, counter);

		return result;
	}

}
