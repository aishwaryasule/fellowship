package com.bridgelabz.fellowshipprogram.functional;
/**
* @author aishwaryasule
* @date 13/11/2019
* @purpose fellowship programs
*
*/
import com.bridgelabz.fellowshipprogram.utility.Utility;

public class Distance 
{
	public static void main(String[] args)
	{
		System.out.println("enter the value for x");
		int x=Utility.InputInteger();
		
		System.out.println("enter the value for y");
		int y=Utility.InputInteger();
		
        System.out.println(Utility.distance(x, y));
		
	}
}
