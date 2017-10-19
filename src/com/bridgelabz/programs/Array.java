
/****************************************************************************** 
 *  Purpose: Program for reading and printing 2D array.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   3-10-2017
 *
 ******************************************************************************/

package com.bridgelabz.programs;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;
public class Array
{
	static int rows,columns,total;
	

	public static void main(String args[])throws Exception
	{
	Scanner scanner = new Scanner(System.in);

	System.out.println(" 1: Integer \n 2:Double \n 3:Boolean");
	int choice = scanner.nextInt();
	
	switch(choice)
	{
		case 1:
		intInputArray();
		break;
	
		case 2:
		doubleInputArray();
		break;
			
		case 3:
		booleanInputArray();
		break;
		
		default:
		System.out.println("wrong choice");	
	}
	}
	
	/*
	 * method for accepting integer elements
	 */
	public static void intInputArray()
	{
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter number of rows");
	rows = scanner.nextInt();
	System.out.println("enter number of columns");
	columns= scanner.nextInt();
	total = rows*columns;
	
	int [][]intArray = new int [rows][columns];
	System.out.println("enter " +total+ "integer elements");
		for(int i=0; i<rows ; i++)
		{
		for(int j=0;j<columns; j++)
		{
		intArray[i][j] = scanner.nextInt();
		}
		}
	intOutputArray(intArray);
	}
	
	
	/*
	 * method for displaying integer elements in a 2D array fromat
	 */
	public static void intOutputArray(int intArray[][])
	{
	System.out.println("elements of integer array are :");
	PrintWriter printwriter = new PrintWriter(new OutputStreamWriter(System.out));
		for(int i=0; i<rows ; i++)
		{
		for(int j=0;j<columns; j++)
		{
		printwriter.print("\t"+intArray[i][j]);
		}
		printwriter.flush();
		System.out.println("\n");
		}	
	}

	
	/*
	 * this method accepts double elements from user
	 */
	public static void doubleInputArray()
	{
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter number of rows");
	rows = scanner.nextInt();
	System.out.println("enter number of columns");
	columns= scanner.nextInt();

	double [][]doubleArray = new double[rows][columns];
	total = rows*columns;
		
	System.out.println("enter " +total+ "double elements");
		for(int i=0; i<rows ; i++)
		{
		for(int j=0;j<columns; j++)
		{
		doubleArray[i][j] = scanner.nextDouble();
		}
		}
	doubleOutputArray(doubleArray);
	}

	/*
	 * this method displays double elements in a 2D array format
	 */
	public static void doubleOutputArray(double doubleArray[][])
	{
	System.out.println("elements of double array are :");
	PrintWriter printwriter = new PrintWriter(new OutputStreamWriter(System.out));
		for(int i=0; i<rows ; i++)
		{
		for(int j=0;j<columns; j++)
		{
		printwriter.print("\t"+doubleArray[i][j]);
		printwriter.flush();
		}
		System.out.println("\n");
		}
	
	}

	/*
	 * this method accepts elements of boolean type from the user
	 */
	public static void booleanInputArray()
	{
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter number of rows");
	rows = scanner.nextInt();
	System.out.println("enter number of columns");
	columns= scanner.nextInt();
	total = rows+columns;
	
	boolean [][]booleanArray = new boolean[rows][columns];
	System.out.println("enter " +total+ "boolean elements");
		for(int i=0; i<rows ; i++)
		{
		for(int j=0;j<columns; j++)
		{
		booleanArray[i][j] = scanner.nextBoolean();
		}
		}
	booleanOutputArray(booleanArray);
	}

	
	/*
	 * method to display boolean output in a 2D array format
	 */
	public static void booleanOutputArray(boolean booleanArray[][])
	{
	System.out.println("elements of boolean array are :");
	PrintWriter printwriter = new PrintWriter(new OutputStreamWriter(System.out));
		for(int i=0; i<rows ; i++)
		{
		for(int j=0;j<columns; j++)
		{
		printwriter.print("\t"+booleanArray[i][j]);
		printwriter.flush();
		}
		System.out.println("\n");
		}
	
	}	
}