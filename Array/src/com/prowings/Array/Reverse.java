package com.prowings.Array;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {

		int[] nums = { 2, 5, 3, 6, 1 };

		System.out.println(Arrays.toString(reverseNo(nums)));
	  }

  public static int[] reverseNo(int[] nums) {
		int[] result = new int[nums.length];
		int counter = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			result[counter++] = nums[i];
			 }
		return result;
	}

}
