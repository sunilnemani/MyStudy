/*
*
*@author N Sunil 
*
*/

package com.sunil.myStudy.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class RefleactionExample
{

	public static void main(String[] args)
	{
		ReflectionClass reflection = null;
		try
		{
//			Class<?> clas = ReflectionClass.class;
			Class<?> clas =  Class.forName("com.sunil.myStudy.reflections.ReflectionClass");
			
			Constructor<?> declaredCon = clas.getDeclaredConstructor(Integer.class);
			Constructor<?> conNoPara = clas.getConstructor(null);
			
			Object obj = declaredCon.newInstance(5);
			Object objNoPara = conNoPara.newInstance();
			
//			non-static method with no parameters
			Method nonStatic = clas.getDeclaredMethod("nonStatic", null);
			nonStatic.invoke(obj, null);
			
//			non-static method with String parameter
			Method nonStaticPara = clas.getDeclaredMethod("nonStatic", String.class);
			nonStaticPara.invoke(obj, "Sunil");
			
			Method staticMethod = clas.getDeclaredMethod("staticMethod", null);
			staticMethod.invoke(null, null);
			
			Method staticMethodPara = clas.getDeclaredMethod("staticMethod", String.class);
			staticMethodPara.invoke(null, "Sunil");
			if(obj instanceof ReflectionClass)
			{
				reflection = (ReflectionClass)obj;
			}
			System.out.println(reflection);
			
		}
		catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
}
