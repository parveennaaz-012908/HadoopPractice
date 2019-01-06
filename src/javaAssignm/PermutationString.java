package javaAssignm;

public class PermutationString {
	
	static String str="123";
	static int i = -1;
	static String  permString(String str)
	{
		String temp="";
		
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
			for(int j=0;j<str.length();i++){
				if(i!=j)
					swap(i,j);
			}
			System.out.println(temp);
		}
		
		return temp;
	}
	static  void swap(int i, int j)
	{
		String temp="";
		char ch ;
		ch = str.charAt(i);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 =permString(str);
		System.out.println(str1);
	}

}
