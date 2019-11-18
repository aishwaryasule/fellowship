package com.bridgelabz.fellowship.junit;

import com.bridgelabz.fellowshipprogram.utility.Utility;

public class Wendingmachine 
{
	public static void main(String args[])
	{
	    int notescounter[]=new int[9];
		int notes[]= {2000,500,100,50,20,10,5,2,1,0};
		
		System.out.println("enter the amount");
		int amount=Utility.InputInteger();
		
		Utility.wendingmachine(notes, notescounter,amount);
		
		
	}

	
}
