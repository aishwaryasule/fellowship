package com.bridgelabz.fellowshipprogram.algorithm;

import com.bridgelabz.fellowshipprogram.utility.Utility;
/**
 * @author aishwaryasule
 * @date   13/11/2019
 * @purpose fellowship programs
 *
 */
public class Insertionsort 
{
	public static void main(String args[])
	{ 
		int i;
		 String arr[]=new String [10];
		 System.out.println("enter element in array");
		 for( i=0;i<arr.length;i++)
		{
			 
			arr[i]=Utility.InputString();
		}
		
	
	//String arr[]= {"sanfrancisco","newyork","omha","california","Atlas","Delas"};
	
    System.out.println(Utility.insertion(arr, arr.length));
	
	for (i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}	
	
	
}
