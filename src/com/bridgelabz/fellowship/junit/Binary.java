package com.bridgelabz.fellowship.junit;

import com.bridgelabz.fellowshipprogram.utility.Utility;

public class Binary {

	public static void main(String[] args) 
	{
int n;
String result[]=new String[100];
		
		System.out.println("Enter Decimal Number: ");
		n=Utility.InputInteger();
		for(int i=0;i<result.length;i++)
		{
		result[i]=Utility.tobinary(n);
		}
		System.out.print("\n Binary Conversion of "+n+" is: ");
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]);
		}
		
		int newNum[]=Utility.swapBinaryNum(result);
		
		int len=newNum.length;
		int decimal=0;
		
		for(int i=len-1;i>=0;i--)
		{
			decimal+=(newNum[i]*(Math.pow( 2,i)));
		}
		System.out.println("\n"+decimal);
	}

}
