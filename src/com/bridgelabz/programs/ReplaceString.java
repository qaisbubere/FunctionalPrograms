
/****************************************************************************** 
 *  Purpose: replace the string with given "username".
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   3-10-2017
 *
 ******************************************************************************/

package com.bridgelabz.programs;
import java.util.Scanner;

public class ReplaceString{
	static String inputstring;
	static String string1; 
	public static void main(String[]args){  
		replaceString();
	}
	
	/*
	 * to replace the given string with user defined string
	 */
	public static void replaceString(){
		Scanner scanner = new Scanner(System.in);
		string1 = "Hello <<UserName>>, How are you?";

		System.out.println("Given string is: \n Hello <<UserName>>, How are you?");
		System.out.println(" enter your name");
		inputstring = scanner.next();
		 
			if(inputstring.length() >= 3){
				String replacestring =string1.replace("<<UserName>>",inputstring); 
				System.out.println("replaced string is \n"+replacestring);
			}
			else{
				System.out.println("please enter more than 3 characters");
				replaceString();
			}
	}
} 
