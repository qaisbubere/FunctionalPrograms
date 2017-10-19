/****************************************************************************** 
 *  Purpose: to find out the windchill in temperature;
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   3-10-2017
 *
 ******************************************************************************/

package com.bridgelabz.programs;

public class WindChill
{
	public static void main(String args[])
	{
	double power, windChill;
	double temperature = Double.parseDouble(args[0]);
	double velocity = Double.parseDouble(args[1]);
		
	power = Math.pow(velocity,0.16);
	windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75 ) * power;
	System.out.println("windchill is : "+ windChill);
	}
}