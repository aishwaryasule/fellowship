package com.bridgelabz.fellowshipprogram.utility;

import com.bridgelabz.fellowship.datastructure.List;

public class ArrayList
	{ 
		   @SuppressWarnings("rawtypes")
		List list;

			  public ArrayList(@SuppressWarnings("rawtypes") List l)
			  {
				 this.list=l;
			  }
		  
	   
	   @SuppressWarnings("rawtypes")
	public static void addAllList(Object obj[],int index,List list)
	   {   
		   for(int i=0;i<11;i++)
		   {
		    	  if(i==index)
		    	  {
		    		 obj[i]=(List)list;
		    	  }
		   }
	   }
	   
	   public static void showAll(Object obj[])
	   {
		   for(int i=0;i<11;i++)
		   {
			   System.out.println("  "+obj[i].toString());
		   }
	   }
	}

