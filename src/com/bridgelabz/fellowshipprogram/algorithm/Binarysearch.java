package com.bridgelabz.fellowshipprogram.algorithm;

import com.bridgelabz.fellowshipprogram.utility.Utility;

/**
 * @author aishwaryasule
 * @date 13/11/2019
 * @purpose fellowship programs
 *
 */
public class Binarysearch 
{
	public static void main(String args[])
	{
		int first=0;
	    String str="a b c d ";
		String[] s=str.split(" ");
	    int n=str.length()-1;
	    //Arrays.sort(s);
		for(String o :s)
		{
			System.out.println(o+ " ");
		}
		 
		System.out.println("enter the word to search");
	   String	x=Utility.InputString();
	   int result=Utility.binarysearch(s,first,n, x);
	   if(result==-1)
	   {
		   System.out.println("word not found");
	   }
	   else
      {
		   System.out.println("word " +x+ " found at " +result );
      } 
	  }
}
