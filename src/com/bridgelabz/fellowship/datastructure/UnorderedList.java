package com.bridgelabz.fellowship.datastructure;
import com.bridgelabz.fellowshipprogram.utility.Utility;
import com.bridgelabz.fellowship.datastructure.List;
@SuppressWarnings("unused")
public class UnorderedList 
{
     public static void main(String[] args) throws Exception
     {
			
			Utility utility = new Utility();
			System.out.println("Enter the word to be searched");
			@SuppressWarnings("static-access")
			String userInput = utility.InputString();
			Utility.unOrderedList(userInput);
		}
}
	