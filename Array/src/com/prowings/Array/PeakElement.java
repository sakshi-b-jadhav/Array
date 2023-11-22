package com.prowings.Array;

import java.util.Arrays;

public class PeakElement {
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,1};
		
	int[]res=findPeakElement(nums);
		System.out.println(Arrays.toString(res));
  
		
	}

	public static int[] findPeakElement(int[] nums) {
		 int[] result=new int[nums.length];
		 int counter=0;
		for(int i=1;i<nums.length-1;i++)
		{
			if(nums[i]>nums[i+1]&&nums[i]>nums[i-1])
			{
				result[counter]=nums[i];
				counter++;
			}
		}
		int[]peak=new int[counter];
		System.arraycopy(result, 0, peak, 0, counter);
		return peak;
	}

}
