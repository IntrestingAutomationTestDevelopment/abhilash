package java;

public class Palindrome {

	public static void validatePalindrome() {
	String str  = "MadaM";
	String res = "";
     
	for(int i=str.length()-1;i>=0;i--) {
		res = res+str.charAt(i);
	}
	System.out.println("Resultant Palindrome : " +res);
	
	 if( str.equals(res) ){
		 System.out.print("Palindrome");
	 }
	}
	public static void main(String[] args) {
		validatePalindrome();
	}
}
