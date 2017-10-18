
/****************************************************************************** 
 *  Purpose: to determine whether the given year is leap year or not.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   3-10-2017
 *
 ******************************************************************************/

package com.bridgelabz.programs;
import java.util.Scanner;

public class LeapYear
{
	static boolean status =false;
	public static void main(String args[])
	{
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter a year");
	int year = scanner.nextInt();
	int length = Integer.toString(year).length();

	if(length == 4)
	{
	if(year%4==0)
	status = true;
	

	if(year%100==0)
	status = false;
		
	
	if(year % 400 == 0)
	status = true;

	System.out.println(status);
	}
	else
	{
	System.out.println("please enter 4 digit year");
	}
}
}