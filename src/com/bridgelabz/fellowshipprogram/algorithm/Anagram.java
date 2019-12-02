package com.bridgelabz.fellowshipprogram.algorithm;
/**
* @author aishwaryasule
* @date 14/11/2019
* @purpose to check wathor user entered string have same number of
*           of characters in it or not
*
*/
import com.bridgelabz.fellowshipprogram.utility.Utility;

public class Anagram 
{
	public static void main(String args[])
	{
		String str1;
		String str2;
	    int len = 0,len1,len2,found=0,not_found=0;
	    
		System.out.println("enter the first string");
	    str1=Utility.InputString();
		  
	    System.out.println("enter the second String");
	    str2=Utility.InputString();
	        
	      len1=str1.length();
		 len2=str2.length();
	if(len1==len2)
    {
			 len=len1;
		for(int i=0;i<len;i++)
		{
			  found=0;
		     for(int j=0;j<len;j++)
		    {
		    	 if(str1.charAt(i)==str2.charAt(j))
		    	 {
		    		 found=1;
		    		 break;
		    	 }
		    }	 
		    	 if(found==0)
		    	 {
		    		 not_found=1;
		    		 break;
		    	 }
		     
		    
		    
	   } 
     if(not_found==1)   
	  {
	     System.out.println("is not a anagram");
	    		
	  }
	 else
	 {
	    System.out.println("is  a anagram");
	 }
  }     
		
}
		
}	
