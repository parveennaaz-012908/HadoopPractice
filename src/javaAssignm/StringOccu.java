package javaAssignm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class StringOccu{
	
	static String str = "AAA BBB CCC DDD AAA BBB CCC AAA";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringTokenizer strt = new StringTokenizer(str);
		Map <String, Integer> mp = new HashMap<String, Integer>();
		String temp ="";
		Integer key=1;
		
		//System.out.println("Wordcount"+strt.countTokens());
		while(strt.hasMoreTokens()){
			//System.out.println(key);
		temp=strt.nextToken();
		
		
		if(mp.containsKey(temp)){
			//System.out.println(mp);
			mp.put(temp, mp.get(temp)+1);
			//System.out.println("inside if");
		}
		else{
			//key=0;
			
			mp.put(temp, key);
			//System.out.println(mp.values());
			//System.out.println("inside else");
			//System.out.println(mp);
		}
			//System.out.println(mp);
			
			//System.out.println(mp.keySet());
			//System.out.println(mp.values());	
			
			}
		System.out.println(mp);
	
		/*String a="";		
		HashSet hs = new HashSet();
		int count=0;
		StringTokenizer strs = new StringTokenizer(str);
			 while(strs.hasMoreTokens())
			 {
				 count=0;
				  a = strs.nextToken();
				  if(hs.contains(a)){
					  count++;
				  }
				  else{
					  hs.add(a);
				  }
				  System.out.println(a+" "+count);
				  
			 }
			 
			 List mp = new ArrayList();
			StringTokenizer str1 = new StringTokenizer(str);
			 while(str1.hasMoreTokens())
			 {
				 
				  a = str1.nextToken();
				  mp.add(a);
				  System.out.println(a);
				  
			 }*/
			

	}

}
