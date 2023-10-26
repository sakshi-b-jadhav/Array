package com.prowings.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MaxNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of numbers:");
		int size = sc.nextInt();
		System.out.println("Enter the numbers");
		int[] nums = new int[size];

		for (int i = 0; i < size; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(nums));
		maxNo(nums);
	}
	public static void maxNo(int[] nums) {
		int max = nums[0];
		for (int i = 1; i <nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.println("The maximum number is: " + max);
	}
}



