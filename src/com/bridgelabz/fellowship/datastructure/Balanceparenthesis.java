package com.bridgelabz.fellowship.datastructure;
import java.util.Scanner;

/**
* @author aishwaryasule
* @date 13/11/2019
* @purpose check wether entered parenthesis are balanced or not
*
*/
import com.bridgelabz.fellowshipprogram.utility.Utility;

/*@author Aishwarya Sule
 * 
 * @date:20/11/2019
 * 
 */
public class Balanceparenthesis 
{
		public static void main(String[] args)  
	    { 
			Scanner sc=new Scanner(System.in);
	  System.out.println("enter the expression");
	   String str=sc.nextLine();
	   char exp[]=str.toCharArray();
  
	  if(Utility.parenthesisBalanced(exp))
	  {
		  System.out.println("they are balanced");
	  }
	  else
	  { 
		  System.out.println("they are not balanced");
	  }
  }  
}

