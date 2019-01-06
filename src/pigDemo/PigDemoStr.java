package pigDemo;

public class PigDemoStr {
	
	public static void main(String[] args) {
		
		String str = "Parveen", strRev ="";
		int len = str.length();
		
		for (int i=len-1; i>=0;i--){
			strRev= strRev + str.charAt(i);
		}
		System.out.println(strRev);
	}

}
