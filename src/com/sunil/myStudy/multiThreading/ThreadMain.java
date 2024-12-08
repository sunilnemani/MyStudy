/*
*
*@author N Sunil 
*
*/

package com.sunil.myStudy.multiThreading;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ThreadMain
{
	
	public static void main(String[] args) throws Exception
	{
		SharedObject sharedObj = new SharedObject(5);
		
		Thread producerThread = new Thread(()-> 
		{
			try
			{
				sharedObj.produce();
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		Thread consumerThread = new Thread(()-> 
		{
			try
			{
				sharedObj.consume();
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		producerThread.start();
		Thread.sleep(2000);
		consumerThread.start();
	}
}

class SharedObject
{
	
	private Queue<String> queue;
	
	public SharedObject(Integer threshHoldSize)
	{
		queue = new LinkedList<String>();
	}
	
	public synchronized void produce() throws InterruptedException
	{
		try (Scanner scn = new Scanner(System.in))
		{
			while(true)
			{
				System.out.print("Enter Elements : ");
				String element = scn.next();
				System.out.println("Adding elements");
				queue.addAll(Arrays.asList(element.split(",")));
				System.out.println("queue is full. Producer is waiting");
				wait();
				System.out.println("Notifying Consumer Thread");
				notify();
			}
		}
	}
	
	public synchronized void consume() throws InterruptedException
	{
		while(true)
		{
			System.out.println("Notifying Producer Thread ");
			notify();
			System.out.println("Consuming Elements");
			while(!queue.isEmpty())
			{
				System.out.println("Retreiving Element : "+queue.poll());
			}
			if(queue.isEmpty())
			{
				System.out.println("queue is empty. Consumer is waiting");
				wait();
			}
		}
	}
}

