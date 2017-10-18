/****************************************************************************** 
 *  Purpose: To develop a tic-tac-toe game.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   3-10-2017
 *
 ******************************************************************************/

package com.bridgelabz.programs;
import java.util.Scanner;

public class TicTac
{
	//Array[0][0] = 0; Array[0][1] = 1; Array[0][2] = 2;
	//Array[1][0] = 3; Array[1][1] = 4; Array[1][2] = 5;
	//Array[2][0] = 6; Array[2][1] = 7; Array[2][2] = 8;
	int [][]Array = new int[3][3];
	int num, number;
	static char board[][] = new char[3][3];
	public static void main(String[]args)throws Exception
	{	
	System.out.println("player 1: Computer \nPlayer 2: User");
	Board();
	TicTac object = new TicTac();
	object.ComputersTurn();
	}
	

	//Tic-Tac-Toe board printing
	public static void Board()
	{
		
	 for(int i = 0; i < 3; i++)
    {
        for(int j = 0; j <3; j++)
         {
          
			board[i][j] = ' ';
         }
    }

	System.out.println(" 0     1    2");
    System.out.println("0" + board[0][0] + "  |  " + board[0][1] + " | " + board[0][2]);  
    System.out.println("  -----------");
    System.out.println("1" + board[1][0] + "  |  " + board[1][1] + " | " + board[1][2]);  
    System.out.println("  -----------");
    System.out.println("2" + board[2][0] + "  |  " + board[2][1] + " | " + board[2][2]); 
		}


	//computers turn to play
	public void ComputersTurn()
	{
	
	int random = 0 + (int)(Math.random() * 8+1);
	System.out.println("computer generated : "+random); 
	
	if(random == 0)
	{
		if(Array[0][0] == 0)
		{	
		ComputersDisplay(0);
		}
		
		else
		{	
		System.out.println("the space is occupied. please give another number");
		ComputersTurn();
		}		
	}

	else if(random == 1)
		{
			if(Array[0][1] == 0)
			{	
			ComputersDisplay(1);
			}
		
			else
			{
			System.out.println("the space is occupied. please give another number");
			this.ComputersTurn();
			}
		}

	else if(random == 2)
		{
			if(Array[0][2] == 0)
			{
			ComputersDisplay(2);
			}

			
			else
			{
			System.out.println("the space is occupied. please give another number");
			this.ComputersTurn();
			}		
		}

	else if(random == 3)
		{
			if(Array[1][0] == 0)
			{	
			ComputersDisplay(3);
			}

			
			else
			{
			System.out.println("the space is occupied. please give another number");
			this.ComputersTurn();
			}
		}

	else if(random == 4)
		{
			if(Array[1][1] == 0)
			{	
			ComputersDisplay(4);
			}

			
			else
			{
			System.out.println("the space is occupied. please give another number");
			this.ComputersTurn();
			}		
		}

	else if(random == 5)
		{
			if(Array[1][2] == 0)
			{	
			ComputersDisplay(5);
		}

		
			else
			{
			System.out.println("the space is occupied. please give another number");
			this.ComputersTurn();
			}		
		}

	else if(random == 6)
		{
			if(Array[2][0] == 0)
			{	
		ComputersDisplay(6);
		}

		
			else
			{
			System.out.println("the space is occupied. please give another number");
			this.ComputersTurn();
			}		
		}

	else if(random == 7)
		{
			if(Array[2][1] == 0)
			{	
		ComputersDisplay(7);
		}

		
			else
			{
			System.out.println("the space is occupied. please give another number");
			this.ComputersTurn();
			}		
		}

	else if(random == 8)
		{
			if(Array[2][2] == 0)
			{	
		ComputersDisplay(8);
		}

		
			else
			{
			System.out.println("the space is occupied. please give another number");
			this.ComputersTurn();
			}		
		}

	}


