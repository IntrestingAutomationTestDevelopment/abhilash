package NTT;

public class ReverseEachWordInAString {
	    public static String reverseEachWord(String input) {
	        String[] words = input.split(" "); // Split the string into words
	        StringBuilder reversedString = new StringBuilder();

	        for (String word : words) {
	            StringBuilder reversedWord = new StringBuilder(word);
	            reversedString.append(reversedWord.reverse().toString()).append(" "); // Reverse each word and add to the result
	        }

	        return reversedString.toString().trim(); // Remove the trailing space
	    }

	    public static void main(String[] args) {
	        String input = "Mere Pyare Bhaarath Desh";
	        String result = reverseEachWord(input);
	        System.out.println(result); // Output: "olleH dlroW"
	    }
	}
