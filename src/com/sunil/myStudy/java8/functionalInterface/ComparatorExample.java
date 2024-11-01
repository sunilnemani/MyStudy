/*
*
*N Sunil 
*
*/

package com.sunil.myStudy.java8.functionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorExample implements Comparator<Integer>
{

	@Override
	public int compare(Integer arg1, Integer agr2)
	{
		if(arg1<agr2)
		{
			return -1;
		}
		else if(arg1>agr2)
		{
			return 1;
		}
		return 0;
	}

	public static void main(String[] args)
	{
		int[] intArr = {5,2,8,9,4,0,9};
		String[] strArr = {"Sunil","Chetan", "Kalyan", "Ambresh"};
		
		List<Integer> intList = Arrays.stream(intArr).boxed().collect(Collectors.toList());
		List<String> strList = Arrays.stream(strArr).collect(Collectors.toList());
//		Collections.sort(list, new ComparatorExample());
//		System.out.println(list);

		Comparator<Integer> comInt = (a, b)->(a<b)?-1:(a>b)?1:0;
		Comparator<String> comStr = (a, b)-> a.compareTo(b);
		
		Collections.sort(intList, comInt);
		Collections.sort(strList, comStr);
		
		System.out.println(intList);
		System.out.println(strList);
	}

}
