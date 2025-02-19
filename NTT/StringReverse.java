package NTT;

public class StringReverse {

	public static void main(String[] args) {

		reverseAString("Reverse A String");
	}

	public static void reverseAString(String str) {
		String inputStreamEvent = str;
		String outputStreamEvent = "";
		System.out.println("" + inputStreamEvent.length());
		for (int i=inputStreamEvent.length()-1;i>=0;i--) {
			outputStreamEvent+=inputStreamEvent.charAt(i);
			// outputStreamEvent+
		}
		System.out.println("Result::: " + outputStreamEvent);

	}

}
