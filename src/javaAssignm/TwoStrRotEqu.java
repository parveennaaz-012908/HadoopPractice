package javaAssignm;

public class TwoStrRotEqu {
	static String str1 = "XYZ";
	static String str2="ZYX";
	
	static String strR= "Parveen";
	
	static boolean twoStrRoE(String str1, String str2){
		int len= str1.length();
		String temp ="";
		for(int i=len-1;i>-1;i--)
		{
			temp=temp+str1.charAt(i);
		}
		if(temp.equals(str2))
			return true;
		else return false;
	}

	static boolean twoStrRoUWh(String str, String str1)
	{
		int len=str.length()-1;
		String tems="";
		while(len>-1)
		{
			tems=tems+str.charAt(len);
			len--;
		}
		if(tems.equals(str1))
			return true;
		else return false;
	}
	
	static String reverseStrURec(String str)
	{
		if(str==null||str.length()<=1)
			return str;
	return reverseStrURec(str.substring(1))+str.charAt(0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flag = twoStrRoE(str1, str2);
		System.out.println(flag);
		flag=twoStrRoUWh(str1, str2);
		System.out.println(flag);
	System.out.println(strR.length()+":"+strR.substring(1));
		String reverseStr= reverseStrURec(strR);
		System.out.println(reverseStr);
	}

}
