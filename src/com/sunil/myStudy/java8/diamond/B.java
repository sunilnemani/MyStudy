/*
*
*N Sunil 
*
*/

package com.sunil.myStudy.java8.diamond;

public interface B
{
	
	public void m1();
	
	public void m2();
	
	public static void m()
	{
		System.out.println("Static method");
	}
	
	default void defaultMethod()
	{
		System.out.println("B : defaultMethod");
	}

}
