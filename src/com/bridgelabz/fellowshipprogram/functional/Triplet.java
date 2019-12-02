package com.bridgelabz.fellowshipprogram.functional;
/**
* @author aishwaryasule
* @date 13/11/2019
* @purpose fellowship programs
*
*/
import com.bridgelabz.fellowshipprogram.utility.Utility;

public class Triplet 
{
	public static void main(String args[])
	{
		System.out.println("enter the no of element you want to enter");
		  int n=Utility.InputInteger();
		  System.out.println("enter all the elements");
		  int arr[]=new int[n];
		  for(int i=0;i<n;i++)
		  {
			 arr[i]=Utility.InputInteger();
		  }
		  System.out.println("the target you want to enter");
		  int target=Utility.InputInteger();
	System.out.println(Utility.triplet(n,arr,target));
	}	
}
