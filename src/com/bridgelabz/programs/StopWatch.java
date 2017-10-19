/****************************************************************************** 
 *  Purpose: To develop stop watch program and get elapsed time between start 
 *  		 and stop.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   4-10-2017
 *
 ******************************************************************************/

package com.bridgelabz.programs;

public class StopWatch
{

	static long startTime = 0;
	static long stopTime = 0;
	
	/*
	 * to get current time which will be treated as start time.
	 */
	public static void start()
	{
	startTime = System.currentTimeMillis();	
	try{
	Thread.sleep(1000);
	}
 	catch (InterruptedException ex){}	 
	}

	/*
	 * to get current time which will be treated as stop time 
	 */
	public static void stop()
	{
	stopTime = System.currentTimeMillis();	
	}


	/*
	 * this method calculates the elapsed time between start() and stop() methods
	 */
	public void getElapsedTime()
	{
	long elapsed;
    elapsed = (stopTime - startTime);
	System.out.println("elapsed time is : "+elapsed);
	}

	public static void main(String[]args) throws Exception
	{
	StopWatch stopwatch = new StopWatch();
	StopWatch.start();
	StopWatch.stop();
	stopwatch.getElapsedTime();
	}
}