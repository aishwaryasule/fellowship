package com.bridgelabz.fellowshipprogram.algorithm;
/**
* @author Aishwarya Sule
* @date 13/11/2019
* @purpose program to check both the prime and palindrome of the number.
*
*/
import com.bridgelabz.fellowshipprogram.utility.Utility;

public class Primepalindrome 
{
  public static void main(String args[])
  {
		System.out.println("enter number to be checked");
	  	int n=Utility.InputInteger();
	  	if(Utility.prime(n)==true && Utility.palindrome(n)==true)
		{
			System.out.println("it is prime palindrome");
		}
		else
		{
			System.out.println("it is not a prime palindrome");
		}
		
    }
}

		
		