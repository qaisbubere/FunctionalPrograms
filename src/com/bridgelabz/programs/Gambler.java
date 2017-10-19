
/****************************************************************************** 
 *  Purpose: to develop a gamblers game;
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   5-10-2017
 *
 ******************************************************************************/

package com.bridgelabz.programs;

public class Gambler
{
	public static void main(String[]args)
	{
	int stake = Integer.parseInt(args[0]);
	int goal =  Integer.parseInt(args[1]);
	int trial = Integer.parseInt(args[2]);
	
	int bet=0, win=0;
	
	for(int i=0; i<trial; i++)
	{
		while(stake>0 && stake<goal)
		{
		bet++;
			if(Math.random()<0.5)
			{
			stake++;
			}
			else
			{
			stake--;
			}
		}
		if(stake == goal)
		{
		win++;
		}
	}

	double percentageOfWin = (win/trial)*100;
	double percentageOfLoss = 100 - percentageOfWin;
	System.out.println(win+ " games won out of "+trial);
	System.out.println("winning percentage is "+percentageOfWin+"%");
	System.out.println("losing percentage is "+percentageOfLoss+"%");
}
}
	
