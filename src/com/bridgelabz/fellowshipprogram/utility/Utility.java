package com.bridgelabz.fellowshipprogram.utility;
import java.util.*;
import java.util.Collection;
import java.util.Queue;
//import java.util.LinkedList;     
import com.bridgelabz.fellowship.datastructure.LinkedQueue;
import com.bridgelabz.fellowship.datastructure.LinkedStack;
import com.bridgelabz.fellowship.datastructure.MyQueue;
import com.bridgelabz.fellowshipprogram.utility.Utility.Node.*; 
//import com.bridgelabz.fellowshipprogram.utility.LinkedList.*;
import com.bridgelabz.fellowship.datastructure.List;



import java.io.*;
public class Utility 
{
    static Scanner sc=new Scanner(System.in);  //for taking data from user
	private static int y;
	public static Object hashing;
	public static boolean InputBoolean()
	{
		return sc.nextBoolean(); 
			
	}
	public static int InputInteger()
	{
		return sc.nextInt();
	}

	public static double Inputdouble()
	{
		return sc.nextDouble();
	}

	public static String InputString()
	{
		return sc.nextLine();
	}

	public static long InputLong()
	{
		return sc.nextLong();
	}
	
	
	//***********************Basic programming******************//
	public static String replace_name(String name,String change)
	{
		String result=name.replace("<<username>>",change);   //replace function used to replace given string
		System.out.println(result);
		return result;
	}

	public static int flip(int head,int tail)
	{
		
		double randnum=0.0;
		double counter=1;

		int flips=0;
		while(counter<=flips)
		{
			randnum=Math.random();  //random function used to generate 
									// random numbers
			System.out.println(counter +"/t" +randnum );
			if(randnum<0.5)         //loop executes till condition get false
			{
				head++;   
				System.out.println("/t heads");

			}
			else
			{
				tail++;
				System.out.println("/t tails");
			}
			counter++;
		} 

		return  0;
	}

	public static boolean year(int year)
	{
		while(year<999 || year>9999)
		{
			System.out.println("Entered input is not valid");
		}

		if( year%4==0 && year%100!=0 && year%400==0)  /*leap year comes 
			                                          after every 4 year the condition 	                                          condition checks same*/
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static double harmonicno(int n)
	{
		float harmonic=1; // intialize
		for(int i=2;i<n;i++)
		{
			//( forumula  
		    // Hn = H1 + H2 + H3 ... + Hn-1 + Hn-1 + 1/n )
			harmonic=(harmonic+(float)1/i); 
		}
		return harmonic;
	}
	public static int power(int counter,int n)
	{
		counter=0;
		int power=1;


		if(n>=0 && n<31) /*condition to check no should not be greater
			             than 31*/
		{
			while(counter<=n)
			{
				System.out.println("2^" +counter+ "=" +power);
				power=power*2;
				counter++;
			}
		}
		else
		{
			System.out.println("the count must be less than n or equal to 31");
		}
		return 0;
	}
	public static int factors(int n)
	{

		for(int i=2;i<n;i++)  //for loop to check factor
		{
			while(n%i==0)    //condition to find prime
			{
				System.out.println(""+i);
				n=n/i;       
			}
		}	  
		if(n>2)
		{
			System.out.println("display the factors"+n);
		}

		return 0;
	}
	//*************************functional programs*********************//

	/**@Purpose:Insertion sort is used to sort the data by inserting data into list  and 
	 *          list should move from small to last.
	 *  @param: String arr[] is used to take the array of letters in a list.
	 *           n is the number of String letters to be sort.        
	**/
	public static int twodarray(int row,int column)
	{
		int arr[][]=new int[3][3];
		System.out.println("number of"+row*column+"in 2d array");
		for(int i=0;i<row;i++)    //for loop for row
		{
			for(int j=0;j<column;j++) //for loop for column
			{
				arr[i][j]=InputInteger(); 
			}
		}
		System.out.println("display the array"); //display 2d array
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print("" +arr[i][j]);
			}
			System.out.println();
		}

