/*
*
*N Sunil 
*
*/

package com.sunil.myStudy.java8.multiThreading;

import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MultiThreadingExample
{

	public static void main(String[] args) throws InterruptedException
	{
//		Runnable r = new MyRunnable();
//		Thread thread = new Thread(r);
//		thread.start();
//		
//		Runnable run = ()->
//		{
//			System.out.println("Thread name : "+Thread.currentThread().getName() );
//		};
//		thread = new Thread(run);
//		thread.start();
		
//		Creating Fixed Threads
//		BlockingQueue<Runnable> queue = new LinkedBlockingQueue<Runnable>(100);
//		for(int i = 1; i<=100; i++)
//		{
//			System.out.println("--- "+i+" ---");
//			queue.put(new MyRunnable());
//		}
//		
//		ThreadPoolExecutor threadPoolExe = new ThreadPoolExecutor(10, 10, 10, TimeUnit.SECONDS, queue, new ThreadPoolExecutor.AbortPolicy());
//		threadPoolExe.prestartAllCoreThreads();
//		
//		for(int i = 101; i<=1000; i++)
//		{
//			System.out.println("--- "+i+" ---");
//			queue.put(new MyRunnable());
//		}
//		
//		System.out.println("-----------------Main Thread name : "+Thread.currentThread().getName());
//		Thread.sleep(10000);
//		for(int i = 1; i<=1000; i++)
//		{
//			System.out.println("--- "+i+" ---");
//			queue.put(new MyRunnable());
//		}
		
//		Creating Cache thread pool
		BlockingQueue<Runnable> synQueue = new SynchronousQueue<Runnable>();
		ThreadPoolExecutor cacheThreadPool = new ThreadPoolExecutor(20000, Integer.MAX_VALUE, 5, TimeUnit.SECONDS, synQueue);
		int count = cacheThreadPool.prestartAllCoreThreads();
		System.out.println("-----------------Main Thread name : "+Thread.currentThread().getName()+", Count : "+count);
		
		while(true)
		{
			Scanner scn = new Scanner(System.in);
			System.out.print("Enter next thread : ");
			int size = scn.nextInt();
			thread(size, synQueue);
			Thread.sleep(5000);
		}
	}
	
	private static void thread(int size, BlockingQueue<Runnable> synQueue) throws InterruptedException
	{
		for(int i = 1; i<=size; i++)
		{
			System.out.println("--- "+i+" ---");
			synQueue.put(new MyRunnable());
		}
	}

}
