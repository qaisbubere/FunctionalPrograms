/****************************************************************************** 
 *  Purpose: To develop stop watch program and get elapsed time between start and stop.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   4-10-2017
 *
 ******************************************************************************/

package com.bridgelabz.programs;
import java.lang.*;

public class StopWatch
{

	static long startTime = 0;
	static long stopTime = 0;
	
	public static void start()
	{
	startTime = System.currentTimeMillis();	
	try{
	Thread.sleep(1000);
	}
 	catch (InterruptedException ex){}
	 
	}

	public static void stop()
	{
	stopTime = System.currentTimeMillis();	
	}


	public void getElapsedTime()
	{
	long elapsed;
	
    elapsed = (stopTime - startTime);
 
	System.out.println("elapsed time is : "+elapsed);
	}


	public static void main(String[]args) throws Exception
	{
	StopWatch sw = new StopWatch();
	sw.start();
	sw.stop();
	sw.getElapsedTime();
	}
}