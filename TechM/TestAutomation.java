package TechM;

public class TestAutomation {

	public static void test() {
		
		System.out.println("QA Automation Test 1");
	}

	public static void main(String args[]) {
		// test();
	//	reverseString();
		//countRepetitiveCharactersInAString();
		countCharRep();
	}

	public static void reverseString() {
		String str = "The Test Automation";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("Result:" + rev);
	}

	public static void countRepetitiveCharactersInAString() {
		String str = "Test Input";
		char[] ch = str.toCharArray();
		System.out.println("QA"+ch);
		System.out.println("Test"+ch);
		int count = 0;
		for (int i = 0; i <= ch.length; i++) {
			for (int j = i + 1; j <= str.length()-1; j++) {
				
				System.out.println(ch[i]);
				
				/*
				 * if (ch(i) == ch(j)) { System.out.println("Test"); }
				 */
				count++;
			}
			
		}
		System.out.println("Count of repetitive characters in a String : " + count);
	}
	/**
	 * Using Enhanced for Loop
	 */
	public static void countCharRep() {
		char[] charArray = { 'C', 'h', 'e', 'c', 'k' };

		for (char c : charArray) {
			System.out.println(c);

		}
		for (int i = 0; i < charArray.length; i++)
			if (charArray[i] == charArray[i + 1]) {

			}

	}
	
	public static void checkRepetitiveValuesInAnIntegerArray() {
		int a1[] = { 1, 2, 3, 4, 5 };
		int a2[] = { 6, 7, 8, 9 };
		int count =0;
		for (int i=0; i<=a1.length-1;i++) {

			for (int j=i+1;j<=a2.length-1;j++) {
				
				if(a1[i]==a2[j]) {
				count++;
				System.out.println("Result :" + a1 + "" +count);
				}
			}
		}
	}

	public static void reverseWordsInAstring() {
		String str = "Test";

	}
}
