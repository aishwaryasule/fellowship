package com.bridgelabz.fellowship.junit;

/**
* @author aishwaryasule
* @date 13/11/2019
* @purpose fellowship programs
*
*/
import com.bridgelabz.fellowshipprogram.utility.Utility;

public class Tempratureconversion 
{
	public static void main(String[] args) 
	{
		
		System.out.println("enter your choice");
		int n=Utility.InputInteger();
		
		switch(n)
		{
		case 1:
		{
			
			System.out.println("enter the temprature in celcius");
			int c=Utility.InputInteger();
			Utility.ferenhitetemp(c);
			break;
		}
		case 2:
		{
			System.out.println("enter the temprature in farenhite");
			int f=Utility.InputInteger();
			Utility.celciustemp(f);
			break;
		}	
			
		default:
		{
			System.out.println("enter invalid choice");
		}
			
	}
		}
 }


