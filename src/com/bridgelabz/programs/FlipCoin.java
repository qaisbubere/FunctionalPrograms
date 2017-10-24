/****************************************************************************** 
 *  Purpose: flip a coin and find out the possibility of number of heads and tails.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   3-10-2017
 *
 ******************************************************************************/

package com.bridgelabz.programs;
import java.util.Scanner;

public class FlipCoin{
	static float Tail=0,Head=0,NumberOfFlips =0, HeadPercentage, TailPercentage;
	
	public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the number of times u wish to flip the coin");
	int flip = scanner.nextInt();

	for(int i=1; i<=flip;i++){
	if(Math.random()<0.5)
	{
	System.out.println("tails");
	Tail++;
	}
	else
	{
	System.out.println("Heads");
	Head++;
	}
	NumberOfFlips++;
	}
	System.out.println("heads are :"+Head);
	System.out.println("tails are :"+Tail);
	
	HeadPercentage= (Head/NumberOfFlips)*100;
	TailPercentage = (100 - HeadPercentage);
	System.out.println("percentage of heads are :"+HeadPercentage);
	System.out.println("percentage of tails are :"+TailPercentage);
	}
}

