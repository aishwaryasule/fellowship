package com.bridgelabz.fellowship.datastructure;

import com.bridgelabz.fellowshipprogram.utility.Utility;

/**
* @author:Aishwarya Sule
* @date:23/11/2019
* @purpose:Banking CashCounter is done using functions of enqueue and dequeue
*          for cash withdrawal and deposite. 
*
*/
class Cashcounter
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("Enter total number of people");
		int numberOfPeople = Utility.InputInteger();
		int cashBalance = utility.bankCashCounter(numberOfPeople);
		System.out.println("Cash Balance : "+cashBalance);
	}
}
