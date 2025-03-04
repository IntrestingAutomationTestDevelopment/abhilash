package NTT;

public class StringReversal {

	public static void main(String[] args) {
		qa();
	}

	public static void qa() {
		String str = "QA Automation Engineer";
		String rev = "";
		for (int i = 0; i <= str.length()-1; i++) {

			rev = str.charAt(i)+rev;
		}
		System.out.println("Reversed String Output is::" + rev);
	}

}
