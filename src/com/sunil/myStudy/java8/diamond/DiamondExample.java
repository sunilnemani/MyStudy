/*
*
*N Sunil 
*
*/

package com.sunil.myStudy.java8.diamond;

public class DiamondExample implements A, B
{
	
	public DiamondExample()
	{
		super();
	}

	@Override
	public void m1()
	{
		System.out.println("DiamondExample : m1");
	}

	@Override
	public void m2()
	{
		System.out.println("DiamondExample : m2");
	}
	
	@Override
	public void defaultMethod()
	{
		A.super.defaultMethod();
	}

	public static void main(String[] args)
	{
		DiamondExample d = new DiamondExample();
		d.m1();
		B.m();
		
	}
	
}
