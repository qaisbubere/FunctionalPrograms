/****************************************************************************** 
 *  Purpose: to find distance between two points;
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   5-10-2017
 *
 ******************************************************************************/

package com.bridgelabz.programs;

public class Distance
{
	public static void main(String []args)
	{
	int x = Integer.parseInt(args[0]);
	int y = Integer.parseInt(args[1]);
	
	double distance = Math.sqrt((x*x)+(y*y));
	
	System.out.println("the distance from ("+x+ ","+x+") to ("+y+","+y+") is : " +distance);
	}
}