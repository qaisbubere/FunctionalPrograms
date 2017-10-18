
/****************************************************************************** 
 *  Purpose: A library for reading and printing 2D array.
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
	static int Rows,Columns,total,i,j;
	

	public static void main(String args[])throws Exception
	{
	Scanner scanner = new Scanner(System.in);

	System.out.println(" 1: Integer \n 2:Double \n 3:Boolean");
	int choice = scanner.nextInt();
	
	switch(choice)
	{
	case 1:
	IntInputArray();
	break;

	case 2:
	DoubleInputArray();
	break;
		
	case 3:
	BooleanInputArray();
	break;
	
	default:
	System.out.println("wrong choice");	
	}
	}
	
	
	public static void IntInputArray()
	{
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter number of rows");
	Rows = scanner.nextInt();
	System.out.println("enter number of columns");
	Columns= scanner.nextInt();
	total = Rows*Columns;
	
	int [][]intarray = new int [Rows][Columns];
	System.out.println("enter " +total+ "integer elements");
	for(i=0; i<Rows ; i++)
	{
	for(j=0;j<Columns; j++)
	{
	intarray[i][j] = scanner.nextInt();
	}
	}
	IntOutputArray(intarray);
	}
	
	public static void IntOutputArray(int intarray[][])
	{
	System.out.println("elements of integer array are :");
	PrintWriter printwriter = new PrintWriter(new OutputStreamWriter(System.out));
	for(i=0; i<Rows ; i++)
	{
	for(j=0;j<Columns; j++)
	{
	printwriter.print("\t"+intarray[i][j]);
	printwriter.flush();
	}
	System.out.println("\n");
	}
	
	}

	
	public static void DoubleInputArray()
	{
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter number of rows");
	Rows = scanner.nextInt();
	System.out.println("enter number of columns");
	Columns= scanner.nextInt();

	double [][]darray = new double[Rows][Columns];
	total = Rows*Columns;
		
	System.out.println("enter " +total+ "double elements");
	for(i=0; i<Rows ; i++)
	{
	for(j=0;j<Columns; j++)
	{
	darray[i][j] = scanner.nextDouble();
	}
	}
	DoubleOutputArray(darray);
	}

	
	public static void DoubleOutputArray(double darray[][])
	{
	System.out.println("elements of double array are :");
	PrintWriter printwriter = new PrintWriter(new OutputStreamWriter(System.out));
	for(i=0; i<Rows ; i++)
	{
	for(j=0;j<Columns; j++)
	{
	printwriter.print("\t"+darray[i][j]);
	printwriter.flush();
	}
	System.out.println("\n");
	}
	
	}

		
	public static void BooleanInputArray()
	{
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter number of rows");
	Rows = scanner.nextInt();
	System.out.println("enter number of columns");
	Columns= scanner.nextInt();

	boolean [][]barray = new boolean[Rows][Columns];
	System.out.println("enter " +total+ "boolean elements");
	for(i=0; i<Rows ; i++)
	{
	for(j=0;j<Columns; j++)
	{
	barray[i][j] = scanner.nextBoolean();
	}
	}
	BooleanOutputArray(barray);
	}

	

	public static void BooleanOutputArray(boolean barray[][])
	{
	System.out.println("elements of boolean array are :");
	PrintWriter printwriter = new PrintWriter(new OutputStreamWriter(System.out));
	for(i=0; i<Rows ; i++)
	{
	for(j=0;j<Columns; j++)
	{
	printwriter.print("\t"+barray[i][j]);
	printwriter.flush();
	}
	System.out.println("\n");
	}
	
	}
	
	 

	
}