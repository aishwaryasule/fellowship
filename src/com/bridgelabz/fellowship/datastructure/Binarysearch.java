package com.bridgelabz.fellowship.datastructure;
/**
* @author Aishwarya Sule
* @date 13/11/2019
* @purpose number of binary search can be possible using catalin number formula
*
*/
import com.bridgelabz.fellowshipprogram.utility.Utility;

public class Binarysearch 
{
	public static void main(String[] args) {
	//	Utility utility = new Utility();
		System.out.println("Enter the total number of testcases");
		double testCases = Utility.InputInteger();
		
		while (testCases > 0) {
			System.out.println("Enter total number of nodes");
			double totalNodes = Utility.InputInteger();
			double totalTree = Utility.numberOfBTS(totalNodes);
			System.out.println(totalTree);
			testCases--;
		}
		System.out.println("Ends");
	}
}
