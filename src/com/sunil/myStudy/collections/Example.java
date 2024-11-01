/*
*
*@author N Sunil 
*
*/

package com.sunil.myStudy.collections;

import java.util.HashMap;
import java.util.HashSet;

public class Example
{

	public static void main(String[] args)
	{
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Sunil", "Sunil");
		map.put("S", "Sunil");
		map.put("Sunil", "Sunil");
		System.out.println(map.size());
		
		HashSet<String> set = new HashSet<String>();
		set.add("Sunil");
		set.add("S");
		set.add("Sunil");
		System.out.println(set.size());
		
	}

}
