package com.bridgelabz.fellowshipprogram.basic;
/**
* @author aishwaryasule
* @date 13/11/2019
* @purpose fellowship programs
*
*/
import com.bridgelabz.fellowshipprogram.utility.Utility;

public class Leapyear 
{
	public static void main(String[] args) 
	{
		 System.out.println("enter the year to check if it is leap year or not");
		   int year=Utility.InputInteger();
		   
		System.out.println(Utility.year(year));
	}
}
