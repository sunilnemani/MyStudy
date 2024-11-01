/*
*
*N Sunil 
*
*/

package com.sunil.myStudy.java8.anonymous;

public class NestedClass
{
	
	public static class StaticInnerClass
	{
		public void method()
		{
			System.out.println("StaticInnerClass : method");
		}
	}
	
	public class NonStaticInnerClass
	{
		public void method()
		{
			System.out.println("NonStaticInnerClass : method");
		}
	}
	
	public void methodWithAnonymousClass()
	{
		System.out.println("NestedClass : methodWithAnonymousClass");
		
		Runnable run = new Runnable()
		{
			@Override
			public void run()
			{
				System.out.println("NestedClass : methodWithAnonymousClass : run");
			}
		};
		Thread t = new Thread(run);
		t.start();
	}

	public void methodWithLocalClass()
	{
		
		System.out.println("NestedClass : methodWithLocalClass");
		
		class LocalClass
		{
			public void methodInLocalClass()
			{
				System.out.println("LocalClass : methodInLocalClass");
			}
		}
		LocalClass localClass = new LocalClass();
		localClass.methodInLocalClass();
	}
	
	public static void main(String[] agrs)
	{
		NestedClass nestedClass = new NestedClass();
		
		StaticInnerClass staticInnerClass = new StaticInnerClass();
		staticInnerClass.method();
		
		NonStaticInnerClass nonStatic = nestedClass.new NonStaticInnerClass();
		nonStatic.method();
		
		nestedClass.methodWithAnonymousClass();
		nestedClass.methodWithLocalClass();
	}
	
}			