	public void ComputersDisplay(int num)
	{
	if(num == 0)
	{
		int i=0;
	  	int j=0;


	for( i = 0; i < 2; i++)
    {
        for( j = 0; j <2; j++)
         {
          
			board[i][j] = 'O';
         }
    }

	System.out.println(" 0     1    2");
    System.out.println("0 " + board[0][0] + "  |  " + board[0][1] + " | " + board[0][2]);  
    System.out.println("  -----------");
    System.out.println("1 " + board[1][0] + "  |  " + board[1][1] + " | " + board[1][2]);  
    System.out.println("  -----------");
    System.out.println("2 " + board[2][0] + "  |  " + board[2][1] + " | " + board[2][2]); 

	Array[0][0]='O';

	
		if(Array[0][0]=='O' && Array[0][1] == 'O' && Array[0][2] == 'O')
		{
		System.out.println("computer wins");
		
		}
	
		else if(Array[0][0]=='O' && Array[1][0] == 'O' && Array[2][0] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else if(Array[0][2]=='O' && Array[1][2] == 'O' && Array[2][2] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else if(Array[2][0]=='O' && Array[2][1] == 'O' && Array[2][2] == 'O')
		{
		System.out.println("computer wins");
		
		}
	
		else if(Array[0][0]=='O' && Array[1][1] == 'O' && Array[2][2] == 'O')
		{
		System.out.println("computer wins");
		
		}
	
		else if(Array[0][2]=='O' && Array[1][1] == 'O' && Array[2][0] == 'O')
		{
		System.out.println("computer wins");
		
		}	

		else if(Array[1][0]=='O' && Array[1][1] == 'O' && Array[1][2] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else if(Array[0][1]=='O' && Array[1][1] == 'O' && Array[2][1] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else{
		UsersTurn();
		}
		}


	if(num == 1)
	{
		int i=0;
	  	int j=1;
	for( i = 0; i < 1; i++)
    {
        for( j = 1; j <2; j++)
         {
          
			board[i][j] = 'O';
         }
    }

	System.out.println(" 0     1    2");
    System.out.println("0 " + board[0][0] + "  |  " + board[0][1] + " | " + board[0][2]);  
    System.out.println("  -----------");
    System.out.println("1 " + board[1][0] + "  |  " + board[1][1] + " | " + board[1][2]);  
    System.out.println("  -----------");
    System.out.println("2 " + board[2][0] + "  |  " + board[2][1] + " | " + board[2][2]); 

	Array[0][1]='O';

		if(Array[0][0]=='O' && Array[0][1] == 'O' && Array[0][2] == 'O')
		{
		System.out.println("computer wins");
		
		}
	
		else if(Array[0][0]=='O' && Array[1][0] == 'O' && Array[2][0] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else if(Array[0][2]=='O' && Array[1][2] == 'O' && Array[2][2] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else if(Array[2][0]=='O' && Array[2][1] == 'O' && Array[2][2] == 'O')
		{
		System.out.println("computer wins");
		
		}
	
		else if(Array[0][0]=='O' && Array[1][1] == 'O' && Array[2][2] == 'O')
		{
		System.out.println("computer wins");
		
		}
	
		else if(Array[0][2]=='O' && Array[1][1] == 'O' && Array[2][0] == 'O')
		{
		System.out.println("computer wins");
		
		}	

		else if(Array[1][0]=='O' && Array[1][1] == 'O' && Array[1][2] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else if(Array[0][1]=='O' && Array[1][1] == 'O' && Array[2][1] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else{
		UsersTurn();
		}
		}


	if(num == 2)
	{
		int i=0;
	  	int j=2;
	for( i = 0; i < 1; i++)
    {
        for( j = 2; j <3; j++)
         {
          
			board[i][j] = 'O';
         }
    }

	System.out.println(" 0     1    2");
    System.out.println("0 " + board[0][0] + "  |  " + board[0][1] + " | " + board[0][2]);  
    System.out.println("  -----------");
    System.out.println("1 " + board[1][0] + "  |  " + board[1][1] + " | " + board[1][2]);  
    System.out.println("  -----------");
    System.out.println("2 " + board[2][0] + "  |  " + board[2][1] + " | " + board[2][2]); 
	Array[0][2]='O';
		if(Array[0][0]=='O' && Array[0][1] == 'O' && Array[0][2] == 'O')
		{
		System.out.println("computer wins");
		
		}
	
		else if(Array[0][0]=='O' && Array[1][0] == 'O' && Array[2][0] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else if(Array[0][2]=='O' && Array[1][2] == 'O' && Array[2][2] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else if(Array[2][0]=='O' && Array[2][1] == 'O' && Array[2][2] == 'O')
		{
		System.out.println("computer wins");
		
		}
	
		else if(Array[0][0]=='O' && Array[1][1] == 'O' && Array[2][2] == 'O')
		{
		System.out.println("computer wins");
		
		}
	
		else if(Array[0][2]=='O' && Array[1][1] == 'O' && Array[2][0] == 'O')
		{
		System.out.println("computer wins");
		
		}	

		else if(Array[1][0]=='O' && Array[1][1] == 'O' && Array[1][2] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else if(Array[0][1]=='O' && Array[1][1] == 'O' && Array[2][1] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else{
		UsersTurn();
		}
		}

	if(num == 3)
	{
		int i=1;
	  	int j=0;
	for( i = 1; i < 2; i++)
    {
        for( j = 0; j <1; j++)
         {
          
			board[i][j] = 'O';
         }
    }

	System.out.println(" 0     1    2");
    System.out.println("0 " + board[0][0] + "  |  " + board[0][1] + " | " + board[0][2]);  
    System.out.println("  -----------");
    System.out.println("1 " + board[1][0] + "  |  " + board[1][1] + " | " + board[1][2]);  
    System.out.println("  -----------");
    System.out.println("2 " + board[2][0] + "  |  " + board[2][1] + " | " + board[2][2]); 
	Array[1][0]='O';
	if(Array[0][0]=='O' && Array[0][1] == 'O' && Array[0][2] == 'O')
		{
		System.out.println("computer wins");
		
		}
	
		else if(Array[0][0]=='O' && Array[1][0] == 'O' && Array[2][0] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else if(Array[0][2]=='O' && Array[1][2] == 'O' && Array[2][2] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else if(Array[2][0]=='O' && Array[2][1] == 'O' && Array[2][2] == 'O')
		{
		System.out.println("computer wins");
		
		}
	
		else if(Array[0][0]=='O' && Array[1][1] == 'O' && Array[2][2] == 'O')
		{
		System.out.println("computer wins");
		
		}
	
		else if(Array[0][2]=='O' && Array[1][1] == 'O' && Array[2][0] == 'O')
		{
		System.out.println("computer wins");
		
		}	

		else if(Array[1][0]=='O' && Array[1][1] == 'O' && Array[1][2] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else if(Array[0][1]=='O' && Array[1][1] == 'O' && Array[2][1] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else{
		UsersTurn();
		}
		}

	if(num == 4)
	{
		int i=1;
	  	int j=1;
	for( i = 1; i < 2; i++)
    {
        for( j = 1; j <2; j++)
         {
          
			board[i][j] = 'O';
         }
    }

	System.out.println(" 0     1    2");
    System.out.println("0 " + board[0][0] + "  |  " + board[0][1] + " | " + board[0][2]);  
    System.out.println("  -----------");
    System.out.println("1 " + board[1][0] + "  |  " + board[1][1] + " | " + board[1][2]);  
    System.out.println("  -----------");
    System.out.println("2 " + board[2][0] + "  |  " + board[2][1] + " | " + board[2][2]); 
	Array[1][1]='O';
		if(Array[0][0]=='O' && Array[0][1] == 'O' && Array[0][2] == 'O')
		{
		System.out.println("computer wins");
		
		}
	
		else if(Array[0][0]=='O' && Array[1][0] == 'O' && Array[2][0] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else if(Array[0][2]=='O' && Array[1][2] == 'O' && Array[2][2] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else if(Array[2][0]=='O' && Array[2][1] == 'O' && Array[2][2] == 'O')
		{
		System.out.println("computer wins");
		
		}
	
		else if(Array[0][0]=='O' && Array[1][1] == 'O' && Array[2][2] == 'O')
		{
		System.out.println("computer wins");
		
		}
	
		else if(Array[0][2]=='O' && Array[1][1] == 'O' && Array[2][0] == 'O')
		{
		System.out.println("computer wins");
		
		}	

		else if(Array[1][0]=='O' && Array[1][1] == 'O' && Array[1][2] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else if(Array[0][1]=='O' && Array[1][1] == 'O' && Array[2][1] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else{
		UsersTurn();
		}
		}


	if(num == 5)
	{
		int i=1;
	  	int j=2;
	for( i = 1; i < 2; i++)
    {
        for( j = 2; j <3; j++)
         {
          
			board[i][j] = 'O';
         }
    }

	System.out.println(" 0     1    2");
    System.out.println("0 " + board[0][0] + "  |  " + board[0][1] + " | " + board[0][2]);  
    System.out.println("  -----------");
    System.out.println("1 " + board[1][0] + "  |  " + board[1][1] + " | " + board[1][2]);  
    System.out.println("  -----------");
    System.out.println("2 " + board[2][0] + "  |  " + board[2][1] + " | " + board[2][2]); 
	Array[1][2]='O';
		if(Array[0][0]=='O' && Array[0][1] == 'O' && Array[0][2] == 'O')
		{
		System.out.println("computer wins");
		
		}
	
		else if(Array[0][0]=='O' && Array[1][0] == 'O' && Array[2][0] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else if(Array[0][2]=='O' && Array[1][2] == 'O' && Array[2][2] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else if(Array[2][0]=='O' && Array[2][1] == 'O' && Array[2][2] == 'O')
		{
		System.out.println("computer wins");
		
		}
	
		else if(Array[0][0]=='O' && Array[1][1] == 'O' && Array[2][2] == 'O')
		{
		System.out.println("computer wins");
		
		}
	
		else if(Array[0][2]=='O' && Array[1][1] == 'O' && Array[2][0] == 'O')
		{
		System.out.println("computer wins");
		
		}	

		else if(Array[1][0]=='O' && Array[1][1] == 'O' && Array[1][2] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else if(Array[0][1]=='O' && Array[1][1] == 'O' && Array[2][1] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else{
		UsersTurn();
		}
		}


	if(num == 6)
	{
		int i=2;
	  	int j=0;
	for( i = 2; i < 3; i++)
    {
        for( j = 0; j <1; j++)
         {
          
			board[i][j] = 'O';
         }
    }

	System.out.println(" 0     1    2");
    System.out.println("0 " + board[0][0] + "  |  " + board[0][1] + " | " + board[0][2]);  
    System.out.println("  -----------");
    System.out.println("1 " + board[1][0] + "  |  " + board[1][1] + " | " + board[1][2]);  
    System.out.println("  -----------");
    System.out.println("2 " + board[2][0] + "  |  " + board[2][1] + " | " + board[2][2]); 
	Array[2][0]='O';
		if(Array[0][0]=='O' && Array[0][1] == 'O' && Array[0][2] == 'O')
		{
		System.out.println("computer wins");
		
		}
	
		else if(Array[0][0]=='O' && Array[1][0] == 'O' && Array[2][0] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else if(Array[0][2]=='O' && Array[1][2] == 'O' && Array[2][2] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else if(Array[2][0]=='O' && Array[2][1] == 'O' && Array[2][2] == 'O')
		{
		System.out.println("computer wins");
		
		}
	
		else if(Array[0][0]=='O' && Array[1][1] == 'O' && Array[2][2] == 'O')
		{
		System.out.println("computer wins");
		
		}
	
		else if(Array[0][2]=='O' && Array[1][1] == 'O' && Array[2][0] == 'O')
		{
		System.out.println("computer wins");
		
		}	

		else if(Array[1][0]=='O' && Array[1][1] == 'O' && Array[1][2] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else if(Array[0][1]=='O' && Array[1][1] == 'O' && Array[2][1] == 'O')
		{
		System.out.println("computer wins");
		
		}

	else
	{
	UsersTurn();
	}
}



	if(num == 7)
	{
		int i=2;
	  	int j=1;
	for( i = 2; i < 3; i++)
    {
        for( j = 1; j <2; j++)
         {
          
			board[i][j] = 'O';
         }
    }

	System.out.println(" 0     1    2");
    System.out.println("0 " + board[0][0] + "  |  " + board[0][1] + " | " + board[0][2]);  
    System.out.println("  -----------");
    System.out.println("1 " + board[1][0] + "  |  " + board[1][1] + " | " + board[1][2]);  
    System.out.println("  -----------");
    System.out.println("2 " + board[2][0] + "  |  " + board[2][1] + " | " + board[2][2]); 
	Array[2][1]='O';
		if(Array[0][0]=='O' && Array[0][1] == 'O' && Array[0][2] == 'O')
		{
		System.out.println("computer wins");
		
		}
	
		else if(Array[0][0]=='O' && Array[1][0] == 'O' && Array[2][0] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else if(Array[0][2]=='O' && Array[1][2] == 'O' && Array[2][2] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else if(Array[2][0]=='O' && Array[2][1] == 'O' && Array[2][2] == 'O')
		{
		System.out.println("computer wins");
		
		}
	
		else if(Array[0][0]=='O' && Array[1][1] == 'O' && Array[2][2] == 'O')
		{
		System.out.println("computer wins");
		
		}
	
		else if(Array[0][2]=='O' && Array[1][1] == 'O' && Array[2][0] == 'O')
		{
		System.out.println("computer wins");
		
		}	

		else if(Array[1][0]=='O' && Array[1][1] == 'O' && Array[1][2] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else if(Array[0][1]=='O' && Array[1][1] == 'O' && Array[2][1] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else{
		UsersTurn();
		}
		}


	if(num == 8)
	{
		int i=2;
	  	int j=2;
	for( i = 2; i < 3; i++)
    {
        for( j = 2; j <3; j++)
         {
          
			board[i][j] = 'O';
         }
    }

	System.out.println(" 0     1    2");
    System.out.println("0 " + board[0][0] + "  |  " + board[0][1] + " | " + board[0][2]);  
    System.out.println("  -----------");
    System.out.println("1 " + board[1][0] + "  |  " + board[1][1] + " | " + board[1][2]);  
    System.out.println("  -----------");
    System.out.println("2 " + board[2][0] + "  |  " + board[2][1] + " | " + board[2][2]); 
	Array[2][2]='O';
		if(Array[0][0]=='O' && Array[0][1] == 'O' && Array[0][2] == 'O')
		{
		System.out.println("computer wins");
		
		}
	
		else if(Array[0][0]=='O' && Array[1][0] == 'O' && Array[2][0] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else if(Array[0][2]=='O' && Array[1][2] == 'O' && Array[2][2] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else if(Array[2][0]=='O' && Array[2][1] == 'O' && Array[2][2] == 'O')
		{
		System.out.println("computer wins");
		
		}
	
		else if(Array[0][0]=='O' && Array[1][1] == 'O' && Array[2][2] == 'O')
		{
		System.out.println("computer wins");
		
		}
	
		else if(Array[0][2]=='O' && Array[1][1] == 'O' && Array[2][0] == 'O')
		{
		System.out.println("computer wins");
		
		}	

		else if(Array[1][0]=='O' && Array[1][1] == 'O' && Array[1][2] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else if(Array[0][1]=='O' && Array[1][1] == 'O' && Array[2][1] == 'O')
		{
		System.out.println("computer wins");
		
		}

		else{
		UsersTurn();
		}
		}
}
		
	//users turn to play
	public void UsersTurn()
	{
	Scanner scanner= new Scanner(System.in);
	System.out.println("your turn");
	System.out.println("enter row and column");
	int row = scanner.nextInt();
	int column = scanner.nextInt();
	
	if(Array[row][column] == 0)
		{	
		if(row == 0 && column == 0)
		UsersDisplay(0);

		else if(row == 0 && column == 1)
		UsersDisplay(1);
		
		else if(row == 0 && column == 2)
		UsersDisplay(2);

		else if(row == 1 && column == 0)
		UsersDisplay(3);

		else if(row == 1 && column == 1)
		UsersDisplay(4);

		else if(row == 1 && column == 2)
		UsersDisplay(5);

		else if(row == 2 && column == 0)
		UsersDisplay(6);

		else if(row == 2 && column == 1)
		UsersDisplay(7);

		else if(row == 2 && column == 2)
		UsersDisplay(8);
		}
	else
		{
		System.out.println("space occupied. please give another value");
		UsersTurn();
		}	
	}
	
	public void UsersDisplay(int number)
	{
	if(number == 0)
	{
		int i=0;
	  	int j=0;
	for( i = 0; i < 1; i++)
    {
        for( j = 0; j <1; j++)
         {
          
			board[i][j] = 'X';
         }
    }

	System.out.println(" 0     1    2");
    System.out.println("0 " + board[0][0] + "  |  " + board[0][1] + " | " + board[0][2]);  
    System.out.println("  -----------");
    System.out.println("1 " + board[1][0] + "  |  " + board[1][1] + " | " + board[1][2]);  
    System.out.println("  -----------");
    System.out.println("2 " + board[2][0] + "  |  " + board[2][1] + " | " + board[2][2]); 
	Array[0][0]='X';

		if(Array[0][0]=='X' && Array[0][1] == 'X' && Array[0][2] == 'X')
		{
		System.out.println("user wins");
		
		}
	
		else if(Array[0][0]=='X' && Array[1][0] == 'X' && Array[2][0] == 'X')
		{
		System.out.println("user wins");
		}

		else if(Array[0][2]=='X' && Array[1][2] == 'X' && Array[2][2] == 'X')
		{
		System.out.println("user wins");
		
		}

		else if(Array[2][0]=='X' && Array[2][1] == 'X' && Array[2][2] == 'X')
		{
		System.out.println("user wins");
		
		}
	
		else if(Array[0][0]=='X' && Array[1][1] == 'X' && Array[2][2] == 'X')
		{
		System.out.println("user wins");
		
		}
	
		else if(Array[0][2]=='X' && Array[1][1] == 'X' && Array[2][0] == 'X')
		{
		System.out.println("user wins");
				
		}

		else if(Array[1][0]=='X' && Array[1][1] == 'X' && Array[1][2] == 'X')
		{
		System.out.println("user wins");
		
		}

		else if(Array[0][1]=='X' && Array[1][1] == 'X' && Array[2][1] == 'X')
		{
		System.out.println("user wins");
		
		}
		else
		{
		ComputersTurn();
		}						
	}

	if(number == 1)
	{
		int i=0;
	  	int j=1;
	for( i = 0; i < 1; i++)
    {
        for( j = 1; j <2; j++)
         {
          
			board[i][j] = 'X';
         }
    }

	System.out.println(" 0     1    2");
    System.out.println("0 " + board[0][0] + "  |  " + board[0][1] + " | " + board[0][2]);  
    System.out.println("  -----------");
    System.out.println("1 " + board[1][0] + "  |  " + board[1][1] + " | " + board[1][2]);  
    System.out.println("  -----------");
    System.out.println("2 " + board[2][0] + "  |  " + board[2][1] + " | " + board[2][2]); 
	Array[0][1]='X';

		if(Array[0][0]=='X' && Array[0][1] == 'X' && Array[0][2] == 'X')
		{
		System.out.println("user wins");
		
		}
	
		else if(Array[0][0]=='X' && Array[1][0] == 'X' && Array[2][0] == 'X')
		{
		System.out.println("user wins");
		}

		else if(Array[0][2]=='X' && Array[1][2] == 'X' && Array[2][2] == 'X')
		{
		System.out.println("user wins");
		
		}

		else if(Array[2][0]=='X' && Array[2][1] == 'X' && Array[2][2] == 'X')
		{
		System.out.println("user wins");
		
		}
	
		else if(Array[0][0]=='X' && Array[1][1] == 'X' && Array[2][2] == 'X')
		{
		System.out.println("user wins");
		
		}
	
		else if(Array[0][2]=='X' && Array[1][1] == 'X' && Array[2][0] == 'X')
		{
		System.out.println("user wins");
				
		}

		else if(Array[1][0]=='X' && Array[1][1] == 'X' && Array[1][2] == 'X')
		{
		System.out.println("user wins");
		
		}

		else if(Array[0][1]=='X' && Array[1][1] == 'X' && Array[2][1] == 'X')
		{
		System.out.println("user wins");
		
		}
		else
		{
		ComputersTurn();
		}						
	}



	if(number == 2)
	{
		int i=0;
	  	int j=2;
	for( i = 0; i < 1; i++)
    {
        for( j = 2; j <3; j++)
         {
          
			board[i][j] = 'X';
         }
    }

	System.out.println(" 0     1    2");
    System.out.println("0 " + board[0][0] + "  |  " + board[0][1] + " | " + board[0][2]);  
    System.out.println("  -----------");
    System.out.println("1 " + board[1][0] + "  |  " + board[1][1] + " | " + board[1][2]);  
    System.out.println("  -----------");
    System.out.println("2 " + board[2][0] + "  |  " + board[2][1] + " | " + board[2][2]); 
	Array[0][2]='X';

		if(Array[0][0]=='X' && Array[0][1] == 'X' && Array[0][2] == 'X')
		{
		System.out.println("user wins");
		
		}
	
		else if(Array[0][0]=='X' && Array[1][0] == 'X' && Array[2][0] == 'X')
		{
		System.out.println("user wins");
		}

		else if(Array[0][2]=='X' && Array[1][2] == 'X' && Array[2][2] == 'X')
		{
		System.out.println("user wins");
		
		}

		else if(Array[2][0]=='X' && Array[2][1] == 'X' && Array[2][2] == 'X')
		{
		System.out.println("user wins");
		
		}
	
		else if(Array[0][0]=='X' && Array[1][1] == 'X' && Array[2][2] == 'X')
		{
		System.out.println("user wins");
		
		}
	
		else if(Array[0][2]=='X' && Array[1][1] == 'X' && Array[2][0] == 'X')
		{
		System.out.println("user wins");
				
		}

		else if(Array[1][0]=='X' && Array[1][1] == 'X' && Array[1][2] == 'X')
		{
		System.out.println("user wins");
		
		}

		else if(Array[0][1]=='X' && Array[1][1] == 'X' && Array[2][1] == 'X')
		{
		System.out.println("user wins");
		
		}
		else
		{
		ComputersTurn();
		}						
	}


	if(number == 3)
	{
		int i=1;
	  	int j=0;
	for( i = 1; i < 2; i++)
    {
        for( j = 0; j <1; j++)
         {
          
			board[i][j] = 'X';
         }
    }

	System.out.println(" 0     1    2");
    System.out.println("0 " + board[0][0] + "  |  " + board[0][1] + " | " + board[0][2]);  
    System.out.println("  -----------");
    System.out.println("1 " + board[1][0] + "  |  " + board[1][1] + " | " + board[1][2]);  
    System.out.println("  -----------");
    System.out.println("2 " + board[2][0] + "  |  " + board[2][1] + " | " + board[2][2]); 
	Array[1][0]='X';

		if(Array[0][0]=='X' && Array[0][1] == 'X' && Array[0][2] == 'X')
		{
		System.out.println("user wins");
		
		}
	
		else if(Array[0][0]=='X' && Array[1][0] == 'X' && Array[2][0] == 'X')
		{
		System.out.println("user wins");
		}

		else if(Array[0][2]=='X' && Array[1][2] == 'X' && Array[2][2] == 'X')
		{
		System.out.println("user wins");
		
		}

		else if(Array[2][0]=='X' && Array[2][1] == 'X' && Array[2][2] == 'X')
		{
		System.out.println("user wins");
		
		}
	
		else if(Array[0][0]=='X' && Array[1][1] == 'X' && Array[2][2] == 'X')
		{
		System.out.println("user wins");
		
		}
	
		else if(Array[0][2]=='X' && Array[1][1] == 'X' && Array[2][0] == 'X')
		{
		System.out.println("user wins");
				
		}

		else if(Array[1][0]=='X' && Array[1][1] == 'X' && Array[1][2] == 'X')
		{
		System.out.println("user wins");
		
		}

		else if(Array[0][1]=='X' && Array[1][1] == 'X' && Array[2][1] == 'X')
		{
		System.out.println("user wins");
		
		}
		else
		{
		ComputersTurn();
		}						
	}

	
	if(number == 4)
	{
		int i=1;
	  	int j=1;
	for( i = 1; i < 2; i++)
    {
        for( j = 1; j <2; j++)
         {
          
			board[i][j] = 'X';
         }
    }

	System.out.println(" 0     1    2");
    System.out.println("0 " + board[0][0] + "  |  " + board[0][1] + " | " + board[0][2]);  
    System.out.println("  -----------");
    System.out.println("1 " + board[1][0] + "  |  " + board[1][1] + " | " + board[1][2]);  
    System.out.println("  -----------");
    System.out.println("2 " + board[2][0] + "  |  " + board[2][1] + " | " + board[2][2]); 
	Array[1][1]='X';

		if(Array[0][0]=='X' && Array[0][1] == 'X' && Array[0][2] == 'X')
		{
		System.out.println("user wins");
		
		}
	
		else if(Array[0][0]=='X' && Array[1][0] == 'X' && Array[2][0] == 'X')
		{
		System.out.println("user wins");
		}

		else if(Array[0][2]=='X' && Array[1][2] == 'X' && Array[2][2] == 'X')
		{
		System.out.println("user wins");
		
		}

		else if(Array[2][0]=='X' && Array[2][1] == 'X' && Array[2][2] == 'X')
		{
		System.out.println("user wins");
		
		}
	
		else if(Array[0][0]=='X' && Array[1][1] == 'X' && Array[2][2] == 'X')
		{
		System.out.println("user wins");
		
		}
	
		else if(Array[0][2]=='X' && Array[1][1] == 'X' && Array[2][0] == 'X')
		{
		System.out.println("user wins");
				
		}

		else if(Array[1][0]=='X' && Array[1][1] == 'X' && Array[1][2] == 'X')
		{
		System.out.println("user wins");
		
		}

		else if(Array[0][1]=='X' && Array[1][1] == 'X' && Array[2][1] == 'X')
		{
		System.out.println("user wins");
		
		}
		else
		{
		ComputersTurn();
		}						
	}

	
	if(number == 5)
	{
		int i=1;
	  	int j=2;
	for( i = 1; i < 2; i++)
    {
        for( j = 2; j <3; j++)
         {
          
			board[i][j] = 'X';
         }
    }

	System.out.println(" 0     1    2");
    System.out.println("0 " + board[0][0] + "  |  " + board[0][1] + " | " + board[0][2]);  
    System.out.println("  -----------");
    System.out.println("1 " + board[1][0] + "  |  " + board[1][1] + " | " + board[1][2]);  
    System.out.println("  -----------");
    System.out.println("2 " + board[2][0] + "  |  " + board[2][1] + " | " + board[2][2]); 
	Array[1][2]='X';

		if(Array[0][0]=='X' && Array[0][1] == 'X' && Array[0][2] == 'X')
		{
		System.out.println("user wins");
		
		}
	
		else if(Array[0][0]=='X' && Array[1][0] == 'X' && Array[2][0] == 'X')
		{
		System.out.println("user wins");
		}

		else if(Array[0][2]=='X' && Array[1][2] == 'X' && Array[2][2] == 'X')
		{
		System.out.println("user wins");
		
		}

		else if(Array[2][0]=='X' && Array[2][1] == 'X' && Array[2][2] == 'X')
		{
		System.out.println("user wins");
		
		}
	
		else if(Array[0][0]=='X' && Array[1][1] == 'X' && Array[2][2] == 'X')
		{
		System.out.println("user wins");
		
		}
	
		else if(Array[0][2]=='X' && Array[1][1] == 'X' && Array[2][0] == 'X')
		{
		System.out.println("user wins");
				
		}

		else if(Array[1][0]=='X' && Array[1][1] == 'X' && Array[1][2] == 'X')
		{
		System.out.println("user wins");
		
		}

		else if(Array[0][1]=='X' && Array[1][1] == 'X' && Array[2][1] == 'X')
		{
		System.out.println("user wins");
		
		}
		else
		{
		ComputersTurn();
		}						
	}


	if(number == 6)
	{
		int i=2;
	  	int j=0;
	for( i = 2; i < 3; i++)
    {
        for( j = 0; j <1; j++)
         {
          
			board[i][j] = 'X';
         }
    }

	System.out.println(" 0     1    2");
    System.out.println("0 " + board[0][0] + "  |  " + board[0][1] + " | " + board[0][2]);  
    System.out.println("  -----------");
    System.out.println("1 " + board[1][0] + "  |  " + board[1][1] + " | " + board[1][2]);  
    System.out.println("  -----------");
    System.out.println("2 " + board[2][0] + "  |  " + board[2][1] + " | " + board[2][2]); 
	Array[2][0]='X';

		if(Array[0][0]=='X' && Array[0][1] == 'X' && Array[0][2] == 'X')
		{
		System.out.println("user wins");
		
		}
	
		else if(Array[0][0]=='X' && Array[1][0] == 'X' && Array[2][0] == 'X')
		{
		System.out.println("user wins");
		}

		else if(Array[0][2]=='X' && Array[1][2] == 'X' && Array[2][2] == 'X')
		{
		System.out.println("user wins");
		
		}

		else if(Array[2][0]=='X' && Array[2][1] == 'X' && Array[2][2] == 'X')
		{
		System.out.println("user wins");
		
		}
	
		else if(Array[0][0]=='X' && Array[1][1] == 'X' && Array[2][2] == 'X')
		{
		System.out.println("user wins");
		
		}
	
		else if(Array[0][2]=='X' && Array[1][1] == 'X' && Array[2][0] == 'X')
		{
		System.out.println("user wins");
				
		}

		else if(Array[1][0]=='X' && Array[1][1] == 'X' && Array[1][2] == 'X')
		{
		System.out.println("user wins");
		
		}

		else if(Array[0][1]=='X' && Array[1][1] == 'X' && Array[2][1] == 'X')
		{
		System.out.println("user wins");
		
		}
		else
		{
		ComputersTurn();
		}						
	}

	
	if(number == 7)
	{
		int i=2;
	  	int j=1;
	for( i = 2; i < 3; i++)
    {
        for( j = 1; j <2; j++)
         {
          
			board[i][j] = 'X';
         }
    }

	System.out.println(" 0     1    2");
    System.out.println("0 " + board[0][0] + "  |  " + board[0][1] + " | " + board[0][2]);  
    System.out.println("  -----------");
    System.out.println("1 " + board[1][0] + "  |  " + board[1][1] + " | " + board[1][2]);  
    System.out.println("  -----------");
    System.out.println("2 " + board[2][0] + "  |  " + board[2][1] + " | " + board[2][2]); 
	Array[2][1]='X';

		if(Array[0][0]=='X' && Array[0][1] == 'X' && Array[0][2] == 'X')
		{
		System.out.println("user wins");
		
		}
	
		else if(Array[0][0]=='X' && Array[1][0] == 'X' && Array[2][0] == 'X')
		{
		System.out.println("user wins");
		}

		else if(Array[0][2]=='X' && Array[1][2] == 'X' && Array[2][2] == 'X')
		{
		System.out.println("user wins");
		
		}

		else if(Array[2][0]=='X' && Array[2][1] == 'X' && Array[2][2] == 'X')
		{
		System.out.println("user wins");
		
		}
	
		else if(Array[0][0]=='X' && Array[1][1] == 'X' && Array[2][2] == 'X')
		{
		System.out.println("user wins");
		
		}
	
		else if(Array[0][2]=='X' && Array[1][1] == 'X' && Array[2][0] == 'X')
		{
		System.out.println("user wins");
				
		}

		else if(Array[1][0]=='X' && Array[1][1] == 'X' && Array[1][2] == 'X')
		{
		System.out.println("user wins");
		
		}

		else if(Array[0][1]=='X' && Array[1][1] == 'X' && Array[2][1] == 'X')
		{
		System.out.println("user wins");
		
		}
		else
		{
		ComputersTurn();
		}						
	}


	if(number == 8)
	{
		int i=2;
	  	int j=2;
	for(i = 2; i < 3; i++)
    {
        for(j = 2; j <3; j++)
         {
          
			board[i][j] = 'X';
         }
    }

	System.out.println(" 0     1    2");
    System.out.println("0 " + board[0][0] + "  |  " + board[0][1] + " | " + board[0][2]);  
    System.out.println("  -----------");
    System.out.println("1 " + board[1][0] + "  |  " + board[1][1] + " | " + board[1][2]);  
    System.out.println("  -----------");
    System.out.println("2 " + board[2][0] + "  |  " + board[2][1] + " | " + board[2][2]); 
	Array[2][2]='X';

		if(Array[0][0]=='X' && Array[0][1] == 'X' && Array[0][2] == 'X')
		{
		System.out.println("user wins");
		
		}
	
		else if(Array[0][0]=='X' && Array[1][0] == 'X' && Array[2][0] == 'X')
		{
		System.out.println("user wins");
		}

		else if(Array[0][2]=='X' && Array[1][2] == 'X' && Array[2][2] == 'X')
		{
		System.out.println("user wins");
		
		}

		else if(Array[2][0]=='X' && Array[2][1] == 'X' && Array[2][2] == 'X')
		{
		System.out.println("user wins");
		
		}
	
		else if(Array[0][0]=='X' && Array[1][1] == 'X' && Array[2][2] == 'X')
		{
		System.out.println("user wins");
		
		}
	
		else if(Array[0][2]=='X' && Array[1][1] == 'X' && Array[2][0] == 'X')
		{
		System.out.println("user wins");
				
		}

		else if(Array[1][0]=='X' && Array[1][1] == 'X' && Array[1][2] == 'X')
		{
		System.out.println("user wins");
		
		}

		else if(Array[0][1]=='X' && Array[1][1] == 'X' && Array[2][1] == 'X')
		{
		System.out.println("user wins");
		
		}
		else
		{
		ComputersTurn();
		}						
	}
}		
}