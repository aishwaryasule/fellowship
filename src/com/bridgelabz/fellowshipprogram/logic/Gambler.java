package com.bridgelabz.fellowshipprogram.logic;

import com.bridgelabz.fellowshipprogram.utility.Utility;

public class Gambler
{
	public static void main(String[] args) 
	{
    	 int wins=0;
    	 int bets=0;
		System.out.println("enter the stake");
		int stake=Utility.InputInteger();
		  
		System.out.println("enter the goal");
		int  goal=Utility.InputInteger();
		  
		System.out.println("enter the trails");
		int  trial=Utility.InputInteger();
		
        Utility.gammy(stake, goal, trial);
	}

}
