package com.bridgelabz.fellowshipprogram.algorithm;

import com.bridgelabz.fellowshipprogram.utility.Utility;
/**
 * @author Aishwarya Sule
 * @date   13/11/2019
 * @purpose one of the sorting algorithm to search and sort element 
 *          and display
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
