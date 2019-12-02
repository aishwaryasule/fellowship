package com.bridgelabz.fellowship.datastructure;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.bridgelabz.fellowship.datastructure.Hashing;
import com.bridgelabz.fellowshipprogram.utility.Utility;
/*
 * @author:Aishwarya Sule
 * 
 * @Date:26/11/2019
 * 
 */
public class Hashfunction
{
	
	public static void main(String[] args) throws Exception
	{
	     System.out.println("Enter the size");
		 int size = Utility.InputInteger();
		 Hashing hs = new Hashing(size);
		 File file = new File("/home/admin1/Desktop/FellowshipProgramsJavaAishwarya/fellowship programs/src/com/bridgelabz/fellowshipprogram/utility/Myfile.txt");
		 BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		 String StoreFile = "";
		 String readFile;
		 while ((readFile = bufferedReader.readLine()) != null) 
		  {
			
			  StoreFile = StoreFile + " " + readFile ;
		  }
		bufferedReader.close();
		for (String fileInput : StoreFile.split(" ")) 
		{
			int number = Integer.parseInt(StoreFile);
			hs.insert(number);
		}
		System.out.println("Find the number to be searched");
		int value = Utility.InputInteger();
		hs.search(value);
		hs.display();
		hs.write();
	}
}
