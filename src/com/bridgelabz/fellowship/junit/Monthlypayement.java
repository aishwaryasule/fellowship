package com.bridgelabz.fellowship.junit;

import com.bridgelabz.fellowshipprogram.utility.Utility;

public class Monthlypayement {

	public static void main(String[] args)
	{
		double year,interest,principal;
		
		
		System.out.println("enter the year");
		year=Utility.Inputdouble();
		
		System.out.println("enter the interest");
		interest=Utility.Inputdouble();
		
		System.out.println("enter the principal");
		principal=Utility.Inputdouble();
		
		 Utility.monthlypayement(interest, year, principal);
	}

}
