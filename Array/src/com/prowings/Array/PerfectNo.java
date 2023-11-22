package com.prowings.Array;

import java.util.Arrays;

public class PerfectNo 
{
	public static void main(String[] args) {
		
		int num=496;
		int res=calculateFac(num);
		
		String result=(res==num?"It is a perfect number":"It is not perfect number");
		System.out.println(result);
				
//		if(res==num)
//		{
//			System.out.println("It is perfect number");
//			
//		}
//		else
//		{
//			System.out.println("It is not perfect numbers");
//		}
		
	}

  public static  int calculateFac(int num) {
		int counter=0;
	  for(int i=1;i<num;i++)
	  {
		  if(num%i==0)
		  {
			counter++;  
		  }
	  }
	   int anothercounter=0;
	   int []factors=new int[counter];
	   for(int i=1;i<num;i++)
	   {
		   if(num%i==0)
	      {
		   factors[anothercounter]=i;
		   anothercounter++;
		   
	       } 
		   
	   }
	   
	   System.out.println(Arrays.toString(factors));
		 int sum=0;
		 for(int n:factors)
		 sum+=n;
		 return sum;
		 
  }	 
		 
	  
		
	}	
	


