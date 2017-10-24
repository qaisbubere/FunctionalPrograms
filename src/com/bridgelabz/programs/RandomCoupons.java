
/****************************************************************************** 
 *  Purpose: to find N distinct Coupon numbers;
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   3-10-2017
 *
 ******************************************************************************/

package com.bridgelabz.programs;
import java.util.Scanner;

public class RandomCoupons{	
	static Scanner scanner = new Scanner(System.in);
	static int count = 0, iteration =0,flag, i=0, random1, random2,number;
	
	
	/*
	 * method to generate n number of distinct coupons.
	 */
	public static void coupons(int number){	
		int []array = new int[number];
		random1 = 1 + (int)(Math.random() * number);
		array[i] = random1;	
		count++;
		iteration++;
		
		while(count != number){	
		int length = array.length;
		iteration++;
		random2 = 1 + (int)(Math.random() * number);
		System.out.println(random2);
		flag = 0;
		for(int j=length-1;j>=0;j--){
			if(random2 == array[j])
				flag = 1;	
		}
		if(flag == 0){	
			i++;
			array[i] = random2;
			count++;	
		}
		}
		
		System.out.println("distinct coupons are ");
		for(int p = 0;p<number ; p++){
			System.out.print(array[p]+" ");
		}
		System.out.println();
		System.out.println(+iteration+" iterations are required to generate "+number+" coupons");
	}
	
	public static void main(String args[]){
		System.out.println("how many distinct coupons do you want?");
		number = scanner.nextInt();
		coupons(number);
	}
}