		return 0;
	}
	public static int triplet(int n, int arr[],int target)
	{


		for(int i=0;i<n-2;i++) 
		{
			for(int j=i+1;j<n-1;j++)  
			{
				for(int k=j+1;k<n;k++) 
				{
					if(arr[i]+arr[j]+arr[k]==target)
					{
						System.out.println("target found at" +i+ "\t" +j+ "\t" +k+ "\t");
					}
				}
			}
		}	  

		System.out.println("element not found"); 
		return 0;
	}	 
	public static  double distance(double x,double y)
	{
		double  distance=Math.pow(x,2);
		double distance2=Math.pow(y,2);
		int res=(int) Math.sqrt(distance+distance2); //formula to find distance
		return res;
	}

	public static int quadratic1(double a,double b,double c)
	{
		double delta=b*b-4*c*c;

		if(delta>=0.0)
		{
			double Root1 =((-b + Math.sqrt(delta))/(2*a));  //root1 formula

			double Root2 =((-b - Math.sqrt(delta))/(2*a));  //root2 formula

			System.out.println("print"+Root1+ "values" +Root2);
		}
		else if(delta==0.0)
		{
			double root1=-b/(2.0*a);
			System.out.println(root1);

		}    
		else
		{
			System.out.println("root are not real");
		}
		return (int) delta;  
	}

	public static double wind(double t,double v)
	{
		double windchill=35.74 + 0.6215 * t - 35.75 * //windchill formula
				Math.pow(v, 0.16) + 0.4275 * t *
				Math.pow(t, 0.16);
		return windchill;	
	}
	//***********************************************logical programming******************************************//

	/**@Purpose:Insertion sort is used to sort the data by inserting data into list  and 
	 *          list should move from small to last.
	 *  @param: String arr[] is used to take the array of letters in a list.
	 * n is the number of String letters to be sort.
	**/ 
	
	public static void gammy(int stake,int goal,int trial)
	{	
		//stake=0;
		//goal=0;
		//trial=0;
		int  wins = 0;
		int bets = 0;
		for(int t=0;t<trial;t++)  //no. trials taken by user
		{
			int cash=stake;

			while(cash>0 && goal>cash)
			{
				bets++;
				if(Math.random()<0.5) //randomly generated data
				{
					cash++;
				}
				else
				{
					cash--;
				}
			}
			if(cash==goal) //cash equals goal then user wins
			{
				wins++;
			}

		}
		System.out.println(wins+ "wins of"+trial);
		System.out.println("percentage of wins"+ 100.0*wins/trial);
		System.out.println("average percentage of wins" +0.1*bets/trial);


	}
	/**@Purpose:Insertion sort is used to sort the data by inserting data into list  and 
	 *          list should move from small to last.
	 *  @param: String arr[] is used to take the array of letters in a list.
	 *           n is the number of String letters to be sort.        
    **/
	public static int coupan(int num)
	{
		int max=10;

		for(int i=0;i<num;i++) //coupan generation
		{
			String str="";    //string initialize


			for(int j=0;j<10;j++) //coupan number generation
			{
				double d=Math.random();   /*randomly generating coupan
                                          without any doublication */
				int random=(int)(d*max);  
				/*maximum number of coupan generated*/
				str+=random;
			}
			System.out.println(str);


		}
		return num;

	}
	/**
	@Purpose:Insertion sort is used to sort the data by inserting data into list  and 
	 *          list should move from small to last.
	 *  @param: String arr[] is used to take the array of letters in a list.
	 *           n is the number of String letters to be sort.        
    **/
	public static long stopwatch()
	{
		long  starttime=0; 
		long  stoptime=0;
		long elapsedtime=0;

		starttime=System.currentTimeMillis(); //method for cuurent time generation

		System.out.println("enter 0 to stop");
		stoptime=Utility.InputLong();     

		stoptime=System.currentTimeMillis(); 

		elapsedtime=(stoptime-starttime)/1000; //formula generated for elapsed time

		return elapsedtime;

	}			  


	//**************************algorithm programming******************//

	public static  int  binarysearch(String s[],int first,int last,String x)
	{
		int mid=first+last/2;
		if(last>first)
		{
			int compare;

			if(s[mid]==x)
			{
				return mid;	  
			}
			compare=x.compareTo(s[mid]);
			if(compare>0)
			{
				binarysearch(s,mid+1,last,x);

			}
			else
			{
				binarysearch(s,first,mid-1,x);
			}


		}
		return mid;

	}
	
	/**
	 * @Purpose:Insertion sort is used to sort the data by inserting data into list  and 
	 *          list should move from small to last.
	 *  @param: String arr[] is used to take the array of letters in a list.
	 *           n is the number of String letters to be sort.        
  
   **/
	public static String insertion(String arr[],int n)
	{
		String temp=" ";     //for storing temperory data
		for(int i=0;i<n;i++)  //index number
		{
			for(int j=i+1;j<n;j++) // position of string present in array
			{
				if(arr[i].compareToIgnoreCase(arr[j])>0) //compairing element with one anthor
				{
					temp=arr[i]; //swapping done for sorting
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		return temp;
	}
	/**
	 * @Purpose:Bubble sort is used to sort the data by sorting largest  element  in list first and 
	 *          then sorting remaining list by taking passes.
	 *  @param: arr[] is used for storing number into the list.
	 *           .        
	 * @return 
    **/
	public static int bubble(int arr[])
	{
		int i,j;  
		int temp; //tempering storing
		for(i=0;i<arr.length;i++)
		{
			for(j=1;j<arr.length-1;j++) //for loop for length
			{
				if(arr[j]>arr[j+1])  //compairing first element with the other one
				{
					temp=arr[j];     //swaping for sorting purpose
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		for( i=0;i<arr.length;i++) //display sorted list
		{
			System.out.println(arr[i]); 
		}
		return 0;

	}
	
	/**
	@Purpose:Insertion sort is used to sort the data by inserting data into list  and 
	 *          list should move from small to last.
	 *  @param: String arr[] is used to take the array of letters in a list.
	 *           n is the number of String letters to be sort.
	**/ 
	
  public static int merge(int nums[], int left, int m, int right)
	{
		int n1 = m - left + 1; 
		int n2 = right - m;

		int Left_part_arra[] = new int [n1];
		int Right_part_arra[] = new int [n2];

		for (int i=0; i<n1; ++i)
			Left_part_arra[i] = nums[left + i];
		for (int j=0; j<n2; ++j)
			Right_part_arra[j] = nums[m + 1+ j];

		int i = 0, j = 0;

		int k = left;
		while (i < n1 && j < n2)
		{
			if (Left_part_arra[i] <= Right_part_arra[j])
			{
				nums[k] = Left_part_arra[i];
				i++;
			}
			else
			{
				nums[k] = Right_part_arra[j];
				j++;
			}
			k++;
		}

		while (i < n1)
		{
			nums[k] = Left_part_arra[i];
			i++;
			k++;
		}

		while (j < n2)
		{
			nums[k] = Right_part_arra[j];
			j++;
			k++;
		}
		return 0;
	}

	// merge()
	public static int sort(int nums[], int left, int right)
	{
		if (left < right)
		{
			// Find the middle point
			int m = (left+right)/2;

			// Sort first halve
			sort(nums, left, m);
			// Sort second halve
			sort(nums , m+1, right);

			// Merge the sorted halves
			merge(nums, left, m, right);
		}
		return 0;
	}
	/**@Purpose:Insertion sort is used to sort the data by inserting data into list  and 
	 *          list should move from small to last.
	 *  @param: String arr[] is used to take the array of letters in a list.
	 *           n is the number of String letters to be sort.        
   **/
	public static boolean primeno(int lower_limit,int Upper_limit)
	{
	  int i,j,n=0;
	  int flag=0;
	  for( i=lower_limit;i<=Upper_limit;i++) // range between low and high value
	  {	
		 for( j=2;j<i;j++) //for loop prime number logic
		 {
			if(i%j==0)
			{
				if(flag==0)
				break;
			}
			else
			{
				flag=1;
			}	 
		 }
		
		 if(flag==1)
         {
			 System.out.println(i);
		  }
			

	  }
	
	  return false;
	}
	/**@Purpose:Insertion sort is used to sort the data by inserting data into list  and 
	 *          list should move from small to last.
	 *  @param: String arr[] is used to take the array of letters in a list.
	 *          n is the number of String letters to be sort.
	**/                   
	public static boolean prime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++) 
        {
            if(n%i==0)
                c++;
        }
        
        if(c==2)
            return true;
        else
            return false;
    }
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	public static boolean palindrome(int n)
	{
		int rev = 0;
		int temp=0;
		while(temp!=0)
		{
			rev=rev*10+(temp/10); //rev list to see if palindrome possible
			 temp=temp/10; // first 2 element
		}
		if(rev==temp)   //if equal palindrome possible
		{
			return true;
		}
		else
		{
			return false;
	     
		}
				
	}
	//******************************Junit programming********************************************//
    /** 
	 * @perpose
	 * 
	 *@paramm
	**/
	public static int wendingmachine(int notes[],int notecounter[],int amount)
	{
		 int notescounter[]=new int[9]; //count the no of notes
		 int len=notes.length;         //length of array 
	     
	       for(int i=0;i<9;i++)  //count the no. of notes
	       {
	    	  if(amount>=notes[i]) //if amount is greater
	    	 {
	    	      notescounter[i]=amount/notes[i]; 
	    	      amount=amount-notescounter[i]*notes[i]; //note will be calculated
	    	  }
	    	  else
	    	  {  
	    		  notescounter[i]=notes[len-1]; // if amount is less than length reduce by 1
	    	  }
	    	   
	       }
	       System.out.println("count of notes");
	       for(int i=0;i<9;i++)
	       {
	    	   System.out.println(notescounter[i]+ ":" +notes[i]); //total count of notes is printed
	    	   
	       }
	       return len;
	}
	
	/**
	 *@purpose
	 *
	 *@param
	**/ 
	public static int ferenhitetemp(int c)
	{
		int f;
		f=(c*9/5)+32; //formula to calculate farenhite
		System.out.println(f);
		return f;
	}
	public static int celciustemp(int f)
	{
		int c;
		c=(f-32)*5/9; //formula to calculate celcius
		System.out.println(c);
		return c;
	}
	/**
	 * 
	 * 
	 * 
	**/
	public static  double monthlypayement(double interest,double year,double principal)
	{
		  double payment;
		  interest = interest/(12*100); //formula for interest
		  year=year*12;
		  payment = ((principal*interest*Math.pow(1+interest, year))/(Math.pow(1+interest,year)-1));
		  System.out.println("monthly payment is" +payment); //payment calculations
		  return payment;
	}
	/**
	 * @purpose
	 * 
	 * 
	 *@param 
	 **/
	
	public static String tobinary(int n)
	{
       int result;
	   String a=" "; //initializing string
	   while(n>0)
	   {
		    result=n%2; //mod 0f 2 to get binary values
		     a=result+ " " +a; //print result
		     n=n/2;
				  
	   }
	   System.out.println(a);
	     

	    return a;
	    
		
	}
	/**
	 * @purpose
	 * 
	 * @param
	 **/ 
	public static double sqrt_newton(double n)
	{
		
		double eps=1e-15; //print newton method
		double x=1;
		for(;;)
		{
			double nx=(x+n/x)/2;
			if(Math.abs(x-nx)<eps)
				break;
			x=nx;
		}
		
		System.out.println(x);
	 return x;
	}
   
	/**
	 * 
	 * 
	 * 
	 **/

	public int dayOfWeek(double m, double d, double y) 
	{
		double y0 = y - ((14 - m) / 12);
		double x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
		double m0 = m + 12 * ((14 - m) / 12) - 2;
		double d0 = (d + x + (31 * m0 / 12)) % 7;
		return (int)d0;
	}	
	/**
	 * 
	 * 
	 * 
	 * */
	
	 public static int[] swapBinaryNum(String result[])
	{
		String arr1[]=new String[4];  //string 1
		String arr2[]=new String[4];  //string 2
		String newbinary[]=new String[8];
		for(int i=0;i<4;i++) 
		{
			arr1[i]=result[i];
		}
		int j=0;
		for(int i=4;i<8;i++)
		{
			arr2[j]=result[i];
			j++;
		}	
		for(int i=0;i<4;i++)
		{
			newbinary[i]=arr2[i];
		}
		j=0;
		for(int i=4;i<8;i++)
		{		
			newbinary[i]=arr1[j];
			j++;
		}
		System.out.print("\n After Swapping binary number is=");
	    for(int i=0;i<8;i++)
		{
			System.out.print(newbinary[i]);
		}
		return null;
		
}
	 
// **************************************Data structue****************************************//	 
	/**
	 * 
	 * @author admin1
	 *
	 **/
	 static class stack  
	    { 
	        int top=-1;         //top of stack
	        char items[] = new char[100];  //maximum storage in array
	  
	        void push(char x)   //push method
	        { 
	            if (top == 99)  
	            { 
	                System.out.println("Stack full"); 
	            }  
	            else 
	            { 
	                items[++top] = x;  //if stack not empty add element to stack
	            } 
	        } 
	  
	        char pop()  
	        { 
	            if (top == -1)  
	            { 
	                System.out.println("Underflow error"); 
	                return '\0'; 
	            }  
	            else 
	            { 
	                char temp = items[top];  //top item need be poped
	                top--;     //remove element
	                return temp; 
	            } 
	        } 
	  
	        boolean isEmpty()  
	        { 
	            return (top == -1) ? true : false; //check condition
	        } 
	    } 
	      
	    
	    static boolean matchingPair(char input1, char input2) 
	    { 
	       if (input1 == '(' && input2 == ')') //balancing parenthesis
	         return true; 
	     
	       else
	         return false; 
	        
	    } 
	      
	   /**
	    * @purpose: Balance parenthesis is used to check wether the the stack is containing data
	    *           is having balanced number of parenthesis or not. 
	    * @param  expression is passed to check they are balanced or not.
	   **/
	    public static boolean parenthesisBalanced(char exp[]) 
	    { 
	       /* Declare an empty character stack */
	       stack st=new stack(); 
	       
	       
	       for(int i=0;i<exp.length;i++)  //exp length
	       { 
	            
	          
	          if ( exp[i] == '(' )  //if ( push into stack
	            st.push(exp[i]); 
	       
	          
	          if ( exp[i] == ')' ) //if close then pop from the stack
	          { 
	                   
	              
	             if (st.isEmpty())  //if empty then return nothing
	               { 
	                   return false; 
	               }  
	       
	            
	             else if (!matchingPair(st.pop(), exp[i]) ) //condition to check elements if poped or not
	               { 
	                   return false; 
	               } 
	          } 
	            
	       } 
	          
	     
	       if (st.isEmpty())  //if stack empty then return nothing
	         return true; 
	         {  
	             return false; 
	         }  
	    }  
 /**
  * 
  *	      
  * @param inputstring
  */
/*	      
public static void palindromechecker(String inputstring)
{
	LinkedList queue=new LinkedList(); //object created for queue
	for(int i=inputstring.length()-1;i>=0;i--) //reverse list in for loop
	{ 
	      queue.add(inputstring.charAt(i));
	}

	 String reversestring=" ";
	 
	 while(!queue.isEmpty())
	 {
		 reversestring=reversestring + queue.remove(); //compare elements
	 }
	
	if(inputstring.equals(reversestring)) //if user input string = to reverse string then its palindrome
	 {
		 System.out.println("string is not palindrome");
	 }
	 else
	 {
		 System.out.println("string is  palindrome");
	 }
  }
 /* 
/*
 * @purpose
 * 
 * @param
 */

public static void primearray()
{
	int[][] array = new int[10][100];  //for storing 1000 elements
	int[][] prime = new int[10][100]; //for stroring 1000 prime numbers
	int z = 1;
	for (int i = 0; i < 10; i++)     
	{
		
		for (int j = 0; j < 100; j++) 
		{
			array[i][j] = z;
			z++;
		}
	}
	for (int i = 0; i < 10; i++) //for loop for column
	{
		
		for (int j = 0; j < 100; j++) //for loop for rows
		{
			if (prime(array[i][j])) //prime number array
			{
				prime[i][j] = array[i][j];
			} else 
			{
				prime[i][j] = -1;
			}
		}
	}
	for (int i = 0; i < 10; i++) 
	{
		for (int j = 0; j < 100; j++) 
		{
			if (prime[i][j] != -1)
				System.out.print(prime[i][j] + " "); //call the method of prime
		}
		System.out.println();
	}

}
/*
 * @purpose: number of binary search tree is from one binary tree how many binary trees can 
 *           be formed.
 * 
 * @param: parameter passed are totalNodes in a tree.
 */

public static double numberOfBTS(double totalNodes)
{
	double numerator = factorial(2 * totalNodes); //catalin number formula
	double denominator = (factorial(totalNodes + 1)) * (factorial(totalNodes)); //catalin number denominator formula
	double differentTrees = numerator / denominator; //difference is used to calculate the nodes
	return differentTrees;
}

public static double factorial(double i) 
{
	double fact = 1;  //factorial logic
	while (i > 0) 
	{  
		fact = fact * i;   //to find the factorial number
		i--;
	}
	return fact;
}
/*
 * @purpose: Calender is used to check which is current month is going
 *           and also checks which week of day it is.
 * 
 * @param: month and year is passed as parameter to check  year showing months 
 *         and days in it.
 *        
 */
	
public static void Calender(int month, int year)  //passed parameters are 
{
	int year1, month1, x, day = 1, day1;
	year1 = year - (14 - month) / 12;   //logic to find day of week
	x = year1 + (year1 / 4) - (year1 / 100) + (year1 / 400);
	month1 = month + 12 * ((14 - month) / 12) - 2;
	day1 = (day + x + (31 * month1) / 12) % 7;
	String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
			"October", "November", "December" };
	int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	int monthDay = 0;
	for (int i = 0; i < monthDays.length; i++) 
    {
		if (i == month - 1) 
		{
			monthDay = monthDays[i];
		}
	}
	int[][] totalDays = new int[6][7];
	
	if ( month == 2) 
	{
		monthDay = 29;
	}
	int z = 1;
	for (int i = 0; i < 6; i++) 
	{
		for (int j = 0; j < 7; j++) //for loop for dayofweeks
		{
			if (i == 0 && j < day1) 
			{
				totalDays[i][j] = -1;
			} else if (z <= monthDay) 
			{
				totalDays[i][j] = z;
				z++;
			} else 
			{
				totalDays[i][j] = -1;
			}
		}
	}
	for (int i = 0; i < 12; i++) 
	{
		if (month == i + 1) 
		{
			System.out.print(monthName[i] + " " + year); //month to be find.
		}
	}
	System.out.println();
	String[] dayName = { "S", "M", "T", "W", "T", "F", "S" };
	for (int i = 0; i < 7; i++) 
	{
		System.out.print(dayName[i] + "  ");
	}
	System.out.println();
	for (int i = 0; i < 6; i++) 
	{
		for (int j = 0; j < 7; j++)
		{
			if (totalDays[i][j] != -1) 
			{
				if (totalDays[i][j] < 10)
					System.out.print(totalDays[i][j] + "  ");
				else
					System.out.print(totalDays[i][j] + " ");
			} else
				System.out.print("   ");
		}
		System.out.println();
	}
}
public static boolean leapYear(int year) 
{
	if (year % 100 != 0 && year % 4 == 0 && year%400==0) //leap year logic
	return true;
	
    return false;
}
/*@purpose: Prime anagram in the 2d format is to be done  where anagram 
 *          logic will be required. 
 * @param: Int prime number array is passed to find the prime numbers.
 * 
 */
public static void primeAnagram2DArray(int[] prime) {
	boolean z;
	int count = 0, countAna = 0;
	for (int i = 0; i < prime.length; i++) {
		for (int j = i + 1; j < prime.length; j++) {
			z = numberCheck(prime[i], prime[j]);

			if (z && count == 0) {
				countAna++;
				count++;
				z = false;
			}

		}
		if (count > 0) {
			countAna++;
			count = 0;
		}
	}
	int[] anagramTotal = new int[countAna];
	int x = 0;
	for (int i = 0; i < prime.length; i++) {
		for (int j = i + 1; j < prime.length; j++) {
			z = numberCheck(prime[i], prime[j]);

			if (z && count == 0) {
				anagramTotal[x] = prime[j];
				x++;
				count++;
				z = false;
			}

		}
		if (count > 0) {
			anagramTotal[x] = prime[i];
			x++;
			count = 0;
		}
	}

	for (int i = 0; i < anagramTotal.length; i++) 
	{
		for (int j = 0; j < anagramTotal.length - 1; j++) 
		{
			if (anagramTotal[j] > anagramTotal[j + 1])
			{
				int temp = anagramTotal[j];
				anagramTotal[j] = anagramTotal[j + 1];
				anagramTotal[j + 1] = temp;
			}
		}
	}

	for (int i = 0; i < anagramTotal.length; i++) 
	{
		for (int j = 0; j < anagramTotal.length - 1; j++) 
		{
			if (anagramTotal[j] == anagramTotal[j + 1]) 
			{
				anagramTotal[j + 1] = -1;
			}
		}
	}
	int positive = 0;
	for (int i = 0; i < anagramTotal.length; i++) 
	{
		if (anagramTotal[i] != -1)
			{
			positive++;
		}
	}		
	int[] ana = new int[positive + 1];
	int zz = 1;
	int yy = 0;
	for (int i = 0; i < anagramTotal.length; i++)
	{
		if (anagramTotal[i] != -1) {
			ana[yy] = anagramTotal[i];
			yy++;
		}
	}

	int[][] total = new int[10][100];
	for (int i = 0; i < 10; i++) 
	{
		for (int j = 0; j < 100; j++)
		{
			total[i][j] = zz;
			zz++;
		}
	}
	int xx = 0;
	for (int i = 0; i < 10; i++) 
	{
		for (int j = 0; j < 100; j++) 
		{
			if (ana[xx] == total[i][j] && xx < ana.length)
			{
				total[i][j] = ana[xx];
				xx++;
			} else 
			{
				total[i][j] = -1;
			}
		}
	}
	for (int i = 0; i < 10; i++) 
	{
		for (int j = 0; j < 100; j++) 
		{
			if (total[i][j] != -1) 
			{
				System.out.print(total[i][j] + " ");
			}
		}
		System.out.println();
	}
}

/* @purpose: NumberCheck methods is used to check wether the number 
 *           which belongs to prime anagram or not.
 * @param:  Value one and value two are two references given to compare the value.
 */

public static boolean numberCheck(int valueOne, int valueTwo) 
{
	String a = Integer.toString(valueOne);
	String b = Integer.toString(valueTwo);
	char c[] = a.toCharArray();
	char d[] = b.toCharArray();
	a = arrange(c);
	b = arrange(d);
	return a.equals(b);
}

public static String arrange(char[] c) 
{
	String s = "";
	for (int i = 0; i < c.length; i++) {
		for (int j = 0; j < c.length - 1; j++) {
			if (c[j] > c[j + 1]) {
				char temp = c[j];
				c[j] = c[j + 1];
				c[j + 1] = temp;
			}

		}
	}
	for (int i = 0; i < c.length; i++) {
		s = s + c[i];
	}
	return s;
}
/*@purpose: primeAnagramQueue is the same anagram method but have used queue technique 
 *          to perform the operations.
 * 
 * @param: prime number array is passed.
 */

public static void primeAnagramQueue(int[] prime)
{
	boolean z;
	int count = 0, countAna = 0;
	for (int i = 0; i < prime.length; i++) {
		for (int j = i + 1; j < prime.length; j++)
		{
			z = numberCheck(prime[i], prime[j]);

			if (z && count == 0) {
				countAna++;
				count++;
				z = false;
			}

		}
		if (count > 0) 
		{
			countAna++;
			count = 0;
		}
	}
	int[] anagramTotal = new int[countAna];
	int x = 0;
	for (int i = 0; i < prime.length; i++) 
	{
		for (int j = i + 1; j < prime.length; j++) {
			
			z = numberCheck(prime[i], prime[j]);
			if (z && count == 0) {
				anagramTotal[x] = prime[j];
				x++;
				count++;
				z = false;
			}

		}
		if (count > 0) {
			anagramTotal[x] = prime[i];
			x++;
			count = 0;
		}
	}

	for (int i = 0; i < anagramTotal.length; i++) {
		for (int j = 0; j < anagramTotal.length - 1; j++) {
			if (anagramTotal[j] > anagramTotal[j + 1]) {
				int temp = anagramTotal[j];
				anagramTotal[j] = anagramTotal[j + 1];
				anagramTotal[j + 1] = temp;
			}
		}
	}

	for (int i = 0; i < anagramTotal.length; i++) 
	{
		for (int j = 0; j < anagramTotal.length - 1; j++) 
		{
			if (anagramTotal[j] == anagramTotal[j + 1]) 
			{
				anagramTotal[j + 1] = -1;
			}
		}
	}
	int positive = 0;
	for (int i = 0; i < anagramTotal.length; i++) 
	{
		if (anagramTotal[i] != -1) 
		{
			positive++;
		}
	}
	int[] ana = new int[positive + 1];
	int zz = 1;
	int yy = 0;
	for (int i = 0; i < anagramTotal.length; i++) 
	{
		if (anagramTotal[i] != -1) 
		{
			ana[yy] = anagramTotal[i];
			yy++;
		}
	}
	LinkedQueue<Integer> listQueue = new LinkedQueue<Integer>();
	for (int i = 0; i < ana.length-1; i++) {
		listQueue.add(ana[i]);
	}
	listQueue.display();
 }
/*@purpose: primeanagram is to be done using linkedlist with stack functions
 * 
 * @param: prime array is passed in the list.
 * 
 */

public static void primeAnagramLinkedListStack(int[] prime)
{
	boolean z;
	int count = 0, countAna = 0;
	for (int i = 0; i < prime.length; i++)
	{
		for (int j = i + 1; j < prime.length; j++) 
		{
			z = numberCheck(prime[i], prime[j]);

			if (z && count == 0) {
				countAna++;
				count++;
				z = false;
			}

		}
		if (count > 0) 
		{
			countAna++;
			count = 0;
		}
	}
	int[] anagramTotal = new int[countAna];
	int x = 0;
	for (int i = 0; i < prime.length; i++) 
	{
		for (int j = i + 1; j < prime.length; j++) 
		{
			z = numberCheck(prime[i], prime[j]);

			if (z && count == 0)
			{
				anagramTotal[x] = prime[j];
				x++;
				count++;
				z = false;
			}

		}
		if (count > 0)
		{
			anagramTotal[x] = prime[i];
			x++;
			count = 0;
		}
	}

	for (int i = 0; i < anagramTotal.length; i++) 
	{
		for (int j = 0; j < anagramTotal.length - 1; j++)
		{
			if (anagramTotal[j] > anagramTotal[j + 1])
			{
				int temp = anagramTotal[j];
				anagramTotal[j] = anagramTotal[j + 1];
				anagramTotal[j + 1] = temp;
			}
		}
	}

	for (int i = 0; i < anagramTotal.length; i++) 
	{
		for (int j = 0; j < anagramTotal.length - 1; j++) 
		{
			if (anagramTotal[j] == anagramTotal[j + 1])
			{
				anagramTotal[j + 1] = -1;
			}
		}
	}
	int positive = 0;
	for (int i = 0; i < anagramTotal.length; i++) 
	{
		if (anagramTotal[i] != -1)
		{
			positive++;
		}
	}
	int[] ana = new int[positive + 1];
	int zz = 1;
	int yy = 0;
	for (int i = 0; i < anagramTotal.length; i++) 
	{
		if (anagramTotal[i] != -1) {
			ana[yy] = anagramTotal[i];
			yy++;
		}
	}
	LinkedStack<Integer> listStack = new LinkedStack<Integer>();
	for (int i = 0; i < ana.length - 1; i++) 
	{
		listStack.add(ana[i]);
	}
	listStack.display();
}

/*
 *@purpose:Queue is used to to find the functioning of calender which focus on
 *         linkedlist as well.
 *@param: int month and year is passed in the list.          
 */

public static int[][] calenderQueue(int month, int year) 
{
	int year1, month1, x, day = 1, day1;
	
	year1 = year - (14 - month) / 12;
	x = year1 + (year1 / 4) - (year1 / 100) + (year1 / 400);
	month1 = month + 12 * ((14 - month) / 12) - 2;
	day1 = (day + x + (31 * month1) / 12) % 7;
	String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
			"October", "November", "December" };
	int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	int monthDay = 0;
	for (int i = 0; i < monthDays.length; i++) {
		if (i == month - 1) {
			monthDay = monthDays[i];
		}
	}
	int[][] totalDays = new int[6][7];
	boolean leap = leapYear(year);
	if (leap && month == 1) {
		monthDay = 29;
	}
	int z = 1;
	for (int i = 0; i < 6; i++) 
	{
		for (int j = 0; j < 7; j++) 
		{
			if (i == 0 && j < day1)
			{
				totalDays[i][j] = -1;
			} else if (z <= monthDay) 
			{
				totalDays[i][j] = z;
				z++;
			} else {
				totalDays[i][j] = -1;
			}
		}
	}
	for (int i = 0; i < 12; i++) {
		if (month == i + 1) {
			System.out.print(monthName[i] + " " + year);
		}
	}
	System.out.println();
	return totalDays;

}
/*@purpose: bankcashcounter is the program that deposites and withdraws the money 
 *          from bank that in the form of queue structure.
 *          
 * @param: parameter passed in these program is number of people.          
 */

public int bankCashCounter(int numberOfPeople)
{
	int cashBalance = 20000;
	int testCases = numberOfPeople;
	MyQueue<Integer> queue = new MyQueue<Integer>(numberOfPeople);
	for (int i = 0; i < numberOfPeople; i++)
		queue.enqueue(i);
	while (testCases > 0)
	{
		System.out.println("Bank Cash : "+cashBalance);
		int count = 0, option = 0;

		while (count == 0)
		{

			System.out.println("1. for Withdrawal \n2. for Deposit");
			option = Utility.InputInteger();
			if (option == 1 || option == 2)
				count++;
		}
		if (option == 1)
		{
			int amount = 0;
			int countWithdrawal = 0;
			while (countWithdrawal == 0) 
			{
				System.out.println("Enter the amount ");
				amount = Utility.InputInteger();
				if (amount > cashBalance) 
					System.out.println("Sorry we don't have required cash\nvisit another day");
				else
			    cashBalance = cashBalance - amount;
				countWithdrawal++;
				
			}
			
			queue.dequeue();
		} 
		else if (option == 2) 
		{
			int amount = 0;
			int countDeposit = 0;
			while (countDeposit == 0)
			{
				System.out.println("Enter the amount to deposit");
				amount = Utility.InputInteger();
				countDeposit++;
			}
			cashBalance = cashBalance + amount;
			queue.dequeue();
		}
		testCases--;
	}
	
	
	return cashBalance;
}

  static class Node
 {
     Node next;
     int data;
	public Node[] table;
  
     /* Constructor */
     public Node(int x)
     {
         data = x;
         next = null;
     }
 }
 
 
 static String num;

	/**
	 * Reading data from file and taking a user input and deleting a number if
	 * present or adding if not present via ordered list
	 * 
	 * @param searchItem
	 * @throws Exception
	 */
	public static void orderedList(String searchItem) throws Exception
	{
		List<String> list = new List<String>();
		File file = new File("/home/admin1/Desktop/FellowshipProgramsJavaAishwarya/fellowship programs/src/com/bridgelabz/fellowshipprogram/utility/Ordered.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str = "";
		while ((num = br.readLine()) != null) {
			str = str + num+" ";
		}
		br.close();
		for (String data : str.split("\\s", 0)) {
			list.add(data);
		}
		System.out.println("Elements before searching");
		System.out.println("******************************");
		list.display();
		boolean b = list.search(searchItem);
		if (b) {
			list.remove(searchItem);
		} else {
			list.add(searchItem);
		}
		System.out.println("*******************************");
		System.out.println("elements after searching and sorting");
		System.out.println("*********************************");
		list.display();
		list.write();
	}
	
	private static String word;

	/*@Purpose: search the word in list of words and then write the data into the file
	 *          and read it from the file.
	 * @param:  userinput
	 * @throws: Exception. 
	 */
	public static void unOrderedList(String userInput) throws Exception 
	{
		List<String> list = new <String>List();
		File file = new File("/home/admin1/Desktop/FellowshipProgramsJavaAishwarya/fellowship programs/src/com/bridgelabz/fellowshipprogram/utility/Unordered.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str = "";
		while ((word = br.readLine()) != null) 
		{
			str = str + word+" ";
		}
		br.close();
		for (String fileString : str.split("\\s", 0))
		{
			list.add(fileString);
		}
		System.out.println("Before Search");
		System.out.println("*******************");
		list.display();
		boolean b = list.search(userInput);
		if (b) 
		{
			list.remove(userInput);
		} else 
		{
			list.add(userInput);
		}
		System.out.println("************************");
		System.out.println("After Search");
		System.out.println("****************************");
		list.display();
		list.write();

	}


  
}

	
	

	





























