package com.bridgelabz.fellowship.datastructure;
/**
* @author Aishwarya Sule
* @date 13/11/2019
* @purpose Using 2D array print the calender of month.
*
*/
import com.bridgelabz.fellowshipprogram.utility.Utility;

public class Calender 
{
	public static void main(String[] args) {
		System.out.println("Enter month ");
		int month = Utility.InputInteger();
		System.out.println("enter year");
		int year = Utility.InputInteger();
		Utility.calenderQueue(month,year);
		
	}
}
