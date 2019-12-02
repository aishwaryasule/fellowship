package com.bridgelabz.fellowshipprogram.algorithm;

/**
* @author Aishwarya Sule
* @date 13/11/2019
* @purpose By taking range from 0 to 1000 program give 0-1000
*          in range prime number
*
*/
import com.bridgelabz.fellowshipprogram.utility.Utility;

public class primenumber 
{
	public static void main(String args[])
	{
		
		System.out.println("enter the 1st rang");
		int lower_limit=Utility.InputInteger();
		 
		System.out.println("enter the 2nd range");
		int Upper_limit=Utility.InputInteger();
		System.out.println("print the number within range");
		
		Utility.primeno( lower_limit, Upper_limit);
		
		
	}
}
