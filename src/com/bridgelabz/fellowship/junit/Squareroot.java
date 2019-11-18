package com.bridgelabz.fellowship.junit;

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
