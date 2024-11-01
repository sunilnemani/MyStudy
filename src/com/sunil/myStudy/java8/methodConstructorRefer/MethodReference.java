/*
*
*N Sunil 
*
*/

package com.sunil.myStudy.java8.methodConstructorRefer;

public class MethodReference
{

	public static void main(String[] args)
	{
		Runnable run = MethodReference::method;
		run.run();
		System.out.println("-----------------------------");
		Thread t = new Thread(run);
		t.start();
		
		run = new MethodReference()::nonStaticMethod;
		t = new Thread(run);
		t.start();
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Parent Thread : "+ Thread.currentThread().getName());
		}
	}
	
	public static void method()
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Child Thread : "+ Thread.currentThread().getName());
		}
	}
	
	public void nonStaticMethod()
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Child Thread : "+ Thread.currentThread().getName());
		}
	}

}
