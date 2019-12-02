package com.bridgelabz.fellowshipprogram.logic;
import java.util.*;
/**
* @author aishwaryasule
* @date 13/11/2019
* @purpose fellowship programs
*
*/
import java.util.Random;
public class Tictacto
	{
		//two diamensional array of baord
		static char board[][]= new char[][]{{'1','2','3'},{'4','5','6'},{'7','8','9'}}; 
		static int position; //position of the user
		//0 is for computer and x is for user
		static int count=0;
		static boolean win[]=new boolean[]{false,false}; //aray to winning value of the player
		static Scanner scanner=new Scanner(System.in); //boject of input 

		//Main Method
		public static void main(String arg[])
		{
		System.out.println("The Tic Toc Toe Game:");
		//display method of board
		
		displayBoard(); 
		do
		{
		if(count==9){
		break;
		}
		getValueFromUser();
		count++;
		displayBoard();
		if( (board[0][0]=='x'&& board[0][1]=='x' && board[0][2]=='x') || (board[1][0]=='x'&&board[1][1]=='x'&&board[1][2]=='x') || (board[2][0]=='x'&&board[2][1]=='x'&&board[2][2]=='x') || (board[0][0]=='x'&&board[1][0]=='x'&&board[2][0]=='x') || (board[0][1]=='x'&&board[1][1]=='x'&&board[2][1]=='x') || (board[0][2]=='x'&&board[1][2]=='x'&&board[2][2]=='x') || (board[0][0]=='x'&&board[1][1]=='x'&&board[2][2]=='x') || (board[0][2]=='x'&&board[1][1]=='x'&&board[2][0]=='x') )
		{ 
		win[1]=true;
		break;
		}
		if(count==9){
		break;
		}
		getValueFromComputer();
		count++;
		displayBoard();
		
		
		if( (board[0][0]=='O'&&board[0][1]=='O'&&board[0][2]=='O') || (board[1][0]=='O'&&board[1][1]=='O'&&board[1][2]=='O') || (board[2][0]=='O'&&board[2][1]=='O'&&board[2][2]=='O') || (board[0][0]=='O'&&board[1][0]=='O'&&board[2][0]=='O') || (board[0][1]=='O'&&board[1][1]=='O'&&board[2][1]=='O') || (board[0][2]=='O'&&board[1][2]=='O'&&board[2][2]=='O') || (board[0][0]=='O'&&board[1][1]=='O'&&board[2][2]=='O') || (board[0][2]=='O'&&board[1][1]=='O'&&board[2][0]=='O') )
		{
		win[0]=true;
		break;
		}
		
		
		}while(win[0] !=true || win[1] !=true);
		if(win[0]==true){
		System.out.println("The computer win the match");
		} 
		else if(win[1]==true){
		System.out.println("The user win the match");
		}
		else{
		System.out.println("The match draw");
		}
		}
		
		


		// Display method of TicTacToe board
		public static void displayBoard()
		{
		System.out.println();
		for(int row=0; row<3 ;row++)
		{
		for(int col=0; col<3; col++){
		System.out.print("|"+board[row][col]); 
		}	
		System.out.println("|");
		}
		System.out.println();
		
		}

		//Getting value or input from user
		public static void getValueFromUser()
		{
		do
		{
		System.out.println("Enter your position:");
		position = scanner.nextInt();
		System.out.println(position);
		switch(position){
		case 1:
		if(board[0][0]=='x' || board[0][0]=='O'){
		getValueFromUser(); 
		}else{
		board[0][0]='x';
		}
		break;
		case 2:
		if(board[0][1]=='x' || board[0][1]=='O'){
		getValueFromUser(); 
		}else{
		board[0][1]='x';
		}
		break;
		case 3:
		if(board[0][2]=='x' || board[0][2]=='O'){
		getValueFromUser(); 
		}else{
		board[0][2]='x';
		}
		break;
		case 4:
		if(board[1][0]=='x' || board[1][0]=='O'){
		getValueFromUser(); 
		}else{
		board[1][0]='x';
		}
		break;
		case 5:
		if(board[1][1]=='x' || board[1][1]=='O'){
		getValueFromUser(); 
		}else{
		board[1][1]='x';
		}
		break; 
		case 6:
		if(board[1][2]=='x' || board[1][2]=='O'){
		getValueFromUser(); 
		}else{
		board[1][2]='x';
		}
		break; 
		case 7:
		if(board[2][0]=='x' || board[2][0]=='O'){
		getValueFromUser(); 
		}else{
		board[2][0]='x';
		}
		break;
		case 8:
		if(board[2][1]=='x' || board[2][1]=='O'){
		getValueFromUser(); 
		}else{
		board[2][1]='x';
		}
		break;
		case 9:
		if(board[2][2]=='x' || board[2][2]=='O'){
		getValueFromUser(); 
		}else{
		board[2][2]='x';
		}
		break;
		default:
		System.out.println("Please Enter position in between 0-9:");
		
		}
		}while(position < 1 || position > 9);
		}
		
		//get input from computer
		public static void getValueFromComputer()
		{
		do
		{
		System.out.println("Computer Turns:");
		//	Scanner sc = new Scanner(System.in);
		Random random=new Random();
		position = random.nextInt(10);
		System.out.println(position);
		switch(position){
		case 1:
		if(board[0][0]=='x' || board[0][0]=='O' )
		{
		getValueFromComputer(); 
		}
		else{
		board[0][0]='O';
		}
		break;
		case 2:
		if(board[0][1]=='x' || board[0][1]=='O')
		{
		getValueFromComputer(); 
		}else{
		board[0][1]='O';
		}
		break;
		case 3:
		if(board[0][2]=='x' || board[0][2]=='O')
		{
		getValueFromComputer(); 
		}else{	
		board[0][2]='O';
		}
		break;
		case 4:	
		if(board[1][0]=='x' || board[1][0]=='O')
		{
		getValueFromComputer(); 
		}else{
		board[1][0]='O';
		}
		break;
		case 5:
		if(board[1][1]=='x' || board[1][1]=='O')
		{
		getValueFromComputer(); 
		}else{
		board[1][1]='O';
		}
		break; 
		case 6:
		if(board[1][2]=='x' || board[1][2]=='O')
		{
		getValueFromComputer(); 
		}else{
		board[1][2]='O';
		}
		break; 
		case 7:
		if(board[2][0]=='x' || board[2][0]=='O')
		{
		getValueFromComputer(); 
		}else{
		board[2][0]='O';
		}
		break;
		case 8:	
		if(board[2][1]=='x' || board[2][1]=='O')
		{
		getValueFromComputer(); 
		}else{
		board[2][1]='O';
		}
		break;
		case 9:
		if(board[2][2]=='x' || board[2][2]=='O')
		{
		getValueFromComputer(); 
		}else{
		board[2][2]='O';
		}
		break;
		default:
		System.out.println("Please Enter position in between 0-9:");

		}
		}while(position < 1 || position > 9);
		
		//display();
		}
	}


