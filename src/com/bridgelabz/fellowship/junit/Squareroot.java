package com.bridgelabz.fellowship.junit;

/**
* @author aishwaryasule
* @date 13/11/2019
* @purpose fellowship programs
*
*/
import com.bridgelabz.fellowshipprogram.utility.Utility;

public class Squareroot 
{
	public static void main(String args[])
	{
		System.out.println("enter the number");
		double n=Utility.Inputdouble();
		
		Utility.sqrt_newton(n);
		
	}
}
