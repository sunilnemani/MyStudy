/*
*
*@author N Sunil 
*
*/

package com.sunil.myStudy.multiThreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorExample
{

	public static void main(String[] args)
	{
		
		BlockingQueue<Runnable> blockingQueue = new ArrayBlockingQueue<Runnable>(5, true);
		
		ThreadPoolExecutor threadPoolExecutor = new CustomThreadPoolExecutor(2, 5, 5, TimeUnit.SECONDS, blockingQueue, new ThreadPoolExecutor.DiscardOldestPolicy());
		
		for(int i = 1; i <= 20; i++)
		{
			System.out.println("---------- "+i+" ---------");
//			threadPoolExecutor.execute(new ExecutorRunnable(i));
			threadPoolExecutor.submit(new ExecutorRunnable(i));
			
		}
	}
}

class CustomThreadPoolExecutor extends ThreadPoolExecutor
{

	public CustomThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, 
			TimeUnit unit, BlockingQueue<Runnable> workQueue, RejectedExecutionHandler handler)
	{
		super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, handler);
		super.allowCoreThreadTimeOut(true);
	}
	
}

class ExecutorRunnable implements Runnable
{
	private int var;

	
	public ExecutorRunnable(int var)
	{
		super();
		this.var = var;
	}


	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" ==> "+var);
		try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
}
