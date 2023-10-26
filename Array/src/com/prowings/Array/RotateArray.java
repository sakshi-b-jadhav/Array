package com.prowings.Array;
//Search in Rotated Sorted Array: Given a sorted and rotated array, search for a target element in the array. 
//The array is rotated at some unknown pivot.

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements in array");
		int[] nums = new int[5];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(nums));
		System.out.println("Enter the key value");
		int key = sc.nextInt();

		int result=findnum(nums, key);
		
		if(result>=0)
		{
			System.out.println(result);
			
		}
		else
		{
			System.out.println(key);
		}
		}
	

	public static int findnum(int[] nums, int key) {
//		sortArray(nums);

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == key) {
				return i+1;

			}
		}
		return -1;

	}

	public static void sortArray(int[] nums) {
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) 
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
