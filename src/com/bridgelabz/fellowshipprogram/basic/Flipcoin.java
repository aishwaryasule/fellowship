package com.bridgelabz.fellowshipprogram.basic;

/**
* @author aishwaryasule
* @date 13/11/2019
* @purpose fellowship programs
*
*/
import com.bridgelabz.fellowshipprogram.utility.Utility;

public class Flipcoin 
{
	public static void main(String args[])
	{
		int head=0;
	    int  tail=0;
       System.out.println("how many flips the coin makes");
      int flips= Utility.InputInteger();
	   System.out.println(Utility.flip(head,tail));
       
    }
}
