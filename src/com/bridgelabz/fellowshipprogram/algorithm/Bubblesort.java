package com.bridgelabz.fellowshipprogram.algorithm;
/**
* @author Aishwarya Sule
* @date 13/11/2019
* @purpose one type sorting algorithm used to sort the elements 
*          ascending order
*
*/
import com.bridgelabz.fellowshipprogram.utility.Utility;

public class Bubblesort 
{
    public static void main(String args[])
    {
    	int i;
    	int arr[]= {10,40,20,60,30};
    for(i=0;i<arr.length;i++)
    	{
    		System.out.println(arr[i]);
    	}
    	Utility.bubble(arr);
    	
    	/*
    	int arr[]=new int [10];
    	System.out.println("enter the element in array");
    	for(i=0;i<arr.length;i++)
    	{
    		arr[i]=Utility.InputInteger();
    	}
    	
		System.out.println(Utility.bubble(arr));
		
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+ " ");
		}
	*/	
    }
}
