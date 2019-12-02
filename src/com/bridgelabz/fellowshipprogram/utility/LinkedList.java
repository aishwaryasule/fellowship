package com.bridgelabz.fellowshipprogram.utility;

public class LinkedList 
{
    @SuppressWarnings("rawtypes")
	Node head;
	    int size;
	     
	    public LinkedList()
	    {   size=0;
	    	head=null;
	    }
	  class  Node<T>
	  	{
		   T data;
		   @SuppressWarnings("rawtypes")
		Node next;
		   
		  public Node(T data)
		  {
			  this.data=data;
			  next=null;
		  }
		  
	  	}
	   
	   @SuppressWarnings("unchecked")
	public <T> void push(T data)
	   {
		   Node<T> node = new Node<T>(data);
		   size++;
		if(head == null)
		{
			head = node;
		}
		else
		{  
			@SuppressWarnings("rawtypes")
			Node temp = head;
			while(temp.next!=null)
			{
				temp = temp.next;
			}
		
			temp.next = node;
		}
		   
	   }
	  
	   
	   @SuppressWarnings("unchecked")
	public<T>  void pop(T str)
	   {
		   @SuppressWarnings("rawtypes")
		Node temp = head;
			@SuppressWarnings("rawtypes")
			Node prev = head;
			if(temp.data.equals(str)) 
			{
				head = temp.next;
		        size--;
		
			}
			while(temp.next!=null)
			{			
				if(temp.data.equals(str))
				{
					prev.next = temp.next;
					size--;
					
				}
				
			prev=temp;
			temp=temp.next;
				
			
			}
			if(temp.data.equals(str))
			{
				if(temp.next==null)
				{
					prev.next=null;	
					size--;
			
				}
			}
	   }
	   @SuppressWarnings("rawtypes")
	public <T extends Comparable<T>> boolean search(T data)
	   {
		   Node temp = head;

		
			while(temp!=null)
			{			
				if(data.compareTo((T) temp.data)==0)
				{
					 return  true;				
				}
			
				temp=temp.next;
				
			}
		
			return false ;

		   
	   }
	   public <T> void display()
	   {

		   @SuppressWarnings("rawtypes")
		Node temp = head;

			if(temp==null) 
			{
			   
		       System.out.println("Empty");
		
			}
			while(temp!=null)
			{			
				System.out.print(temp.data+"->");
			
				temp=temp.next;
			}	
			

	   }
	   public <T> String getElement(int index)
	   {     
			@SuppressWarnings("rawtypes")
			Node n = head;
			int count = 0;
			while(n!=null)
			{
				if(count == index)
					return (String)n.data;
				count ++;
				n = n.next;
			}
			return (String) "";
		   
	   }
	  

	public int size() {
		// TODO Auto-generated method stub
		Node temp = head;
		int count=0;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		return count;
	}
	
	   
	}
	

