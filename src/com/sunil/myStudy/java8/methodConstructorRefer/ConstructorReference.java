/*
*
*N Sunil 
*
*/

package com.sunil.myStudy.java8.methodConstructorRefer;

class ConstructorClass
{
	public ConstructorClass()
	{
		System.out.println("ConstructorClass class constructor");
	}
}

public class ConstructorReference
{

	public static void main(String[] args)
	{
		
		ConInter con = ConstructorClass::new;
		System.out.println("Executing Constructor starts");
		con.getObject();
	}
}