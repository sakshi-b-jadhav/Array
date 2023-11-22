package com.prowings.Array;

import java.util.Arrays;

public class SortNegativeNum 
{
  public static void main(String[] args) {
	
	  int nums[]= {20,-7,-8,23,-1, 0};
	  sortArray(nums);
}

  public static void sortArray(int[] nums) {
		
		for(int i=0;i<=nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if (nums[i] > nums[j])
				{
				int temp=nums[i];
				nums[i]=nums[j];
				nums[j]=temp;
				
		      	}
			}			
		}
		System.out.println(Arrays.toString(nums));	
	}
}
