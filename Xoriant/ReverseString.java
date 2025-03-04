package Xoriant;

public class ReverseString {

	public static void main(String[] args) {
		String str = "QQAENG";
		String rev = "";
		
		for(int i=str.length()-1;i<=0;i--) {
			rev = str.charAt(i)+rev;
		}System.out.println("RESULT" +rev);
	}
}
