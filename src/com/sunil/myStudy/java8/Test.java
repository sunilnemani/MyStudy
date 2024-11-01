/*
*
*N Sunil 
*
*/

package com.sunil.myStudy.java8;

public class Test
{
	

	public static void main(String[] args)
	{
//		Function<Integer, Integer> function = i -> i*i;
//		System.out.println(""+function.apply(5));
//		
//		Predicate<Integer> predicate = i -> i%2==0;
//		System.out.println(""+predicate.test(5));
//		System.out.println(""+predicate.test(10));
		com();
	}
	
	
	private static void com()
	{
		
		int[] data = {20,3,-10,20,-10,40,-10};
	    int maxProf = 0;
	    int tempProf=0;
	    int start = 0;
	    int tempStart = 0;
	    int end = 0;
	    int tempEnd = 0;
	    
	    //20,30,-10,20,-10,20,30,40
	    for(int i = 0; i<data.length; i++)
	    {
	        int dayProf = data[i];
	        if(dayProf>=0)
	        {
	            if(tempProf==0)
	            {
	                tempStart=i;        //tempstart=5
	            }
	            tempProf+=dayProf;      //  tempProf=90
	        }
	        else
	        {
	            if(tempProf!=0)
	            {
	                tempEnd = i-1;        //tempend=3
	            }
	            
	            if(maxProf<tempProf)
	            {
	                maxProf = tempProf;        //maxProf = 50
	                start = tempStart;        //0
	                end = tempEnd;            //1
	            }
	            tempProf=0;
	        }
	    }
	    if(maxProf<tempProf)
        {
            maxProf = tempProf;        //maxProf = 50
            start = tempStart;        //0
            end = data.length;            //1
        }
	    System.out.println(maxProf +","+start+","+end);
	}

}
