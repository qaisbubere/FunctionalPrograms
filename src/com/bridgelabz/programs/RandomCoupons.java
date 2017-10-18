
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

public class RandomCoupons
{	
	static Scanner scanner = new Scanner(System.in);
	static int count = 0, iteration =0,flag, i=0, random1, random2,n,num;
	
	
	public static void coupons(int num)
	{	
		int []array = new int[num];
		random1 = 1 + (int)(Math.random() * num);
		array[i] = random1;	
		count++;
		iteration++;
		while(count != num)
		{	
		int length = array.length;
		iteration++;
		random2 = 1 + (int)(Math.random() * num);
		flag = 0;
		for(int j=length-1;j>=0;j--)
		{
			if(random2 == array[j])
			{
				flag = 1;
			}
			
		}
		if(flag == 0)
		{	i++;
			array[i] = random2;//i++;
			count++;	
		}
		
		}
		
		System.out.println("distinct coupons are ");
		for( int p = 0;p<num ; p++)
		{
			System.out.print(array[p]+" ");
		}
		System.out.println();
		System.out.println(+iteration+" iterations are required to generate "+num+" coupons");
	}
	
	public static void main(String args[])
	{
		System.out.println("how many distinct coupons do you want?");
		n = scanner.nextInt();
		coupons(n);
	}
}