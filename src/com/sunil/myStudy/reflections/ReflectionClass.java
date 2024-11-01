/*
*
*@author N Sunil 
*
*/

package com.sunil.myStudy.reflections;

public class ReflectionClass
{
	
	private int ref;
	
	public ReflectionClass()
	{
		System.out.println("Reflection()");
	}
	
	public ReflectionClass(Integer ref)
	{
		this.ref=ref;
		System.out.println("ReflectionClass(int ref) : "+this.ref);
	}
	
	public void nonStatic()
	{
		System.out.println("nonStatic()");
	}
	
	public void nonStatic(String name)
	{
		System.out.println("nonStatic(String name) : "+name);
	}
	
	public static void staticMethod()
	{
		System.out.println("staticMethod()");
	}
	
	public static void staticMethod(String name)
	{
		System.out.println("staticMethod(String name) : "+name);
	}

	@Override
	public String toString()
	{
		return "ReflectionClass [ref=" + ref + "]";
	}
	
}
