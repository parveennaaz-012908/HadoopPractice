package javaAssignm;

public class MaxCharOccur {

	static String str ="Javaakaak";
	
	static final int ASCII_SIZE = 256;
    static char getMaxOccuringChar(String str)
    {
        // Create array to keep the count of individual
        // characters and initialize the array as 0
        int count[] = new int[ASCII_SIZE];
      
        // Construct character count array from the input
        // string.
          int len = str.length();
          System.out.println("test"+count[str.charAt(8)]);
        for (int i=0; i<len; i++){
        	//System.out.println(str.charAt(i));
        	
            int num =count[str.charAt(i)]++;
            System.out.println(num+" "+str.charAt(i));
            num=str.charAt(i);
            System.out.println("hello" + num);
            }
      
        int max = -1;  // Initialize max count
        char result = ' ';   // Initialize result
      
        // Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
                System.out.println(max+result+count[i]);
            }
        }
      
        return result;}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("run");
		System.out.println(getMaxOccuringChar(str));
		str=str.toLowerCase();
		//maxOccurChar(str);
		/*	 run infinite loop
	 * for(;;)
		{
			//System.out.println("run");
		}*/
		
	}
	
	static char maxOccurChar(String str)
	{
		int len =str.length();
	 char[] ch = new char[len];
	 
	 for(int i =0; i<len;i++){
		 ch[i]=str.charAt(i);
		System.out.println(ch[i]);
	 }
return 'c';
	}
}
