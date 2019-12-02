package com.bridgelabz.fellowshipprogram.basic;
/**
* @author aishwaryasule
* @date 13/11/2019
* @purpose fellowship programs
*
*/
import com.bridgelabz.fellowshipprogram.utility.Utility;

public class Replacename
{
		public static void main(String args[])
		{
			String name="Hello <<username>>,how are you?";
			System.out.println("replace username with anyname");
			String change=Utility.InputString();
			Utility.replace_name(name,change);
			
		}
	}

