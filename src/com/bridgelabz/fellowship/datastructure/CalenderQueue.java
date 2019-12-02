package com.bridgelabz.fellowship.datastructure;

import com.bridgelabz.fellowshipprogram.utility.Utility;
/**
* @author Aishwarya Sule
* @date 13/11/2019
* @purpose Calender Queue is done using Enqueue and dequeue with using
*          LinkedList.
*/

public class CalenderQueue
{
   	public static void main(String[] args)
	{
		Utility utility = new Utility();
		System.out.println("Enter the month and year");
		int month = utility.InputInteger();
		int year = utility.InputInteger();
		int[][] calender = Utility.calenderQueue(month,year);
		String[] days = {"S","M","T","W","T","F","S"};
		for(int i=0;i<days.length;i++)
		System.out.print(days[i]+"  ");
		System.out.println();
		LinkedQueue<Integer> list[] = new LinkedQueue[6];
		for(int i=0;i<6;i++)
		{
				list[i]=new LinkedQueue();
		}
	 for(int i=0;i<6;i++) 
		{
				
		for(int j=0;j<7;j++) 
		{
					
		list[i].add(calender[i][j]);
		}
			}
			for(int i=0;i<6;i++)
				list[i].display();
			
			
		}

}
