package com.prowings.Array;

import java.util.Arrays;

public class BinarySort {
	
	public static void main(String[] args) {
		
		int[]nums= {40,20,10,25,30,15,23};
		int key=30;
		
     int result=findNum(nums, key);
		
		if(result>=0)
		{
			System.out.println(result);
			
		}
		else
		{
			System.out.println(key);
		}
		}

	public static int findNum(int[] nums, int key) {
		
		sortArray(nums);
		int low = 0,high =nums.length-1,mid=0;
		
		
		while(low<=high)
		{
			mid=(low+high)/2;
			
			if(key==nums[mid])
			{
				return mid;
			}
			else if(key<nums[mid])
			{
			  high=mid-1;
			//  low=low;			  
			}
			else 
			{
				low=mid+1;	
			}
		}
			return -1;	
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

