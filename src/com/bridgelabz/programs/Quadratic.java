/****************************************************************************** 
 *  Purpose: to find distance between two points;
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   5-10-2017
 *
 ******************************************************************************/

package com.bridgelabz.programs;
import java.util.Scanner;

public class Quadratic
{
	public static void main(String[]args)
	{
	Scanner scanner = new Scanner(System.in);

	System.out.println("the equation is : a*x^2 + b*x + c");
	System.out.println("enter value of a, b, and c");
	int a=scanner.nextInt();
	int b=scanner.nextInt();
	int c=scanner.nextInt();

	int delta = b*b-4*a*c;
	System.out.println("delta is "+delta);

	if(delta > 0)
	{
	System.out.println("roots are real and unequal");
	double root1 = (- b + Math.sqrt(delta)) / (2 * a);
	double root2 = (- b - Math.sqrt(delta)) / (2 * a);
	System.out.println("first root  is:" + root1);
	System.out.println("second root is:" + root2);
	} 
		
	else if(delta == 0)
	{
	System.out.println("roots are real and equal");
	double root1 = ( - b + Math.sqrt(delta)) / (2 * a);
	System.out.println("root1:" + root1);
	}
		
	else
	{
	System.out.println("roots are imaginary");
	}
} 
}