
/****************************************************************************** 
 *  Purpose: replace the string with given username.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   3-10-2017
 *
 ******************************************************************************/

package com.bridgelabz.programs;
import java.util.Scanner;

public class ReplaceString
{
public static void main(String[]args)
{  String inputstring;
String string1; 
	 do
	 {
	Scanner scanner = new Scanner(System.in);
	 string1 = "Hello <<UserName>>, How are you?";

	System.out.println("Given string is: \n Hello <<UserName>>, How are you?");
	System.out.println(" enter your name");
	 inputstring = scanner.next();
	 }while(inputstring.length()<3);
	String replacestr =string1.replace("<<UserName>>",inputstring); 
	System.out.println("replaced string is \n"+replacestr);
}
} 
