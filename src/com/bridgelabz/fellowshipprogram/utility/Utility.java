package com.bridgelabz.fellowshipprogram.utility;
import java.util.*;
import java.io.*;
public class Utility 
{
	static Scanner sc=new Scanner(System.in);
	private static int y;
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
		String result=name.replace("<<username>>",change);
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
			randnum=Math.random();
			System.out.println(counter +"/t" +randnum );
			if(randnum<0.5)
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

		if( year%4==0 && year%100!=0 && year%400==0)

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
		float harmonic=1;
		for(int i=2;i<n;i++)
		{
			harmonic=(harmonic+(float)1/i);
		}
		return harmonic;
	}
	public static int power(int counter,int n)
	{
		counter=0;
		int power=1;


		if(n>=0 && n<31)
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

		for(int i=2;i<n;i++)
		{
			while(n%i==0)  
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

	public static int twodarray(int row,int column)
	{
		int arr[][]=new int[3][3];
		System.out.println("number of"+row*column+"in 2d array");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=InputInteger();
			}
		}
		System.out.println("display the array");
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
		int res=(int) Math.sqrt(distance+distance2);
		return res;
	}

	public static int quadratic1(double a,double b,double c)
	{
		double delta=b*b-4*c*c;

		if(delta>=0.0)
		{
			double Root1 =((-b + Math.sqrt(delta))/(2*a));

			double Root2 =((-b - Math.sqrt(delta))/(2*a));

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
		double windchill=35.74 + 0.6215 * t - 35.75 *
				Math.pow(v, 0.16) + 0.4275 * t *
				Math.pow(t, 0.16);
		return windchill;	
	}
	//***********************************************logical programming******************************************//

	public static void gammy(int stake,int goal,int trial)
	{	
		//stake=0;
		//goal=0;
		//trial=0;
		int  wins = 0;
		int bets = 0;
		for(int t=0;t<trial;t++)
		{
			int cash=stake;

			while(cash>0 && goal>cash)
			{
				bets++;
				if(Math.random()<0.5)
				{
					cash++;
				}
				else
				{
					cash--;
				}
			}
			if(cash==goal)
			{
				wins++;
			}

		}
		System.out.println(wins+ "wins of"+trial);
		System.out.println("percentage of wins"+ 100.0*wins/trial);
		System.out.println("average percentage of wins" +0.1*bets/trial);


	}

	public static int coupan(int num)
	{
		int max=10;

		for(int i=0;i<num;i++)
		{
			String str="";


			for(int j=0;j<10;j++)
			{
				double d=Math.random();

				int random=(int)(d*max);
				str+=random;
			}
			System.out.println(str);


		}
		return num;

	}

	public static long stopwatch()
	{
		long  starttime=0;
		long  stoptime=0;
		long elapsedtime=0;

		starttime=System.currentTimeMillis();

		System.out.println("enter 0 to stop");
		stoptime=Utility.InputLong();

		stoptime=System.currentTimeMillis(); 

		elapsedtime=(stoptime-starttime)/1000;

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


	public static String insertion(String arr[],int n)
	{
		String temp=" ";
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i].compareToIgnoreCase(arr[j])>0)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		return temp;
	}

	public static void bubble(int arr[])
	{
		int i,j;
		int temp;
		for(i=0;i<arr.length;i++)
		{
			for(j=1;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;

				}
			}
		}
		for( i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]); 
		}

	}
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

	public static void primeno(int lower_limit,int Upper_limit)
	{
		int i,j,n=0;
		int flag=0;
		for( i=lower_limit;i<=Upper_limit;i++)
		{	
			for( j=2;j<i;j++)
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
	}
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
	
	public static boolean palindrome(int n)
	{
		int rev = 0;
		int temp=0;
		while(temp!=0)
		{
			rev=rev*10+(temp/10);
			 temp=temp/10;
		}
		if(rev==temp)
		{
			return true;
		}
		else
		{
			return false;
	     
		}
				
	}
	//******************************Junit programming********************************************//
	
	public static int wendingmachine(int notes[],int notecounter[],int amount)
	{
		 int notescounter[]=new int[9];
	      int len=notes.length;
	      System.out.println("enter the amount");
	   	  amount=sc.nextInt();
	   	  System.out.println(amount);
	       for(int i=0;i<9;i++)
	       {
	    	  if(amount>=notes[i])
	    	 {
	    	      notescounter[i]=amount/notes[i];
	    	      amount=amount-notescounter[i]*notes[i];
	    	  }
	    	  else
	    	  {  
	    		  notescounter[i]=notes[len-1];
	    	  }
	    	   
	       }
	       System.out.println("count of notes");
	       for(int i=0;i<9;i++)
	       {
	    	   System.out.println(notescounter[i]+ ":" +notes[i]);
	    	   
	       }
	       return len;
	}
	public static int ferenhitetemp(int c)
	{
		int f;
		f=(c*9/5)+32;
		System.out.println(f);
		return f;
	}
	public static int celciustemp(int f)
	{
		int c;
		c=(f-32)*5/9;
		System.out.println(c);
		return c;
	}
	
	public static  double monthlypayement(double interest,double year,double principal)
	{
		  double payment;
		  interest = interest/(12*100);
		 year=year*12;
		 payment = ((principal*interest*Math.pow(1+interest, year))/(Math.pow(1+interest,year)-1));
		 System.out.println("monthly payment is" +payment);
		 return payment;
	}
	
	public static String tobinary(int n)
	{
       int result;
	   String a=" ";
	   while(n>0)
	   {
		    result=n%2;
		     a=result+ " " +a;
		     n=n/2;
				  
	   }
	   System.out.println(a);
	     

	    return a;
	    
		
	}
	public static double sqrt_newton(double n)
	{
		
		double eps=1e-15;
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

	public static int dayofweek(int m,int d,int years)
	{
		int d1=0;
		if((m>=1 && m<=12) && (d>=1 && d<=31))
		{
			years=y-(14-m)/12;
			int temp=years+(years/4)-(years/100)+(years/400);
		    int	months=m+12*((14-m)/12)-2;
		    d1=(d+temp+31*months/12)%7;
			
		}
		else
		{
			System.out.println("enter input is invalid");
	
	}
		switch(d1)
		{
			case 0:
				System.out.println("Sunday");
				break;
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
		}
		return 0;
   }
	
	 public static int[] swapBinaryNum(String result[])
	{
		String arr1[]=new String[4];
		String arr2[]=new String[4];
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
	
	 static class stack
		{
			char[] items=new char[100];
			char x;
			int top=-1;
			void push()
			{
				if(top==99)
				{
					System.out.println("stack is overflow");
				}
				else
				{
					items[++top]=x;
				}
			}
			char pop()
			{
				if(top==-1)
				{
					System.out.println("underflow error");
					return  '\0';
				}
				else
				{
					char elements=items[top];
					top--;
					return elements;
				}
			}	
					
		  
		 boolean isEmpty()
		{
			 return(top==-1)?true:false;
			
	   }
 }				
	public static boolean ismatchingpair(char character1,char character2)	
	{
		  if(character1=='{'||  character2=='}') 
		  {
			  return true;
		  }
		  else if(character1=='[' || character2==']')
		  {
			  return true;
		  }
		  else if(character1=='(' || character2==')')
		  {
			  return true;
		  }
		  else 
		  {
			  return false;
		  }
	}
	
	public static boolean areparenthesisbalance(char exp[])
	{
		Stack st=new Stack();
		for(int i=0;i<=exp.length;i++)
		{
			if(exp[i]=='{' || exp[i]=='['|| exp[i]=='(')
			{
				st.push(exp[i]);
			}
		   else
           {
			  if(exp[i]=='}' || exp[i]==']' || exp[i]==')' )
			  {
				  char temp=exp[i];
				  if(st.isEmpty())
				  {
					  return false;	  
				  }
				  else if(!ismatchingpair((char) st.pop(),temp))
				 {
					  return false;
				 }
			  }
		   }
			if(st.isEmpty())
			{
				return true;
			}
			else
			{
				return false;
			}
	    }
		return true;		
	}
	
}





























