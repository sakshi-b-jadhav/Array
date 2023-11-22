package com.prowings.Array;

import java.util.Arrays;

public class CyclicRotation 
{
	public static void main(String[] args) 
	{
		int []nums= {2,5,1,6,7};
		
		cyclicRotation(nums);
		System.out.println(Arrays.toString(nums));
		
	}
	public static void cyclicRotation(int[] nums) {
		
		
		
		 int firstNo=nums[0];
		
		for(int i=0;i<nums.length-1;i++)
		{
			nums[i]=nums[i+1];
		}
	
		nums[nums.length-1]=firstNo;
	}
}
//int lastNo=nums[nums.length-1];
//for(int i=nums.length-1;i>0;i--)
//{
//nums[i]=nums[i-1];
//}
//nums[0]=lastNo;