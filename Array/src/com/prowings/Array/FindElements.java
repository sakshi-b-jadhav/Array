package com.prowings.Array;

import java.util.Arrays;

public class FindElements {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5 };
		int key = 5;
		int[] result = findElements(nums, key);
		System.out.println(Arrays.toString(result));
		if (result != null)
			System.out.println("Elements that sum up to key are:" + Arrays.toString(result));
		else
			System.out.println("No Elements Found");

	}

	public static int[] findElements(int[] nums, int key) {

		int[] sum = new int[2];
		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				// int sum1=nums[i]+nums[j];
				if (nums[i] + nums[j] == key) {
					sum[counter++] = nums[i];
					sum[counter] = nums[j];
					return sum;
				}
			}
		}

		return null;
	}
}
