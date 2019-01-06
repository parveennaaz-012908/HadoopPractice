package javaAssignm;

public class PrintDupChar {

	static String str = "Java and JavaScript";
	static final int ASCII_SIZE = 256;
	static int[] count = new int[ASCII_SIZE];
	
	static void printDupChar(String str)
	{
		int len = str.length();
		//int counter =0;
		
		for(int i=0;i<len;i++){
			count[str.charAt(i)]++;
			//System.out.println(str.charAt(i));
		}
		char[] result = new char[ASCII_SIZE];
		for(int i=0;i<len;i++){
			if(count[str.charAt(i)]>1){
			System.out.println( str.charAt(i));
			result[i]=str.charAt(i);}
		
		}
		//System.out.println(result);
	}
		//return result;}
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		System.out.println("hello");
 		printDupChar(str);
	}

}
