package com.bridgelabz.fellowshipprogram.functional;

import com.bridgelabz.fellowshipprogram.utility.Utility;

public class Quadratic 
{
	public static void main(String args[])
	{
	System.out.println("enter the 1st value");
	double a=Utility.InputInteger();
	
	System.out.println("enter the 2nd value");
	double b=Utility.InputInteger();
	
	System.out.println("enter the 3rd value");
	double c=Utility.InputInteger();
	
	System.out.println(Utility.quadratic1(a,b,c));
	}	
}
