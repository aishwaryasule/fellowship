package com.bridgelabz.fellowshipprogram.algorithm;

import com.bridgelabz.fellowshipprogram.utility.Utility;

public class Guessno 
{
	public static void main(String args[])
	{
		int count=0;
		int guess=0;
		int a;
		a = 1 + (int) (Math.random() * 99);
	   System.out.println("I am thinking of a number from 1 to 100" + " ... guess what it is ?");
      while (guess != a) 
      {
	        guess = Utility.InputInteger();
	        count++;
	        if (guess > a) 
	        {
	            System.out.println("lower!");
	        } 
	        else if (guess < a) 
	        {
	            System.out.println("higher!");
	        }
	    }
	    System.out.println("Congratulations. You guessed the number with "
	        + count + " tries!");
	}
}
	


