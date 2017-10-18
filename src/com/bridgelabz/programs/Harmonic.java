/****************************************************************************** 
 *  Purpose: to find harmonic number
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   3-10-2017
 *
 ******************************************************************************/

package com.bridgelabz.programs;
import java.util.Scanner;

public class Harmonic
{	
	static int Numerator = 1, Denominator;
	public static void main(String args[])
	{
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter a number");
	int Number = scanner.nextInt();
	
	for(int i =1;i<=Number;i++)
	{
	Denominator = i;
	System.out.print(Numerator+"/"+Denominator);
	if(Denominator<Number)
	{
	System.out.print(" + ");
	}	
	} 
	System.out.println();
}
}