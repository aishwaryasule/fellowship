package com.bridgelabz.fellowshipprogram.basic;

import com.bridgelabz.fellowshipprogram.utility.Utility;

public class Harmonicno 
{
	public static void main(String args[])
	{
         System.out.println("enter the no to find harmonic series");
		 int n=Utility.InputInteger();
		System.out.println(Utility.harmonicno(n));
	}
}
