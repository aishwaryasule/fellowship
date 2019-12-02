package com.bridgelabz.fellowshipprogram.functional;
/**
* @author aishwaryasule
* @date 13/11/2019
* @purpose fellowship programs
*
*/
import com.bridgelabz.fellowshipprogram.utility.Utility;

public class Twodiamentional
{
	public static void main(String[] args) 
	{
		
		  System.out.println("enter the row");
		  int row=Utility.InputInteger();
		  System.out.println("enter the column");
		  int column=Utility.InputInteger();
	 System.out.println(Utility.twodarray(row ,column));	
	}
}
