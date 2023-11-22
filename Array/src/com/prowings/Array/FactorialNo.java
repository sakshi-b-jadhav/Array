package com.prowings.Array;
//Find the factorial no.
public class FactorialNo 
{
  public static void main(String[] args) {
	int a[]= {2,4,5,7};

	findLargeFac(a);
	  
  }
  public static void findLargeFac(int[] a) 
  {
	int maxNO=findLargeNo(a);
	int fact=1;
	
    for(int i=1;i<=maxNO;i++)
    {
    	fact=fact*i;
    }
	System.out.println(fact);
	
  }
  public static int findLargeNo(int[] a)
  {
	int large=a[0];
	for(int i=1;i<a.length;i++)
	{
	  if(a[i]>large)
	  {
		  large=a[i];
	  }
	}
		return large;
	
	}

}
