package javaAssignm;

public class RemFirString {
	
	static String s1 = "India is great";
	static String s2 ="in";
	
	static String remCharFrStr(String s1, String s2)
	{
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		String result="";
		for(int i=0;i<s2.length();i++)
		{
			for (int j=0;j<s1.length();j++)
			{
				if(s1.charAt(j)!=s2.charAt(i))
					result=result+s1.charAt(j);
				
			}
			s1=result;
			System.out.println(s1);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println(remCharFrStr(s1, s2));
	}

}
