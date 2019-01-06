package javaAssignm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupChar {

	//Using boolean function
	static String str = "afsjeadrffafvgdefeverhfgberAAad";
	
	
	static String removeDupChar(String str)
	{
		int len= str.length();
		String result="";
		result=result+str.charAt(0);
		boolean flag;
			for(int i=1;i<len;i++)
			{
				flag=false;
				//System.out.println("inside 1st loop");
				for(int j=0;j<i;j++)
				{
					//System.out.println("inside 2nd loop");
					if(str.charAt(j)==str.charAt(i))
						flag=true;
					
				}
				if(flag==false)
					result=result+str.charAt(i);
			}
		System.out.println("out4");
		return result;
	}
	
	//using Set collections
	static String removeDuUSet(String str)
	{
		System.out.println(str);
		char[] ch= str.toCharArray();
		Set<Character> hashSet = new HashSet<Character>();
		//LinkedHashSet<String> lsh = new LinkedHashSet<String>();
		StringBuilder stb = new StringBuilder();
		for(char value :ch){
			hashSet.add(value);
			}
		//System.out.println(hashSet);
		for (char ch1 :hashSet)
		{
			stb.append(ch1);
			//System.out.println(stb);
		}
		return stb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		System.out.println("REsult :  "+removeDupChar(str));
		System.out.println(removeDuUSet(str));
		
	}

	
}
