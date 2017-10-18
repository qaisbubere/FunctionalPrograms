/****************************************************************************** 
 *  Purpose: to find prime factor of a given number
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   3-10-2017
 *
 ******************************************************************************/

package com.bridgelabz.programs;
import java.util.Scanner;

public class PrimeFactor
{	
	static int Number;
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[]args)
	{
	primeFactor();
	}
	
	public static void primeFactor()
	{
	System.out.println("enter a number");
	int Number = scanner.nextInt();
	for(int i=2; i*i<=Number; i++)
	{
	if(Number%i==0)
	{
		for(int j=1; j<Number; j++)
		{
			if(i%j == 0)
			{
				System.out.println(i);
			}
		}
	
	}
	}
	System.out.println("press 1 if you wish to continue");
	int choice = scanner.nextInt();
	if(choice == 1)
	{
	primeFactor();
	}
	}

}