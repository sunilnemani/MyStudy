/*
*
*N Sunil 
*
*/

package com.sunil.myStudy.java8.multiThreading;

public class MyRunnable implements Runnable
{

	@Override
	public void run()
	{
//		try
//		{
//			Thread.sleep(5);
//		}
//		catch (InterruptedException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("Thread name : "+Thread.currentThread().getName());
	}

}
