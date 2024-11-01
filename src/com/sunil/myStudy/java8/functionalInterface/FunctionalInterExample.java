/*
*
*N Sunil 
*
*/

package com.sunil.myStudy.java8.functionalInterface;

public class FunctionalInterExample
{
	
	public static void main(String[] args)
	{
		ImplementorInterface i = (a, b)-> a+b;
		System.out.println(i.add(5,10));
		
		ImplementorInterface j = (a, b)->{int res = a+b;return res;};
		System.out.println(j.add(10, 10));
	}

}