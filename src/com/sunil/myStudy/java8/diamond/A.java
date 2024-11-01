/*
*
*N Sunil 
*
*/

package com.sunil.myStudy.java8.diamond;

public interface A
{
	
	public abstract void m1();
	
	default void defaultMethod()
	{
		System.out.println("A : defaultMethod");
	}

}
