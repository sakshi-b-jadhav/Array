package com.prowings.Array;

import java.util.Scanner;

public class SumOfElement {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number:");
		int num=sc.nextInt();
		
		sumOfElement(num);
		
	}	
	public static void sumOfElement(int num) {
		
		double sum=0;
		
		for(int i=1;i<=num;i++)
			sum = sum + (1.0/i);
		
		System.out.println(sum);
	}

}
