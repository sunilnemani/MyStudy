/*
*
*N Sunil 
*
*/

package com.sunil.myStudy.java8.predefinedFunctionalInter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedExample
{
	
	public static void main(String[] args)
	{
//		Function<T, R>
		Function<Integer, Integer> f1 = i -> i*i;
		Function<Integer, Integer> f2 = i -> i+2;
		System.out.println(f1.apply(5));
		System.out.println(f1.andThen(f2).apply(5));
		
//		Preditcate<T>
		Predicate<Integer> p1 = i -> i%2==0;
		Predicate<Integer> p2 = i -> i>10 && i<90;
		System.out.println(p1.test(5));
		System.out.println(p1.and(p2).test(112));
		List<Integer> intList = new ArrayList<Integer>();
		int[] in = {8,3,9,33,21,6,98,11,12,26,72,33,48};
		for(int i : in)
		{
			if(p1.and(p2).test(i))
			{
				intList.add(i);
			}
		}
		System.out.println(intList);
		
		
//		Consumer<T>
		Consumer<Integer> con = i->System.out.println(i);
		con.accept(5);
		
		
//		Supplier<T>
		Supplier<String> sup = () -> {
			String otp = "";
			for(int i = 1; i <= 6; i++)
			{
				otp = otp+(int)(Math.random()*10);
			}
			return otp;
		};
		System.out.println(sup.get());
		
//		BiPredicate<T, U>
		BiPredicate<Integer, Integer> biPre = (a, b)->(a+b)%2==0;
		System.out.println(biPre.test(11, 53));
		
		
//		BiFunction<T, U>
		BiFunction<Integer, Integer, String> biFun = (a, b)->""+a+b;
		System.out.println(biFun.apply(64, 28));
		
//		BiConsumer<T, U>
		BiConsumer<String, String> biCon = (a, b)-> System.out.println(a+" "+b);
		biCon.accept("Sunil", "Nemani");
		
	}

}
