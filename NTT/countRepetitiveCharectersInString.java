package NTT;

public class countRepetitiveCharectersInString {
	
	public static void main(String[] args) {
		qaManager();
	}

	public static void qaManager() {
		String str = "testQA123";
		str = str.toLowerCase();
		int count =0;
		/*
		 * for(int i=0;i<str.length()-1;i++) {
		 * 
		 * for(int j=i+1;j<str.length()-1;j++) {
		 * 
		 * if(str.charAt(i)==str.charAt(j)) { count++; }
		 * 
		 * }
		 * System.out.println("Print the Charecters Repetitive:+"+str.charAt(i)+""+count
		 * ); }
		 */
		str = str.substring(0,3);
		System.out.println("Substring example"+str);
		String a ="1234abc";
		 int b = Integer.parseInt(a);
		System.out.println("Test Result"+b);
	}
}
