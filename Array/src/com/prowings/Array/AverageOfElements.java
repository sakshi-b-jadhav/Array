package com.prowings.Array;

//geometric  Average =(x1*x2*x3*xn)^1/n

public class AverageOfElements {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5 };
		geometricAvg(nums);
	}

	public static void geometricAvg(int[] nums) {
		double mul = 1;
		for (int i = 0; i < nums.length; i++) {
			mul *= nums[i];
		}
		System.out.println(mul);

		mul = Math.pow(mul, 1.0 / nums.length);
		System.out.println(mul);

	}

}
