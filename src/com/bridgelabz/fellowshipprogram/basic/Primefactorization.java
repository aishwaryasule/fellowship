package com.bridgelabz.fellowshipprogram.basic;
/**
* @author aishwaryasule
* @date 13/11/2019
* @purpose fellowship programs
*
*/
import com.bridgelabz.fellowshipprogram.utility.Utility;

public class Primefactorization 
{
   public static void main(String[] args)
    {
	  System.out.println("enter the number to be factorized");
	  int n=Utility.InputInteger();
	 System.out.println(Utility.factors(n));	

	}
}
