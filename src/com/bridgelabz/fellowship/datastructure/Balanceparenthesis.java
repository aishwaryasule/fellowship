package com.bridgelabz.fellowship.datastructure;

import com.bridgelabz.fellowshipprogram.utility.Utility;

public class Balanceparenthesis 
{
	public static void main(String args[])
	{
	 
	  String str="{[10*4]+(10/2)-[20+5]*4}";
	  char exp[]=str.toCharArray();

	  if(Utility.areparenthesisbalance(exp))
	  {
		  System.out.println("they are balanced");
	  }
	  else
	  { 
		  System.out.println("they are not balanced");
	  }
			   
	}
}
