/*
*
*N Sunil 
*
*/

package com.sunil.myStudy.java8.default_static;

public interface DefaultInterface
{
	
	public void method();
	
	default void defaultMethod()
	{
		System.out.println("[DefaultInterface][defaultMethod]");
	}

}
