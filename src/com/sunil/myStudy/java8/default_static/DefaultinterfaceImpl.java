/*
*
*N Sunil 
*
*/

package com.sunil.myStudy.java8.default_static;

public class DefaultinterfaceImpl implements DefaultInterface
{

	@Override
	public void method()
	{
		System.out.println("[DefaultinterfaceImpl][method]");
	}
	
	public static void main(String[] args)
	{
		DefaultinterfaceImpl def = new DefaultinterfaceImpl();
		def.method();
		def.defaultMethod();
	}

}
