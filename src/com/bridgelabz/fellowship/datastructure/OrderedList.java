package com.bridgelabz.fellowship.datastructure;
import com.bridgelabz.fellowship.datastructure.List;
import com.bridgelabz.fellowshipprogram.utility.Utility;
@SuppressWarnings("unused")
public class OrderedList 
{
	 public static void main(String[] args) throws Exception 
	 {
		Utility utility = new Utility();
		System.out.println("Enter the number to be searched");
		@SuppressWarnings("static-access")
		String searchItem  = utility.InputString();
		Utility.orderedList(searchItem);
			
	 }
     
}
