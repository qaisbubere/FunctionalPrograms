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

public class Harmonic{	
	static int numerator = 1, denominator;
	
	public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter a number");
	int number = scanner.nextInt();
	
	for(int i =1;i<=number;i++){
	denominator = i;
	System.out.print(numerator+"/"+denominator);
	
	if(denominator<number)
		System.out.print(" + ");	
	} 
	System.out.println();
}
}