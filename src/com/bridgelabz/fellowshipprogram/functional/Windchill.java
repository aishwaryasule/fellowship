package com.bridgelabz.fellowshipprogram.functional;

import com.bridgelabz.fellowshipprogram.utility.Utility;

public class Windchill 
{
	public  static void main(String args[])
		{
		  System.out.println("enter the temprature");
		 double t=Utility.InputInteger();
		 
		 System.out.println("enter the speed");
		 double v=Utility.InputInteger();
		 
		 System.out.println(Utility.wind(t,v));
	} 

}
