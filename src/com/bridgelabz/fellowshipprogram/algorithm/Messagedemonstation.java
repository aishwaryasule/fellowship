package com.bridgelabz.fellowshipprogram.algorithm;
import java.time.LocalDate;
import com.bridgelabz.fellowshipprogram.utility.Utility;
public class Messagedemonstation
{
		public static void main(String[] args) 
		{
	
			String s="Hello <<name>>, We have your full name as <<full name>> in our system. Your contact number is 91-xxxxxxxxxx. Please,let us know in case any clarification. Thank you BridgeLabz 01/01/2016.";
			System.out.println("Enter your full name");
			String s1=Utility.InputString();
			System.out.println("Enter your mobile number");
			String mn=Utility.InputString();;
			LocalDate d=LocalDate.now();
			String sd=d.toString();
			String s2[]=s1.split(" ", 2);
			String firstW=s2[0];               //do it again using regex
			System.out.println(firstW);
			String s3=s.replace("<<name>>", firstW);
			String s4=s3.replace("<<full name>>", s1);
			String s5=s4.replaceAll("xxxxxxxxxx", mn);
			String s6=s5.replace("01/01/2016", sd);
			System.out.println(s6);
			//System.out.println("Hello "+firstW+", We have your full name as "+s1+" in our system. Your contact number is 91-"+mn+". Please,let us know in case any clarification. Thank you BridgeLabz "+d+".");
			

		}
	}
