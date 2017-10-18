package com.bridgelabz.util;

public class MultiThreadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TFile1 t1=new TFile1();
		TFile2 t2=new TFile2();
		
		Thread num=new Thread(t1);
		Thread alpha=new Thread(t2);
		 
		num.start();
		alpha.start();
		for(int i=1;i<3000;i++)
		{
			System.out.println("From Main");
		}
	
		
		
		
	}

}
