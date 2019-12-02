package com.bridgelabz.fellowship.junit;

/**
* @author aishwaryasule
* @date 13/11/2019
* @purpose fellowship programs
*
*/
import com.bridgelabz.fellowshipprogram.utility.Utility;

public class Tobinary 
{
	public static void main(String args[])
	{
		System.out.println("enter the number to be converted to binary");
		int n=Utility.InputInteger();
		 
		Utility.tobinary(n);
		
		
	}
}
