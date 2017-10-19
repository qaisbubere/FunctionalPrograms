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
	int point1 = Integer.parseInt(args[0]);
	int point2 = Integer.parseInt(args[1]);
	
	double distance = Math.sqrt((point1*point1)+(point2*point2));
	
	System.out.println("the distance from ("+point1+ ","+point1+") to ("+point2+","+point2+") is : " +distance);
	}
}