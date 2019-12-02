package com.bridgelabz.fellowshipprogram.algorithm;
/**
* @author Aishwarya Sule
* @date 13/11/2019
* @purpose  one of sorting algorithm that use divide and conquer strategy
*
*/
import java.util.Arrays;

import com.bridgelabz.fellowshipprogram.utility.Utility;

public class Mergesort 
{
	public static void main(String[] args) 
	{
	        int nums[] = {7, -5, 3, 2, 1, 0, 45};
	        System.out.println("Original Array:");
	        System.out.println(Arrays.toString(nums));
	        Utility.sort(nums, 0, nums.length-1);
	        System.out.println("Sorted Array:");
	        System.out.println(Arrays.toString(nums));
	}
}	
	
