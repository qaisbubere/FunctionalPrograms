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

public class PrimeFactor{	
	static int number,remainingNumber;
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[]args){
	primeFactor();
	}
	
	
	/*
	 * method for finding prime factor of given number
	 */
	public static void primeFactor(){
	System.out.println("enter a number");
	number = scanner.nextInt();
	while(number!=1){
	for(int i=2; i<=number; i++){
		while(number%i==0){
		number = number/i;
		System.out.println(i);
		}
	}
	}
	System.out.println("press 1 if you wish to continue");
	int choice = scanner.nextInt();
	if(choice == 1)
	primeFactor();
	}
}