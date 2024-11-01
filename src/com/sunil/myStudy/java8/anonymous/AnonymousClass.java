/*
*
*N Sunil 
*
*/

package com.sunil.myStudy.java8.anonymous;

public class AnonymousClass
{

	public static void main(String[] args)
	{
		System.out.println("Parent Thread");
		AnonymousClass a = new AnonymousClass();
		a.anonymousClass();
		a.anonymousInnerClass();
	}
	
	private void anonymousClass()
	{
		Runnable run = new Runnable()
		{
			@Override
			public void run()
			{
				System.out.println("Child Thread");
			}
		};
		Thread t = new Thread(run);
		t.start();
	}
	
	private void anonymousInnerClass()
	{
		Thread t = new Thread(new Runnable() 
		{
			@Override
			public void run()
			{
				System.out.println("[AnonymousClass][anonymousInnerClass]");
			}
		});
		t.start();
	}

}
