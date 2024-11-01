/*
*
*N Sunil 
*
*/

package com.sunil.myStudy.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.sunil.myStudy.jdbc.JdbcExample;

public class StreamsExample
{

	public static void main(String[] args)
	{
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(64);
		intList.add(84);
		intList.add(75);
		intList.add(24);
		intList.add(43);
		intList.add(98);
		intList.add(12);
		intList.add(81);
		System.out.println(intList);
				
//		Using filter(Predicate)
		List<Integer> updateList = intList.stream().filter(marks -> marks>35).collect(Collectors.toList());
		System.out.println(updateList);
		
//		Using map(Function)
		updateList = intList.stream().map(marks -> (marks>35) ? marks : marks+5).collect(Collectors.toList());
		System.out.println(updateList);
		
//		Using count
		long failedStudents = intList.stream().filter(marks -> marks<35).count();
		System.out.println(failedStudents);
		
//		sorted() sort Comparable type objects
		updateList = intList.stream().sorted().collect(Collectors.toList());
		System.out.println(updateList);
		
		Comparator<Integer> com = (a,b)-> a.compareTo(b);
		
//		sorted(Comparator)
		updateList = intList.stream().sorted(com).collect(Collectors.toList());
		System.out.println(updateList);
		
		int maxNum = intList.stream().max(com).get();
		int minNum = intList.stream().min(com).get();
		System.out.println(maxNum);
		System.out.println(minNum);
		
		Consumer<Integer> con = i -> {System.out.println(i);};
		intList.stream().forEach(con);
		
		Integer[] intArr = (Integer[]) intList.stream().toArray(Integer[]::new);
		Stream.of(intArr).forEach(System.out::print);
		System.out.println();
		Stream<Integer> stream = Arrays.stream(intArr);
		stream.forEach(System.out::print);
		System.out.println();
		
	}
}
