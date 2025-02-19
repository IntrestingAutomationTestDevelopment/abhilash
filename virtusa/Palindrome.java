package virtusa;

public class Palindrome {

	public static void main(String[] args) {

		isPalindrome();
	}

	public static void isPalindrome() {
		String str = "Madam";
		str = str.toLowerCase();
		String res = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			res = res + str.charAt(i);

		}
		if (str.equals(res)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not A Palindrome");
		}
	}

}