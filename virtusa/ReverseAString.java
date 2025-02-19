package virtusa;

public class ReverseAString {

	public static void main(String[] args) {
		String str = "TEST";
		String rev = "";
		System.out.println("Length of String: "+ str.length());
	
		for(int i= str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
	System.out.println("Reversed String" +rev);
		
	}
	
}
